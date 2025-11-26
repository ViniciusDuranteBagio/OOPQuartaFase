public class Gato extends Animal {
    public Gato(String name, int age, String breed) throws ValidacaoException{
        super(name, age, breed);
    }
    @Override
    public java.util.List<String> getCommonDiseases() {
        return criarListaDoencas("Rinotraqueíte", "Otite", "Calicivirose", "Panleucopenia", "PIF (Peritonite Infecciosa Felina)");
    }
}
