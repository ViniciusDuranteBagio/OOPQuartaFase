package aula05;

public abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularFrete();

    public void exibirResumo() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Frete: R$" + calcularFrete());
    }
}


class Livro extends Produto {
    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 10; // frete fixo
    }
}


class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return preco * 0.05; // 5% do preço
    }
}

// Roupa
class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 15; // frete fixo de 15
    }
}
