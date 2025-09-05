package Prova;


    public class Gato extends Animal {


        public Gato(String nome3, int idade3) {
            super(nome3, idade3);
        }

        @Override
        public void fazerSom() {
            System.out.println(getNome3() + ", " + getIdade3() + " anos, está miando: Miauuuuuu au au au");
        }}
}
