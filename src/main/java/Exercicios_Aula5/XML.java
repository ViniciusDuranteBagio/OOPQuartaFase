package Exercicios_Aula5;

public class XML implements IExportador{
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando em XML: " + dados);
    }
}