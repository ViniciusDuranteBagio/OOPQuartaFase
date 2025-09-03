package Prova;

public class Professor extends Pessoa {
    String disciplina;

    public Professor(String Nome, int Idade, String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + Nome + ", tenho " + Idade + " anos e leciono " + disciplina + ".");
    }
}
