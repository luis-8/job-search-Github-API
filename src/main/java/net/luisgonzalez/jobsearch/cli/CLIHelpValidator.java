package net.luisgonzalez.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

/**
 * Usada por JCommander para validar argumentos
 * Aquí se utiliza para frenar el parseo de argumentos si se solicitó la ayuda
 */
public class CLIHelpValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean valorActual = Boolean.parseBoolean(value);
        if(valorActual){
            throw new ParameterException("Ayuda solicitada");
        }
    }
}
