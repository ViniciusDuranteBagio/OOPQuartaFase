package Trabalho;

public class Gato extends Animal {
    String[] listaDoenca = {"PIF(Peritonite Infecciosa Felina)", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite"};

    @Override
    public String[] getListaDoenca() {
        return listaDoenca;
    }
}
