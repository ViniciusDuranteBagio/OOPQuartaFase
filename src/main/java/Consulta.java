public class Consulta {

    private Animal animal;
    private String servico;
    private String doenca;

    public Consulta(Animal animal, String servico, String doenca) {
        this.animal = animal;
        this.servico = servico;
        this.doenca = doenca;
    }

    public String toString() {
        return "Animal: " + animal.getNome() +
                " | Raça: " + animal.getRaca() +
                " | Idade: " + animal.getIdade() +
                " | Serviço: " + servico +
                (servico.equals("Consulta") ? " | Doença: " + doenca : "");
    }
}