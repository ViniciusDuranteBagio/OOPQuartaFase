public class Cachorro extends Animal{

    private static final String[] DOENCAS = {
            "Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"
    };
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade, raca);
    }
    @Override
    public String[] getPossiveisDoencas(){
        return DOENCAS;
    }

    @Override
    public String toString(){
        return "Cachorro\n" + super.toString();
    }
}
