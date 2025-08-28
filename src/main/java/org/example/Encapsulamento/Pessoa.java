package main.java.org.example.Encapsulamento;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;
    private long cpf;
    public Pessoa(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;


    }
    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }
    public void nome1 (){
       String nome1 =  JOptionPane.showInputDialog("Escreva seu nome").toUpperCase();
        this.nome = nome1;
    }
    public void idade1 (){
       String idade1 = JOptionPane.showInputDialog("Escreva seu idade");
        this.idade = Integer.parseInt(idade1);
    }
    public void cpf1 (){
        long cpf1 =   Long.parseLong(JOptionPane.showInputDialog("Escreva seu CPF"));
        this.cpf = cpf1;

        }
    }


