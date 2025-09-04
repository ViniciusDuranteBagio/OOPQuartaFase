package Prova;

public class Carro {
    String marca;
    int ano;

    public void ExibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

QUESTAO 2

public class Principal {
    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}


QUESTAO 3

public class Produto {
    String nome;
    double preco;

   public void mostrar
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}


QUESTAO 4
public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}


QUESTAO 5

public class Animal
    String nome;
    int idade;

public void fazerSom
    System.out.println(nome + ",  " + idade  " quantos anos voce tem");
    }


}


QUESTAO 6

public class Pessoa {
    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Olá sou " + nome + ", e tenho " + idade + " anos.");
    }
}
public class Aluno extends Pessoa {
    String matricula;

    @Override
    public void apresentar() {
        System.out.println("Olá sou " + nome + ", tenho " + idade + " anos, e minha matrícula é " + matricula + ".");
    }
}


QUESTAO 7


public class Animal {
    String nome;
    int idade;

    public void fazerSom() {
        System.out.println(nome + ", " + idade + " anos, fez algum som.");
    }
}


public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println(nome + ", " + idade + " anos, latiu: Au Au!");
    }
}


public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println(nome + ", " + idade + " anos, miou: Miau!");
    }
}


QUESTAO 8

public class Professor extends Pessoa {
    String disciplina;

    @Override
    public void apresentar() {
        System.out.println("Olá sou " + nome + ", tenho " + idade + " anos, ensino " + disciplina + ".");
    }
}


QUESTAO 9

public class Funcionario {
    String nome;
    double salario;

    public double calcularBonus() {
        return salario * 0.10;
    }
}

public class Gerente extends Funcionario {
    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}
