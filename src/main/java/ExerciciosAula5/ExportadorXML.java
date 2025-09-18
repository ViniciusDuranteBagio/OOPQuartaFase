package ExerciciosAula5;

public class ExportadorXML implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para XML: \"" + dados + "\"");
    }
}