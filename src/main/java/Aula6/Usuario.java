package Atvd_aula6;

public class Usuario {
    public String nome;

    Usuario(String nomeInicio) throws NomeInvalidoException{
        if (nomeInicio == null || nomeInicio.isEmpty()){
            throw new NomeInvalidoException("O nome não pode ser vazio ou nulo.");
        }

    }
}
