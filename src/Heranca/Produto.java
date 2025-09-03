package Heranca;

 class Produto {
     String nome;
     double preco;

     protected Produto(String nome, double preco){
         this.nome = nome;
         this.preco = preco;
     }
     protected void exibirDetalhes(){
         System.out.println( nome + " está no valor de: " + preco);
     }


     }




