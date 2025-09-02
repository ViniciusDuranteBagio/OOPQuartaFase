package classe.src.Exercicio_Aula_4;

public class Funcionario {

    protected String nome;
    protected double preco;

    public double Aumentarsalario(double porcentagem){
      double valor= preco * (porcentagem/100);
        preco += valor;
       return preco;
    }
}
