package TrabalhoFinal;

public class Gato extends Animal {
    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    public String[] getDoencas() {
        return new String[] {"PIF", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite"};
    }
}
