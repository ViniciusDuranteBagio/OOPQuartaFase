package Aula1.Exercicio;

public class Consulta {
        private Animal animal;
        private String tipoAtendimento;
        private String doenca;


public Consulta(Animal animal, String tipoAtendimento, String doenca) {
            this.animal = animal;
            this.tipoAtendimento = tipoAtendimento;
            this.doenca = doenca;
        }

    public Animal getAnimal() {
        return animal;
    }

    public String getDoenca() {
        return doenca;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public String toString(){
        String dados = null;
        try {
            dados = "Animal: "+animal.getNome()+" (" +animal.getClass().getSimpleName()+")\n" +
                    "Idade: "+animal.getIdade()+"\n"+"Raça: "+animal.getRaca()+"\n"+
                    "Atendimento: "+tipoAtendimento;
        } catch (ValidacaoException e) {
            throw new RuntimeException(e);
        }
        if (tipoAtendimento.equalsIgnoreCase("Consulta")){
            dados += "\nDoença: "+ doenca;
        }
        return dados;

}


}
