package Heranca;

 class Eletronico extends  Produto {
     int garantiaMeses;

     protected Eletronico(String nome, double preco, int garantiaMeses) {
         super(nome, preco);
         this.garantiaMeses = garantiaMeses;


     }
     @Override
     protected void exibirDetalhes(){
         super.exibirDetalhes();
         System.out.println("Garantia Meses: " + garantiaMeses);
     }
 }

