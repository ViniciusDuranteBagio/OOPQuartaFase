package aula05;

public interface Exportador {
    void exportar(String dados);
}


class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para PDF: " + dados);
    }
}


class ExportadorCSV implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para CSV: " + dados);
    }
}


class ExportadorXML implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para XML: " + dados);
    }
}

