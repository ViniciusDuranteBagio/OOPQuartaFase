//Crie uma classe chamada Carro com os atributos marca e ano.
// Depois, na classe main, crie um objeto dessa classe e atribua valores aos atributos. Crie um método ExibirDados e mostre esses valores para o usuario
package Prova;

public class Carro {

        String marca;
        int ano;

        public Carro(String marca, int ano){
            this.marca = marca;
            this.ano = ano;

        }
        public void ExibirDados(){
            System.out.println("Marca: " + this.marca);
            System.out.println("Ano: " + this.ano);
    }

}

