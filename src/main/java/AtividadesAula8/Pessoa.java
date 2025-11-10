package AtividadesAula8;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean ehMaiorDeIdade(){
        if (idade < 18){
            return false;
        } else return true;
    }
}
