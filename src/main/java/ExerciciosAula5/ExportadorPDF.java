package ExerciciosAula5;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para PDF: \"" + dados + "\"");
    }
}