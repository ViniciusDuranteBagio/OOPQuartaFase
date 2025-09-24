package org.AtividadesPOO3;
//Atividade03 PolimorfismoAula05
    public abstract class Produto {
        protected String nome;
        protected double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
        public abstract double calcularFrete();

        public void exibirResumo() {
            System.out.println("Produto: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Frete: R$ " + calcularFrete());
            System.out.println("-------------------------");
        }
    }
    class Livro extends Produto {
    private double peso;

    public Livro(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    @Override
    public double calcularFrete() {
        return peso * 5;
    }
}
    class Eletronico extends Produto {
    private double valorSeguro;
    public Eletronico(String nome, double preco, double valorSeguro) {
        super(nome, preco);
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double calcularFrete() {
        return 20 + valorSeguro * 0.02;
    }
}
    class Roupas extends Produto {
    private String tamanho;

    public Roupas(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public double calcularFrete() {
        return 10;
    }
}