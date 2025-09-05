package Prova;

public class Main {
    private static Object saldo;

    public static void main(String[] args) {
  carro meucarro= new carro();

        System.out.println(meucarro.ano+ meucarro.marca);

        //numero 2
      Pessoa Apresenta= new Pessoa();
        System.out.println("ola meu nome é" + Apresenta.nome + "e tenho"+ Apresenta.idade + "anos");

        // numero 3
        Produtos produtos = new Produtos();
        System.out.println( produtos.nome +"="+ produtos.preço + "esse é o valor");
        System.out.println( produtos.nome2 +"=" +produtos.preco2 +"esse é o valor");
       // numero 4



       
        // numero 5 Na classe main, crie um objeto Animal e chame o método para fazer som, mostrando o nome a idade do animal, a frase "fez algum som".
        Animal fasersom= new Animal();
        System.out.println("o nome do meu animal é " + fasersom.nome +" ela tem " + fasersom.idade + " anos " +" fez algum som sim "+ fasersom.somdoanimal + "  esse foi o som." );
        // numero 6

            }
        }



