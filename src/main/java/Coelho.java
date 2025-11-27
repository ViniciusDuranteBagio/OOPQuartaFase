public class Coelho extends Animal {
    
    public Coelho(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
        this.doencas = new String[]{
            "Mixomatose",
            "Pasteurelose",
            "Sarna Auricular",
            "Pododermatite",
            "Coccidiose"
        };
    }
}

