package Heranca;

 class MotoEx3 extends VeiculoEx3{
     int qtdCilindradas;

     protected MotoEx3(String marca, String modelo, int qtdCilindradas) {
         super(marca, modelo);
         this.qtdCilindradas = qtdCilindradas;
     }
     public void exibir() {
         super.exibir();
         System.out.println("Quantidade de cilindradas: " + this.qtdCilindradas);
     }
 }
