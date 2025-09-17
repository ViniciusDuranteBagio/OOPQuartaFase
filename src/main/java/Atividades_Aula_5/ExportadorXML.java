package Atividades_Aula_5;

class ExportadorXML implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para XML: " + dados);

    }
}