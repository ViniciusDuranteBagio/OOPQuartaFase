package Aula5;

public class ExportadorPDF extends Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para PDF...");
        System.out.println("[PDF] " + dados);
    }
}