import java.security.SecureRandom;

public class GeradorDeSenhaForte {
    public static void main(String[] args) {

        SecureRandom r = new SecureRandom();
        String s = misturar(gerar(r));
        System.out.println("Senha: " + s);
    }

    private static String gerar(SecureRandom r) {
        String base = new String(new char[]{
                'A','a','3','!','k','Z','%','x','7','@','f','Q','*','m','8','&','p','T','?','0',
                'W','b','(',')','R','y','^','2','s','L','+','=','g','U','{','}','c','4','>','<',
                'E','d','-','_','#','5','V','i','[',']','o','1','j','Y','/','h','9','C',':', ';'
        });

        int n = 65 + r.nextInt(742);
        StringBuilder sb = new StringBuilder();

        for (int z = 0; z < n; z++) {
            sb.append(base.charAt(r.nextInt(base.length())));
        }

        return sb.toString();
    }

    private static String misturar(String s) {
        char[] a = s.toCharArray();
        SecureRandom r = new SecureRandom();
        for (int i = 0; i < a.length; i++) {
            int j = r.nextInt(a.length);
            char tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        return new String(a);
    }
}
