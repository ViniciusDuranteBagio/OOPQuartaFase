package exercicios_aula_5.exercicio_5;

public class PDF implements IExportador{
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando em PDF: " + dados);
        System.out.println(" ");
    }
}
