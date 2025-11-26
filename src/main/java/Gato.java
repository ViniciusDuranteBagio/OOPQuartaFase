public class Gato extends Animal {

    public static final String[]doenças={
           "Panleucopeni", "Rinotraqueíte", "Calicivirose",
                 " Otite"," PIF (Peritonite Infecciosa Felina)"
    };

    public Gato(String nome,double idade,String raça){
        super(nome,idade,raça);
    }
    @Override
    public String[] getDoencas() {
        return doenças;
    }
}
