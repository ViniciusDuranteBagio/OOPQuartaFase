package Atividades_Aula_5;

class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para PDF: " + dados);

    }
}
