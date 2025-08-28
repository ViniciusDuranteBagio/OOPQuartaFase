package org.example.aula01;

public class Lampada {
    boolean acesa =  false;

    public void ligar(){
        acesa = true;
        System.out.println("Sistema de energia:");
        System.out.println("A lampada foi acesa!");
    }
    public void desligar(){
        acesa = false;
        System.out.println("Sistema de energia:");
        System.out.println("A lampada foi apagada!");
    }
}