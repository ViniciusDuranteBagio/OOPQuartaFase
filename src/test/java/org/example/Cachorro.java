package org.example;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoenca(){
        return new String[]{"Cinomose",
                            "Parvovirose",
                            "Leptospirose",
                            "Dermatite",
                            "Otite"};

    }

}
