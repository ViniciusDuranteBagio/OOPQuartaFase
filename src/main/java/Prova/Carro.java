package Prova;

public class Carro {
    private String marca;
    private int ano;

 public Carro (String marca, int ano) {
     this.ano = ano;
     this.marca = marca;
 }

     public String getMarca () {
         return marca;
     }

     public int getAno () {
         return ano;
     }

     public void setMarca (String marca){
         this.marca = marca;
     }

     public void setAno ( int ano){
         this.ano = ano;
     }
     public void exibirDados(){
         System.out.println( marca);
         System.out.println(ano);
     }
 }

/*
public class Main {
    public static void main(String[] args) {
Carro car = new Carro("Nissa", 2023);
car.exibirDados();
    }
}
*/
