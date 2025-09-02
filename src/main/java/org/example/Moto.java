//Exercício 3: Criando uma Hierarquia de Veículos
//Crie uma classe Veiculo com os atributos marca e modelo.Depois, crie as subclasses Carro e Moto, cada uma com um atributo específico (quantidadeDePortas para Carro e cilindrada para Moto).
//No main(), crie objetos de Carro e Moto e exiba seus detalhes.

package org.example;

public class Moto extends Veiculo {

    private int cilindrada;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void mostrarMoto() {
        System.out.println("Moto: " + marca + " " + modelo + " com " + cilindrada + " cilindradas");
    }
}

