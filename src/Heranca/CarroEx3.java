package Heranca;

 class CarroEx3 extends VeiculoEx3 {
     int qtdPortas;

     protected CarroEx3(String marca, String modelo, int qtdPortas) {
         super(marca, modelo);
         this.qtdPortas = qtdPortas;
     }
     @Override
     public void exibir() {
         super.exibir();
         System.out.println("Quantidade de portas: " + this.qtdPortas);
     }
 }
