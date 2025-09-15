package AtividadesAula05;

public class Csv implements Exportadores {
    @Override
    public void exportar(String dados){
        System.out.println("Exportando dados para CSV: " + dados);
    }
}
