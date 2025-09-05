package Prova;

public class Professor extends Pessoa{

    String disciplina;

         public Professor(String nome, int idade, String disciplina) {
            super(nome, idade);
            this.disciplina = disciplina;
        }

        public void Apresentar() {
            System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos. Minha disciplina é: " + disciplina);
        }
    }






