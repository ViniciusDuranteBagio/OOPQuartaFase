package Prova;

public class Aluno extends Pessoa {
    //Crie uma classe Aluno que herda de Pessoa e adicione um atributo curso. 
    //Implemente um método apresentar() que sobrescreve o método da classe Pessoa 
    //para incluir o curso na apresentação.
    
    String cursoDoPia;

    public Aluno(String nome, int idade, String cursoDoPia) {
        super(nome, idade);
        this.cursoDoPia = cursoDoPia;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + nomePessoa + ", tenho " + idadePessoa + " anos e meu curso é " + cursoDoPia + ". :D");
    }
    
}
