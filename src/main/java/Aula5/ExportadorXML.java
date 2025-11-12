package Aula5;

public class ExportadorXML implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para XML...");
        System.out.println("<xml><dados>" + dados + "</dados></xml>");
    }
}