package Prova;

public class Pessoa1 {

        String nome;
        int idade;

        public Pessoa1(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void presente() {
            System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
        }
    }
    class Aluno extends Pessoa {
        String matricula;

        public Aluno(String nome, int idade, String matricula) {

            super(nome, idade);
            this.matricula = matricula;
        }
        public void apresentarse() {
            System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos. Minha matrícula é: " + matricula);
        }
    }


