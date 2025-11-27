public class Cachorro extends Animal {
    
    public Cachorro(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
        this.doencas = new String[]{
            "Cinomose",
            "Parvovirose",
            "Leptospirose",
            "Dermatite",
            "Otite"
        };
    }
}

