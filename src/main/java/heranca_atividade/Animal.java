package heranca_atividade;

public class Animal {
    protected String nome;
    protected int idade;

    public void dormir(){
        System.out.println("o animal " + nome + " esta dormindo!!");
    }

    public void exibirInfo(){
        System.out.println("nome : " + nome +
                "\nidade : " + idade);
    }
}
