package org.example;

public class ExportadorCSV implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para CSV...");
        System.out.println("[CSV] " + dados.replace(";", ","));
    }
}

