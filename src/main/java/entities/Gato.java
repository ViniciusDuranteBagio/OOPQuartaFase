package entities;

public class Gato extends Animal {

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    public String doenca() {
        return "Doenças comuns: PIF, Rinotraqueíte, Calicivirose, Panleucopenia, Otite";
    }
}