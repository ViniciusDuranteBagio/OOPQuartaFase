package Prova;

class Professor extends Pessoa {
    String disciplina;
    void apresentar() {
        System.out.println("Ola sou " + nome + ", tenho " + idade + " anos e ensino " + disciplina);
    }
}