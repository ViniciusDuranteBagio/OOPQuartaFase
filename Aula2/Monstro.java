package Aula2;
/*Criando uma classe Monstro
Crie uma classe chamada Monstro. Ela deve ter os atributos nome e vida.
Ela deve ter um metodo rugir() que imprime "O monstro rugiu!".
Crie um objeto Monstro na classe Main e faça ele rugir.*/

public class Monstro {
    String nome;
    int vida;

    public Monstro(String nome, int vida){      //construtor
        this.nome= nome;
        this.vida= vida;

    }

    public void rugir(){            //metodo
        System.out.println("O monstro rugiu!");
    }
}

