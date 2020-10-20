package net.luisgonzalez.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    private CLIArguments() {

    }

    @Parameter(
            required = true,
            descriptionKey = "Palabra clave",
            description = "Palabra clave",
            validateWith = CLIKeyWordValidator.class
    )
    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "La busqueda puede incluir un lugar (ciudad, código postal, etc.)"
    )
    private String location;

    @Parameter(
            names = {"--page", "-p"},
            description = "La paginzación devuelve 50 elementos, empieza en cero"
    )
    private int page = 0;

    @Parameter(
            names = {"--fulltime", "-ft"},
            description = "Bandera que especifica si la búsqueda es de tiempo completo"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--markdown", "-md"},
            description = "Bandera que especifica si los resultados se obtienen en MarkDown"
    )
    private boolean isMarkDown = false;

    @Parameter(
            names = {"--help", "-h"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Muestra ayuda"
    )
    private boolean isHelp;

    //similar a singleton: una sola instancia de la clase
    //equivalente a CLIArguments::new
    public static CLIArguments newInstance(){
        return new CLIArguments();
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    public boolean isHelp() {
        return isHelp;
    }
}
