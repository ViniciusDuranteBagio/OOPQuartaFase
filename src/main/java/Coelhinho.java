public class Coelhinho extends Animal{

    public static final String[]doenças={
           " Mixomatose", "Pasteurelose"," Sarna Auricular",
                   " Pododermatite"," Coccidiose"};

    public Coelhinho(String nome,double idade,String raca){
        super(nome,idade,raca);
    }
    @Override
    public String[] getDoencas() {
        return doenças;
    }
}

