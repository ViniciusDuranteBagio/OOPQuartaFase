package Exercicios_Aula5;

public class CSV implements IExportador{
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando em CSV: " + dados);
        System.out.println(" ");
    }
}