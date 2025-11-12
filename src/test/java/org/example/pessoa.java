package org.example;

public class pessoa {
    private  String nome;
    private int idade;

    public  pessoa(String nomeInicial,int idade){
        this.nome=nomeInicial;
        this.idade=idade;
    }
    public boolean MaiorIdade(){
        return idade>=18;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nomeNV) {
        this.nome = nomeNV;
    }
}
