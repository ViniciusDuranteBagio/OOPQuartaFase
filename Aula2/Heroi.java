package Aula2;
/* Criando um sistema de personagens jogáveis
Crie uma classe Heroi com atributos nome e classe (ex: guerreiro, mago, arqueiro).
 Crie um metodo lutar() que imprime "O herói atacou!".
Instancie três heróis e faça cada um lutar. */

public class Heroi {
    String nome;
    String classe;

    public Heroi(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
    }

    public void lutar(){
        System.out.println("O herói " + nome + " atacou!");
    }

}
