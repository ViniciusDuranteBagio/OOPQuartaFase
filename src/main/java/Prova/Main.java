package Prova;

public class Main {
    public class Principal {
        public static void main(String[] args) {
            Carro meuCarro = new Carro();
            meuCarro.marca = "Toyota";
            meuCarro.ano = 2015;
            meuCarro.ExibirDados();
        }
    }

}

QUESTAO 2

public class Main {
    public static void main(String[] args) {
        Principal pessoa = new Principal();
        pessoa.nome = "Carlos";
        pessoa.idade = 30;
        pessoa.apresentar();
    }
}


QUESTAO 3

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Camiseta";
        p1.preco = 50;

        Produto p2 = new Produto();
        p2.nome = "Calça";
        p2.preco = 90;

        System.out.println("Produto 1:");
        p1.mostrar();

        System.out.println("\nProduto 2:");
        p2.mostrar();
    }
}


QUESTAO 4

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Marcus";
        conta.saldo = 1000;

        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(1500);

        conta.mostrarSaldo();
    }
}


QUESTAO 5
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.nome = "Rex";
        animal.idade = 5;

        animal.fazerSom();
    }
}


QUESTAO 6

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Maria";
        aluno.idade = 20;
        aluno.matricula = "2023001";

        aluno.apresentar();
    }
}


QUESTAO 7

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Thor";
        cachorro.idade = 3;

        Gato gato = new Gato();
        gato.nome = "Mimi";
        gato.idade = 2;

        cachorro.fazerSom();
        gato.fazerSom();
    }
}


QUESTAO 8

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "João";
        prof.idade = 45;
        prof.disciplina = "Matemática";

        prof.apresentar();
    }
}





QUESTAO 9

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "Carlos";
        f.salario = 3000;
        System.out.println(f.nome + " - Bônus: R$" + f.calcularBonus());

        Gerente g = new Gerente();
        g.nome = "Ana";
        g.salario = 5000;
        System.out.println(g.nome + " - Bônus: R$" + g.calcularBonus());
    }
}


