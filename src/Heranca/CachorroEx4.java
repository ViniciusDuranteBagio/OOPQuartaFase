package Heranca;

 class CachorroEx4 extends AnimalEx4{
     protected CachorroEx4(String nome, int idade) {
         super(nome, idade);
     }

     protected void latir(){
        System.out.println("O cachorro está latindo");
    }
    @Override
     protected void exibir(){
         super.exibir();
         latir();
    }
    protected void brincar(){

        System.out.println("O cachorro " + nome + " está brincando");
    }
}
