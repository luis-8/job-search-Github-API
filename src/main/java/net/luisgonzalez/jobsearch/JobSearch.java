package net.luisgonzalez.jobsearch;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

import net.luisgonzalez.jobsearch.api.APIFunctions;
import net.luisgonzalez.jobsearch.api.APIJobs;
import net.luisgonzalez.jobsearch.cli.CLIArguments;
import net.luisgonzalez.jobsearch.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class JobSearch {
    public static void main(String[] args) {
        System.out.println("hola");
        JCommander jCommander = CommanderFunctions.buildCommanderWithName("job-search", CLIArguments::newInstance);
        Stream<CLIArguments> streamOfCli = parseArguments(jCommander,args,JCommander::usage)
                .orElse(Collections.emptyList())
                .stream()
                .map(obj -> (CLIArguments) obj);
        Optional<CLIArguments> cliArgumentsOptional = streamOfCli
                .filter(cli -> !cli.isHelp())
                .filter(cli -> cli.getKeyword()!=null)
                .findFirst();
        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(JobSearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }

    public static Optional<List<Object>> parseArguments(JCommander jCommander, String[] arguments, Consumer<JCommander> onError){
        try {
            jCommander.parse(arguments);
            return  Optional.of(jCommander.getObjects());
        }catch (ParameterException paramEx){
            onError.accept(jCommander); //cosumer devuelve ayuda
        }
        return Optional.empty();
    }

    private static Stream<JobPosition> executeRequest(Map<String, Object> params){
        APIJobs apiJobs = APIFunctions.buildAPI(APIJobs.class, "https://jobs.github.com/");
        return Stream.of(params).map(apiJobs::jobs).flatMap(Collection::stream);
    }
}
