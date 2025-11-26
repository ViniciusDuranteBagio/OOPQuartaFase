public class Cachorro extends Animal {

    public static final String[]doenças={
            "Cinomose", "Parvovirose" , "Leptospirose",
                    "Dermatite","Otite"};

    public Cachorro(String nome,double idade,String raça){
        super(nome,idade,raça);
    }
    @Override
    public String[] getDoencas() {
        return doenças;
    }
}
