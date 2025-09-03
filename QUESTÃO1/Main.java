/*Crie uma classe chamada Carro com os atributos marca e ano. Depois, na classe main, crie um objeto dessa classe e atribua valores aos atributos.
Crie um método ExibirDados e mostre esses valores para o usuario.*/


class Carro {
    String marca;
    int ano;

    void ExibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}
public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.ano = 2020;

        meuCarro.ExibirDados();
    }
}