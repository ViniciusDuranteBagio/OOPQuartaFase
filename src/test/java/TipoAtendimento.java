public class TipoAtendimento {
    public static final String BANHO = "BANHO";
    public static final String TOSA = "TOSA";
    public static final String BANHO_TOSA = "BANHO_TOSA";
    public static final String CONSULTA = "CONSULTA";

    public static String fromString(String s){
        if(s == null) return null;

        s = s.trim().toLowerCase();

        switch (s){
            case "banho": return BANHO;
            case "tosa": return TOSA;
            case "banho e tosa":
            case "banhoetosa":
            case "banho_tosa": return BANHO_TOSA;
            case "consulta": return CONSULTA;
            default: return null;
        }
    }
}


