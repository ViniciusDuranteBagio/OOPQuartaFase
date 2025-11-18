public class Animal {

    String nome;
    double idade;
    String raca;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double geIdade() { return idade; }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() { return raca; }

    public void exibirInformacao() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raca: " + this.raca);
    }
}