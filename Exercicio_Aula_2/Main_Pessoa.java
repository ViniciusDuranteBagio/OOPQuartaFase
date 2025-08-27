package classe.Exercicio_Aula_2;

public class Main_Pessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Davi", "117.234.343-22",18);
        Pessoa pessoa2 = new Pessoa("Davi", 18);
        Pessoa pessoa3 = new Pessoa();

        pessoa.ExibirInformacoes();
        pessoa2.ExibirInformacoes();
        pessoa3.ExibirInformacoes();
    }
}
