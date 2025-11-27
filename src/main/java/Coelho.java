public class Coelho extends Animal {
    @Override
    public String doencas(){
        String doencas = "\n 1 - Mixomatose" +
                "\n 2 - Pasteurelose" +
                "\n 3- Sarna Auricular" +
                "\n 4- Pododermatite" +
                "\n 5 - Coccidiose" +
                "\n 6 - Não está Doente" +
                "\n 7 - Ele está queimando vivo e sofrendo";
        return doencas;
    }

    @Override
    public String returnDoenca(int doenca){
        String tipoDoenca = "";

        if (doenca == 1) {
            tipoDoenca = "Mixomatosea";
        } else if (doenca == 2) {
            tipoDoenca = "Pasteurelose";
        } else if (doenca == 3) {
            tipoDoenca = "Sarna Auricular";
        } else if (doenca == 4) {
            tipoDoenca = "Pododermatite";
        } else if (doenca == 5) {
            tipoDoenca = "Coccidiose";
        } else if (doenca == 6) {
            tipoDoenca = "Não está Doente";
        }else if (doenca == 7) {
            tipoDoenca = "Ele está queimando vivo e sofrendo.";
        }

        return tipoDoenca;
    }
}
