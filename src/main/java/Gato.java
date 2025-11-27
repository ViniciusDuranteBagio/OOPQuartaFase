import javax.swing.*;

public class Gato extends Animal{
    @Override
    public String doencas(){
        String doencas = "\n 1 - PIF (Peritonite Infecciosa Felina)" +
                "\n 2 - Rinotraqueíte" +
                "\n 3- Calicivirose" +
                "\n 4- Panleucopenia" +
                "\n 5 - Otite" +
                "\n 6 - Não está Doente" +
                "\n 7 - Ele está queimando vivo e sofrendo";
        return doencas;
    }

    @Override
    public String returnDoenca(int doenca){
        String tipoDoenca = "";

        if (doenca == 1) {
            tipoDoenca = "PIF (Peritonite Infecciosa Felina";
        } else if (doenca == 2) {
            tipoDoenca = "Rinotraqueíte";
        } else if (doenca == 3) {
            tipoDoenca = "Calicivirose";
        } else if (doenca == 4) {
            tipoDoenca = "Panleucopenia";
        } else if (doenca == 5) {
            tipoDoenca = "Otite";
        } else if (doenca == 6) {
            tipoDoenca = "Não está Doente";
        }else if (doenca == 7) {
            tipoDoenca = "Ele está queimando vivo e sofrendo.";
        }

        return tipoDoenca;
    }
}


