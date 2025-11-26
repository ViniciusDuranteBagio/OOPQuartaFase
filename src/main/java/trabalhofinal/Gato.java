package trabalhofinal;

import java.util.List;

public class Gato extends Animal{
    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public List <String> getDoencaComum(){
        return super.criarListaDoenca("PIF (Peritonite Infecciosa Felina)",
                "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite");
    }

}
