package org.example;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para PDF...");
        System.out.println("[PDF] " + dados);
    }
}
