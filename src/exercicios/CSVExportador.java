package exercicios;

class CSVExportador implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para CSV: " + dados);
    }
}
