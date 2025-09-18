package Aula3.Atividade;

import Aula3.Livro;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123,"Lara");
        conta1.depositar(100);
        conta1.depositar(200);
        conta1.sacar(10);
        conta1.sacar(500);


        Pessoa p1 = new Pessoa("Lara",20,"1111111111");
        p1.exibirInfor();



        Produto produto1 = new Produto("Chocolate",6.5,530);
        produto1.vender(800);
        produto1.status();


        Aluno aluno1 = new Aluno("Arthur",123456,1);
        aluno1.exibirStatus();


        Retangulo retangulo1 = new Retangulo(12,1);
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        retangulo1.status();

        Livro livro = new Livro("Trono de Vidro", "Sarah J. Mass", 2013);
        livro.exibirDetalhes();
        livro.setAnoPublicacao(-100);
        livro.setAnoPublicacao(2010);
        livro.exibirDetalhes();
        System.out.println();


    }
}
