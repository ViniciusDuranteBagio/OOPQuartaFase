package Exercs;

public class Personagem {

    String nomePersonagem;
    int vidaPersonagem;
    int nivelPersonagem;

    void mostarStatus (){
        System.out.println("O " + nomePersonagem + " tem uma vida de: " + vidaPersonagem +
                ". E um nível de: " + nivelPersonagem);
    }
}
