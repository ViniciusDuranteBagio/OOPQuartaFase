package Atvd_aula6;

public class VetorNumeros {
    private  int[] numero = {10,20,30,40,50};

    public int indiceAcesso(int indice){
        try {
            return numero[indice];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Índice inválido. Somente intervalo de 0 a 4 é permitido.");
            return -1;
        }
    }
}
