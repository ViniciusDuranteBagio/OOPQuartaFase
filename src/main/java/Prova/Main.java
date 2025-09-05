package Prova;

public class Main {
    public static void main(String[] args) {


                Carro car = new Carro("Nissan", 2023);
                car.exibirDados();


        Produto p1 = new Produto("cupnoodles", 14.50);
        Produto p2 = new Produto("a verdade", 9999.99);
        p1.info();
        p2.info();


        ContaBancaria banco = new ContaBancaria("Victor", 100);
        banco.depositar(50);
        banco.info();
        banco.sacar(100);
        banco.info();


                Pessoa pessoa = new Pessoa("Victor", 22);
                pessoa.apresentar();


                Aluno aluno1 = new Aluno("nivaldo", 24, "5255");
                aluno1.apresentar();


                Animal animal1 = new Animal("demiurgo", 2025);
                Animal animal2 = new Animal("vovó", 99);
                animal1.fazerSom();
                animal2.fazerSom();


                Cachorro dog = new Cachorro("leviatan ", 5);
                Cat cat = new Cat("maki ", 2);
                dog.fazerSom();
                cat.fazerSom();


                Professor prof = new Professor("Eduardoooo", 42, "GUERRA");
                prof.apresentar();


                Funcionario funci = new Funcionario("Jose", 1000);
                Gerente gerente = new Gerente("Marcel", 2000);
                funci.calcBonus();
                gerente.calcBonus();
            }
        }
