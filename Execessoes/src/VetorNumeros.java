import java.util.Scanner;
public class VetorNumeros {
            private int[] numeros = {10, 20, 30, 40, 50};

            public int getValor(int indice) {
                if (indice < 0 || indice >= numeros.length) {
                    throw new IndexOutOfBoundsException("Índice inválido! Intervalo válido: 0 a " + (numeros.length - 1));
                }
                return numeros[indice];
            }
        }