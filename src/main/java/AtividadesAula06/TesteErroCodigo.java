package AtividadesAula06;

public class TesteErroCodigo {
    public static void verificarNumero(int numero) throws ErroCodigoException {
        if (numero <= 0) {
            throw new ErroCodigoException("Número inválido: deve ser maior que zero", 1001);
        } else if (numero > 100) {
            throw new ErroCodigoException("Número muito grande", 1002);
        } else {
            System.out.println("Número válido: " + numero);
        }
    }
}
