package Prova;

public class Carro {
    //Crie uma classe chamada Carro com os atributos marca e ano. 
    //Depois, na classe main, crie um objeto dessa classe e atribua valores aos atributos. 
    //Crie um método ExibirDados e mostre esses valores para o usuario.

    String marcaCarro;
    int anoLancamento;

    public Carro(String marca, int ano) {
        this.marcaCarro = marca;
        this.anoLancamento = ano;
    }

    void ExibirDados() {
        System.out.println("Marca: " + marcaCarro);
        System.out.println("Ano: " + anoLancamento);
    }
}