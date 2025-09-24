package AtvAva;

public class Atv1 {
    String nome(String nome, String sobremenome){
        return nome + " " + sobremenome;
    }

    String nome(String nome, String sobrenome, int idade){
        return nome + " " + sobrenome + " " + idade;
    }

    String nome(String nome, int idade, String nomeMae){
        return nome + " " + idade + " " + nomeMae;
    }

    public static void main(String[] args) {
        Atv1 atv1 = new Atv1();
        System.out.println(atv1.nome("Alan", "Rohling"));
        System.out.println(atv1.nome("Alan", "Rohling", 21));
        System.out.println(atv1.nome("Alan", 21, "Sedineia"));
    }

}
