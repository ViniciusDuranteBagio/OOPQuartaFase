package exercicios;

class XMLExportador implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para XML: " + dados);
    }
}