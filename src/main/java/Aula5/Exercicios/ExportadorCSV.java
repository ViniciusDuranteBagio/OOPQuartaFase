package Aula5.Exercicios;

public class ExportadorCSV implements Exportador {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando para CSV: " + dados);
    }
}