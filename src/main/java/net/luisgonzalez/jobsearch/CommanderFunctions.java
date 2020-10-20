package net.luisgonzalez.jobsearch;

import com.beust.jcommander.JCommander;
import java.util.function.Supplier;

public interface CommanderFunctions {
    static <T> JCommander buildCommanderWithName(String cliName, Supplier<T> argumentSupplier){
        JCommander jCommander = JCommander.newBuilder().addObject(argumentSupplier.get()).build();
        jCommander.setProgramName(cliName);
        return jCommander;
    }
}

