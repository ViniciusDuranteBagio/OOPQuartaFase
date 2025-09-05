package Prova;

    public class Aluno extends Pessoa1 {
        String matricula;

        @Override
        void apresentar() {
            System.out.println(" Olá meu nome é" + nome + " e tenho " + idade + "E minha matrícula é " + matricula);

        }
    }
