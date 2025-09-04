package Prova;

  public class Carro {
     String marca;
     int ano;

     protected Carro(String marca, int ano) {
         this.marca = marca;
         this.ano = ano;


     }
     protected void ExibirDados() {
         System.out.println("Marca: " + marca);
         System.out.println("Ano: " + ano);
     }


}
