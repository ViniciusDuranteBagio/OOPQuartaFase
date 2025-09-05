package Prova;

public class Aluno extends Pessoa2{
    private String matricula;
        public Aluno(String nome, Integer idade, String matricula) {
            super(nome, idade);
            this.matricula = matricula;
        }

        public String getMatricula() {
            return matricula;
        }

        public void apresentar(){
            System.out.println("Olá, meu nome é " + getNome() + " e tenho " + getIdade() + " anos" + "\nMatricula: " + getMatricula());
    }
}
