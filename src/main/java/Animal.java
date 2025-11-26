public class Animal {

    String nome;
    String raca;
    int idade;
    String doencas;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public void setraca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
}