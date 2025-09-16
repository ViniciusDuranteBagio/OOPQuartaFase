package exercicios;

public class ExportadoresArquivo {
    public static void main(String[] args) {
        Exportador pdf = new PDFExportador();
        Exportador csv = new CSVExportador();
        Exportador xml = new XMLExportador();

        String dados = "Dados de exemplo para exportação";

        pdf.exportar(dados);
        csv.exportar(dados);
        xml.exportar(dados);
    }
}
