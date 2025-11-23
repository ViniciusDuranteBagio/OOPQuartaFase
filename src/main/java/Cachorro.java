public class Cachorro extends Animal {
    public Cachorro(String name, int age, String breed) throws ValidacaoException{
        super(name, age, breed);
    }
    @Override
    public java.util.List<String> getCommonDiseases() {
        return criarListaDoencas("Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite");
    }
}
