package AgendaVeterinario;

public class Cachorro extends Animal {
    @Override
    public String doencas(){
        String doencas = "\n 1 - Cinomose" +
                "\n 2 - Parvovirose" +
                "\n 3- Leptospirose" +
                "\n 4- Dermatite" +
                "\n 5 - Otite" +
                "\n 6 - Não está Doente";
        return doencas;
    }

    @Override
    public String retornaDoenca(int doenca){
        String tipoDoenca = "";

        if (doenca == 1) {
            tipoDoenca = "Cinomose";
        } else if (doenca == 2) {
            tipoDoenca = "Parvovirose";
        } else if (doenca == 3) {
            tipoDoenca = "Leptospirose";
        } else if (doenca == 4) {
            tipoDoenca = "Dermatite";
        } else if (doenca == 5) {
            tipoDoenca = "Otite";
        } else if (doenca == 6) {
            tipoDoenca = "Não está Doente";
        }

        return tipoDoenca;
    }
}
