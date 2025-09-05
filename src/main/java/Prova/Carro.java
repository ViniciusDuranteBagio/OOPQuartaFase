package Prova;

public class Carro {

   private  String Marca;
   private  int Ano = 2025;

    public Carro(String marca, String number) {
        Marca = marca;
    }
   public Carro(int ano ){
        Ano = ano;
   }

    public void exibirDetalhes() {
        System.out.println("Marca do carro: " + Marca);
        System.out.println("Ano do carro: " + Ano);
    }
}




