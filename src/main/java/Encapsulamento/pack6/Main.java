package Encapsulamento.pack6;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("O pequeno principe", "não sei", 1990);

        l1.setAutor("Danilo Kindermann");
        l1.setAno(2005);
        l1.setTitulo("Louco e sonhador");


        l1.exibirDetalhes();
    }
}
