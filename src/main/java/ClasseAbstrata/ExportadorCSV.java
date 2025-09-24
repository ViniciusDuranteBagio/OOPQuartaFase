package ClasseAbstrata;

public class ExportadorCSV extends Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para CSV: " + dados);
    }
}