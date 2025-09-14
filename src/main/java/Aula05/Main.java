package Aula05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //exercicio 1
        System.out.println("========ATIVIDADE 1========\n");
        List<Funcionario> equipe = new ArrayList<>();
        equipe.add(new Desenvolvedor("Junior", 7890.00));
        equipe.add(new Gerente("Joao", 10000.00));
        equipe.add(new Estagiario("John", 890.00));

        for (Funcionario f : equipe) {
            f.exibirDados();
        }
        System.out.println("-----------------------------------------------------------------------\n");

        //atividade 2
        System.out.println("========ATIVIDADE 2========\n");
        List<Veiculos> frota = new ArrayList<>();
        frota.add(new Carro("RYW-2E64", "Corsa 2.0", 3465, 234));
        frota.add(new Moto("SXJ-0J12", "Biz 125", 2345, 100));
        frota.add(new Caminhao("RDZ-2J00", "VM 330", 1000, 300));

        for (Veiculos v : frota) {
            v.exibirDados();
        }
        System.out.println("-----------------------------------------------------------------------\n");

        //atividade 3
        System.out.println("========ATIVIDADE 3========\n");
        List<Ecommerce> vendas = new ArrayList<>();
        vendas.add(new Eletronicos("Fogao 6 bocas", 9800.00));
        vendas.add(new Livro("Sobre a breviedade da vida", 17.99));
        vendas.add(new Roupas("Sometimes Online", 109.99));

        for (Ecommerce e : vendas) {
            e.exibirResumo();
        }
        System.out.println("-----------------------------------------------------------------------\n");

        //atividade 4
        System.out.println("========ATIVIDADE 4========\n");
        List<Pagamento> income = new ArrayList<>();
        income.add(new Boleto("34548434245756734535234"));
        income.add(new Pix("QR code"));
        income.add(new Cartao("588687767898954", "Renan"));

        for (Pagamento p : income) {
            p.processarPagamento(457);
            System.out.println("--------------------");
        }
        System.out.println("-----------------------------------------------------------------------\n");

        //atividade 5
        System.out.println("========ATIVIDADE 5========\n");
        List<Arquivos> arquivos = new ArrayList<>();
        arquivos.add(new Csv());
        arquivos.add(new Pdf());
        arquivos.add(new Xml());

        for (Arquivos a : arquivos) {
            a.exportar("dados");
            System.out.println("--------------------");
        }
        System.out.println("-----------------------------------------------------------------------\n");

        //atividade 6
        System.out.println("========ATIVIDADE 6========\n");
        List<Validar> validadores = new ArrayList<>();
        validadores.add(new Cpf());
        validadores.add(new Email());
        validadores.add(new Cnpj());

        String[] valores = {"12345678901", "teste@email.com", "12345678000199"};

        for (int i = 0; i < validadores.size(); i++) {
            boolean valido = validadores.get(i).validar(valores[i]);
            System.out.println(valores[i] + " é válido? " + valido);
            System.out.println("--------------------");
        }
    }
}