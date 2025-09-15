package AtividadesAula05;

public class Pdf implements Exportadores {

    @Override
    public void exportar(String dados){
        System.out.println("Exportando dados para PDF: " + dados);
    }
}
