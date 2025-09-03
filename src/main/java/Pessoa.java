public class Pessoa {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: o nome não pode ser vazio.");
        }
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: a idade não pode ser negativa.");
        }
    }


    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos.");
    }
}
