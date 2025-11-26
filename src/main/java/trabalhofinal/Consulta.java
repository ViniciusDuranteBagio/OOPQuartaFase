package trabalhofinal;

import java.time.LocalDateTime;

public class Consulta {
    private Animal animal;
    private String tpAtendimento;
    private String doenca;


    public Consulta(Animal animal,  String tpAtendimento, String doenca) {
        this.animal = animal;
        this.tpAtendimento = tpAtendimento;
        this.doenca = doenca;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getTpAtendimento() {
        return tpAtendimento;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setTpAtendimento(String tpAtendimento) {
        this.tpAtendimento = tpAtendimento;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {

        String tpAnimal;

        if (animal instanceof Cachorro) {
            tpAnimal = "Cachorro";
        } else if (animal instanceof Gato) {
            tpAnimal = "Gato";
        } else if (animal instanceof Coelho) {
            tpAnimal = "Coelho";
        } else {
            tpAnimal = "Não Encontrado";
        }

        return "CONSULTA: \n" +
                "Animal" + tpAnimal + "\n" +
                "Nome do Animal: " + animal.getNome() + "\n" +
                "Idade do Animal: " + animal.getIdade() + "\n" +
                "Raça do Animal: " + animal.getRaca() + "\n" +
                "Tipo do Atendimento: " + tpAtendimento + "\n" +
                "Doença: " + (doenca == null ? "Nenhuma" : doenca) + "\n";
    }
}
