//Exercício 3: Criando uma Hierarquia de Veículos
//Crie uma classe Veiculo com os atributos marca e modelo.Depois, crie as subclasses Carro e Moto, cada uma com um atributo específico (quantidadeDePortas para Carro e cilindrada para Moto).
//No main(), crie objetos de Carro e Moto e exiba seus detalhes.

package org.example;

public class Veiculo {

    protected String modelo;
    protected String marca;

    // Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
