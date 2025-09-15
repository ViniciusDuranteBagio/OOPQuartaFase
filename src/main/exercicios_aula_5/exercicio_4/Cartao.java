package exercicio_4;

public class Cartao implements IFormaPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Inserindo cartão na maquininha " +
                "\nDigitando Senha" +
                "\nPagamento concluido via cartão de crédito");
        System.out.println(" ");
    }
}
