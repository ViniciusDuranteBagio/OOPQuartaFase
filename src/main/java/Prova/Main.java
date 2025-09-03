package Prova;

import Prova.Pessoa;
import Prova.Aluno;
import Prova.Professor;
import Prova.Carro;
import Prova.Produto;
import Prova.ContaBancaria;
import Prova.Animal;
import Prova.Cachorro;
import Prova.Gato;

class Main {
    public static void main(String[] args) {

        // Carro
        Carro car = new Carro();
        car.Marca = "Hyundai";
        car.Modelo = "HB20";
        System.out.println("Marca: " + car.Marca);
        System.out.println("Modelo: " + car.Modelo);

        System.out.println("\n------------------------------\n");

        // Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.Nome = "Pedro";
        pessoa.Idade = 20;
        pessoa.apresentar();

        // Aluno
        Aluno aluno = new Aluno("Maria", 18, "2025A001");
        aluno.apresentar();

        System.out.println("\n------------------------------\n");

        
        Professor prof = new Professor("Carlos", 45, "Matemática");
        prof.apresentar();

        System.out.println("\n------------------------------\n");

     
        Produto banana = new Produto();
        banana.Nome = "Banana";
        banana.preço = 10.00;

        Produto batata = new Produto();
        batata.Nome = "Batata";
        batata.preço = 999999.00;

        System.out.println("Produto: " + banana.Nome + " | Preço: R$ " + banana.preço);
        System.out.println("Produto: " + batata.Nome + " | Preço: R$ " + batata.preço);

        System.out.println("\n------------------------------\n");

    
        ContaBancaria conta = new ContaBancaria("Pedro", 1000);
        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(1500); 
        conta.depositar(-50); 

        System.out.println("\n------------------------------\n");

        
        Cachorro cachorro = new Cachorro("Rex", 3);
        cachorro.fazerSom();

        Gato gato = new Gato("Mimi", 2);
        gato.fazerSom();
    }
}
