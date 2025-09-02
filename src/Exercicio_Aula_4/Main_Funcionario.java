package classe.src.Exercicio_Aula_4;

public class Main_Funcionario {
    public static void main(String[] args) {

        Gerente func = new Gerente();

        func.preco=100;
        func.nome="Davi";
        System.out.println(func.Aumentarsalario(5));

    }
}
