package Aula05;

public class Pdf implements Arquivos {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando arquivo " + dados + ".pdf");
    }
}
