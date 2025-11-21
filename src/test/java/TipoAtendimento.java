public enum TipoAtendimento {
    BANHO, TOSA, BANHO_TOSA, CONSULTA;
    public static TipoAtendimento fromString(String s){
        if(s==null) return null;
        s = s.trim().toLowerCase();
        switch(s){
            case "banho": return BANHO;
            case "tosa": return TOSA;
            case "banho e tosa": case "banhoetosa": case "banho_tosa": return BANHO_TOSA;
            case "consulta": return CONSULTA;
            default: return null;
        }
    }
}

