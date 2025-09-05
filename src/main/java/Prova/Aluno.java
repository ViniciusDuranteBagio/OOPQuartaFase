package Prova;


public class Aluno extends Pessoa {
    private String matricula;


    public Aluno(String nome, int idade1, String matricula) {
        super(nome, idade1);
        this.matricula = matricula;

        @Override
        public void apresentar() {
            System.out.println("Olá, sou " + getNome() + ", tenho " + getIdade1() + " anos e minha matrícula é " + matricula);
        }

    }


    public String getMatricula() {
        return matricula;
    }
}