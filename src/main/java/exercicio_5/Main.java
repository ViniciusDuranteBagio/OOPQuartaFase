package exercicio_5;

public class Main {
    public static void main(String[] args) {
        String dados = "Finja que aqui tem vários dados";

        IExportador e1 = new PDF();
        IExportador e2 = new CSV();
        IExportador e3 = new XML();

        IExportador[] exportadores = { e1, e2, e3 };

        for (IExportador e : exportadores) {
            e.exportar(dados);
        }

    }
}