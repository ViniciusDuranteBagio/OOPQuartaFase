import javax.swing.*;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            JOptionPane.showMessageDialog(null, "Preço inválido. Insira um valor válido");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida. Insira um valor válido");
        } else {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Insira um valor válido");
        } else {
            quantidadeEmEstoque += quantidade;
            JOptionPane.showMessageDialog(null, "Estoque atualizado. Novo estoque: " + quantidadeEmEstoque);
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Insira um valor válido");
        } else if (quantidade > quantidadeEmEstoque) {
            JOptionPane.showMessageDialog(null, "Estoque insuficiente para venda");
        } else {
            quantidadeEmEstoque -= quantidade; // aqui deve SUBTRAIR
            JOptionPane.showMessageDialog(null, "Venda realizada. Estoque restante: " + quantidadeEmEstoque);
        }
    }
}