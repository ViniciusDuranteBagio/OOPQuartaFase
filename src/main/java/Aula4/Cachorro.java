package Aula4;

public class Cachorro extends Animal{

    //construtor da classe
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    //metodo latir
    public void latir(){
        System.out.println("O cachorro " + getNome() + " está latindo");
    }

    //metodo brincar exercicio 5
    public void brincar(){
        System.out.println("O cachorro " + getNome() + " está brincando!");
    }

}
