package Aula6;
/*Conversão de valor digitado Faça um programa que leia um valor digitado pelo usuário
 e tente converter para número inteiro. Se o valor não for número, trate o erro e peça novamente.
  Classes para criar:
Conversor (metodo que converte texto em numero)*/

import java.util.Scanner;

public class Conversor {
    public int converter (String texto) {
        return Integer.parseInt(texto);
    }
}
