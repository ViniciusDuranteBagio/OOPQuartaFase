package org.example;
/*
Exercício 3: Criando uma Hierarquia de Veículos

    Crie uma classe Veiculo com os atributos marca e modelo.Depois, crie as subclasses Carro e Moto, cada uma com um atributo específico (quantidadeDePortas para Carro e cilindrada para Moto).

    No main(), crie objetos de Carro e Moto e exiba seus detalhes.
 */
public class veiculo {
    public String marca;
    public String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
