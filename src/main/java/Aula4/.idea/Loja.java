package Aula4;

public class Loja extends Empresa{
    String tipoDeProduto;

    public Loja (String nome, String cidade , String tipoDeProduto){
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }
}
