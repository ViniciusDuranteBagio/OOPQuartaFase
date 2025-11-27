package Aula1.Exercicio;

public class Gato extends Animal {
    public Gato(String nome,int idade,String raca)throws ValidacaoException{
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasPossiveis() {
        return new String[0];
    }

}
