package classe.src.Exercicio_Aula_2;

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome , String cpf , int idade ){

        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }

    public Pessoa(String nome , int idade ){
        this.nome=nome;
        this.idade=idade;
        this.cpf="Desconhecido";
    }

    public Pessoa(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public void ExibirInformacoes(){
        System.out.println("//// DADOS /////");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }



}
