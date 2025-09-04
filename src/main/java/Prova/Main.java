package Prova;

public class Main {
    public static void main(String[] args) {
        //questao 1 carro
        Carro meuCarro = new Carro("Ford", 1976); // ford corcel 76
        meuCarro.ExibirDados();

        //questao 2
        Pessoa pessoinha = new Pessoa("Creuza", 5); // ford corcel 76
        pessoinha.apresentar();

        //Jeito mais massivo, declarando na mao por atribuição - Questão 3
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nomeProduto = "Capa magnética para pirulitos 0 açúcar";
        produto1.precoProduto = 10;

        produto2.nomeProduto = "Vitaminas para diminuir QI";
        produto2.precoProduto = 200;
        
        produto1.exibirProduto();
        produto2.exibirProduto();

        // questao 4
        ContaBancaria conta = new ContaBancaria("Veron Carlos Ladrón", 1000.00);

        conta.depositar(500);   
        conta.sacar(200);       
        conta.sacar(2000);      // Tentativa de saque maior que o saldo (não permitido)
        conta.depositar(-50);   // Tentativa de depósito inválido (não permitido)
    

        //Jeito maroto - Questão 5
        Animal dinossauro = new Animal("Velociraptor", 550);
        dinossauro.fazerSom();

        //Questão 6
        Pessoa pessoa = new Pessoa("Rebeca", 20);
        pessoa.apresentar(); // essa é o chamado de pessoa, de outra questao inicial, q nao pediu p chamar na main

        Aluno aluno = new Aluno("João", 18, "Sistemas");
        aluno.apresentar(); //o aluno la q sobreescreve

        //questao 7 dos bixo

        Cachorro cachorro = new Cachorro("Superman", 4);
        cachorro.fazerSom();

        Gato gato = new Gato("Batman", 2);
        gato.fazerSom();

        //questao 8 do professor #força
        Professor professor = new Professor("Quitérino Flauvino de Souza Silva", 21, "Educação Física");
        professor.apresentar();

        //questao 9 do funcionario e gerente
        Funcionario funcionario = new Funcionario("Rebeca", 3000.00);
        System.out.println(funcionario.nomeFuncionarioGuerreiro + " recebeu um bônus de R$ " + funcionario.calcularBonus());

        Gerente gerente = new Gerente("Dino da Silva Sauro", 5000.00);
        System.out.println(gerente.nomeFuncionarioGuerreiro + " recebeu um bônus de R$ " + gerente.calcularBonus());

    }
}
