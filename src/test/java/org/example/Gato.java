package org.example;

public class Gato extends  Animal{
    public Gato(String nome, int idade, String raca){
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoenca(){
        return new String[]{"PIF(Peritonite Infecciosa Felina)",
                            "Rinotraqueíte",
                            "Calicivirose",
                            "Panleucopenia",
                            "Otite"};
    }

}
