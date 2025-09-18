package Aula5.Atividade;

public class XML implements IExportador{
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando dados para XML...");
        System.out.println("<xml><dados>" + dados + "</dados></xml>");
        System.out.println("---------------------------");

    }
}
