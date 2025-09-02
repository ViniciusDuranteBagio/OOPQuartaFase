//Exercício 3: Criando uma Hierarquia de Veículos
//Crie uma classe Veiculo com os atributos marca e modelo.Depois, crie as subclasses Carro e Moto, cada uma com um atributo específico (quantidadeDePortas para Carro e cilindrada para Moto).
//No main(), crie objetos de Carro e Moto e exiba seus detalhes.

package org.example;

public class Carro extends Veiculo {

    private int quantidadeDePortas;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void mostrarCarro() {
        System.out.println("Carro: " + marca + " " + modelo + " com " + quantidadeDePortas + " portas");
    }
}