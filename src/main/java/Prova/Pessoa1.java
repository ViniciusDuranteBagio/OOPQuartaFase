package Prova;

public class Pessoa1 {
    //Questão07
    private String nome;
    private int idade;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
    }
}
public class Aluno extends Pessoa {
    private String matricula;
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void apresentar() {
        System.out.println("Olá, sou " + nome() + ", tenho " + getIdade() +
                " anos e minha matrícula é " + matricula + ".");
    }
}