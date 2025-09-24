package org.AtividadesPOO2;
//Atividade01 e 02 HerançaAula04
/*public class Pessoa {
        private String nome;
        private int idade;
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void exibirInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }
class Aluno extends Pessoa {
    private String matricula;
    public Aluno(String nome, int idade, String matricula) {

        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matrícula: " + matricula);
    }
}*/

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
class Aluno extends Pessoa {
    private String matricula;
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matrícula: " + matricula);
    }
}