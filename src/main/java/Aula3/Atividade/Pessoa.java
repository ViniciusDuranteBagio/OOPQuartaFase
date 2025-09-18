package Aula3.Atividade;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome,int idade, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }
    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
        this.cpf="Desconhecido";
    }
    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
        this.cpf = "Desconhecido";
    }

    public int getIdade() {
        return idade;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        if (idade <18){
            System.out.println("Idade inválida,é necessário ter ");
        }else{
            this.idade=idade;
        }
    }
    public void exibirInfor(){
        System.out.println("Nome:" + nome +"\nIdade: "+idade+ "\nCPF: " + cpf);

    }
}
