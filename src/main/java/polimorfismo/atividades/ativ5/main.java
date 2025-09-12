package polimorfismo.atividades.ativ5;

public class main {
    public static void main(String[] args) {

        IExportar PDF = new PDF();
        IExportar CSV = new CSV();
        IExportar XML = new XML();

        PDF.exportar("notas de alunos");
        System.out.println();
        CSV.exportar("dados numericos: 78, 99");
        System.out.println();
        XML.exportar("785615-48");

    }
}
