package org.example;

public class Consulta {

    private Animal animal;
    private String atendimento;
    private String doencas;

    public Consulta(Animal animal, String atendimento, String doencas){
        this.animal = animal;
        this.atendimento = atendimento;
        this.doencas = doencas;
    }

    public Animal getAnimal(){
        return animal;
    }

    public String getAtendimento(){
        return atendimento;
    }

    public String getDoencas(){
        return doencas;
    }

    public String toString(){
        String dados = "Animal: "+animal.getNome()+" (" +animal.getClass().getSimpleName()+")\n" +
                       "Idade: "+animal.getIdade()+"\n"+"Raça: "+animal.getRaca()+"\n"+
                         "Atendimento: "+atendimento;
        if (atendimento.equalsIgnoreCase("Consulta")){
            dados += "\nDoença: "+ doencas;
        }
        return dados;

    }


}
