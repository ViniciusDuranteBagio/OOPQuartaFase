package Aula5.Atividade;

public class CSV implements IExportador{
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para CSV...");
        System.out.println("[CSV] " + dados.replace(" ", ";"));
        System.out.println("---------------------------");
    }
}
