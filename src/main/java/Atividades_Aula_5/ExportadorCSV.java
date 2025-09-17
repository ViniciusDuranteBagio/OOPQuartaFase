package Atividades_Aula_5;

class ExportadorCSV implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para CSV: " + dados);

    }
}