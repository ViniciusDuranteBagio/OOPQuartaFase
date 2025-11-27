package org.example;

public class Validacao {

    public static boolean validarNome(String nome){
        return nome != null && nome.trim().length() >=2;
    }
    public static boolean validarIdade(int idade){
        return idade >0;
    }
    public static boolean validarRaca(String raca){
        return raca != null && !raca.trim().isEmpty();
    }

}
