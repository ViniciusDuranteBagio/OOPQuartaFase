package Aula5.Atividade;

public class PDF implements IExportador{
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para PDF...");
        System.out.println("[PDF] " + dados);
        System.out.println("---------------------------");
    }
}
