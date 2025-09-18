package Aula5.Exercicios;

public class ExportadorXML implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para XML: " + dados);
    }
}
