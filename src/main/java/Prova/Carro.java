package Prova;
        /*Crie uma classe chamada Carro com os atributos marca e ano.
        Depois, na classe main, crie um objeto dessa classe e atribua valores aos atributos.
        Crie um método ExibirDados e mostre esses valores para o usuario.*/

public class Carro {

   public String marca;
   public int ano;
    public void ExibirDados() {
        System.out.println("Seu carro é da marca " + marca + ", e foi fabricado no ano de " + ano);

    }
}
