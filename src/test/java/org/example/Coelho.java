package org.example;

public class Coelho extends  Animal{
    public Coelho(String nome, int idade, String raca){
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoenca(){
        return new String[]{"Mixomastose",
                            "Pasteurelose",
                            "Sarna Auricular",
                            "Pododermatite",
                            "Coccidiose"};
    }

}
