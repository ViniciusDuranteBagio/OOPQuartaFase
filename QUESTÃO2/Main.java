class pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

public class Main {
    public static void main(String[] args) {
        pessoa p = new pessoa();
        p.nome = "Darlon";
        p.idade = 22;

        p.apresentar();
    }
}
