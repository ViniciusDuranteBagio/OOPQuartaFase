package Prova;

public class Carro {
    private String marca;
   private  int ano;

    public Carro(String marca, int ano) {
        this.marca=marca;
        this.ano=ano;
    }
    public void ExibirDados() {
        System.out.println("O ano do carro é "+ano+"\nA marca do carro "+marca);
    }
    }

