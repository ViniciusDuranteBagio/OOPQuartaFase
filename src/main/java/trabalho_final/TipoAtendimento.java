package trabalho_final;
public class TipoAtendimento {

 public static final int BANHO = 1;
 public static final int TOSA = 2;
 public static final int BANHO_E_TOSA = 3;
 public static final int CONSULTA = 4;

 public static String getDescricao(int tipo) {
     return switch (tipo) {
         case BANHO -> "Banho";
         case TOSA -> "Tosa";
         case BANHO_E_TOSA -> "Banho e Tosa";
         case CONSULTA -> "Consulta";
         default -> "Desconhecido";
     };
 }

 public static boolean isValido(int tipo) {
     return tipo >= BANHO && tipo <= CONSULTA;
 }
}