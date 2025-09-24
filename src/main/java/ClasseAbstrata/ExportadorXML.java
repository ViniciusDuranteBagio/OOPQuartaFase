package ClasseAbstrata;

public class ExportadorXML extends Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para XML: " + dados);
    }
}
