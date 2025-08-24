package encapsulamento;

public class mainAtividades {
    public static void main(String[] args) {

/* conta bancaria

        atividades ativi = new atividades(4562);
        ativi.setTitular("cauã");

        ativi.depositar(250);
        ativi.sacar(210.90);
        ativi.exibirSaldo();

 */

      /*  construtores

        atividades ativi = new atividades("cauã", 20, 1142593445);
        System.out.println(ativi.getCpf());
        System.out.println(ativi.getIdade());
        System.out.println(ativi.getNome());

       */

        /* encapsulamento e validação

        atividades ativi = new atividades();
        ativi.setNome("vaso");
        ativi.setPreco(25.90);
        ativi.setQuantidadeEmEstoque(10);
        ativi.adicionarEstoque(15);
        ativi.vender(7);

        System.out.println("preço : " + ativi.getPreco());
        System.out.println("quantidade em estoque atual : " + ativi.getQuantidadeEmEstoque());

         */

        /* construtor e encapsulamento

        atividades ativi = new atividades("cauã", 247925);
        ativi.setNota(9.5);
        ativi.exibirStatus();

         */

        /* encapsulamento e metodos

        atividades ativi = new atividades();
        ativi.setAltura(7.35);
        ativi.setLargura(8.32);
        ativi.calcularArea();
        ativi.calcularPerimetro();

         */

        /* construtor e encapsulamento avançado */

        atividades ativi = new atividades("baleia azul", "frank" , 1945);
        ativi.exibirDetalhes();

    }
}
