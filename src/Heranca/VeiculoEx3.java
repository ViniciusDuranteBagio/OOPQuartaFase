package Heranca;

 class VeiculoEx3 {
     String marca;
     String modelo;

     protected VeiculoEx3(String marca, String modelo) {
         this.marca = marca.toUpperCase();
         this.modelo = modelo.toUpperCase();
     }
     protected void exibir(){
         System.out.println("Marca: " + this.marca);
         System.out.println("Modelo: " + this.modelo);
     }
}
