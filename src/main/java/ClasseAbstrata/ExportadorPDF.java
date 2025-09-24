package ClasseAbstrata;

public class ExportadorPDF extends Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para PDF: " + dados);
    }
}
