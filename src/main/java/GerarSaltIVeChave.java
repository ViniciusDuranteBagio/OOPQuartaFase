import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.security.SecureRandom;

public class GerarSaltIVeChave {

    private static final String SENHA = "AchouMesmoQueDeixariaAqui?";  //Senha que peguei lá do gerador.
    private static final String CHAVE_REAL = "12345Confia";  //Chave real da api

    private static final int ITERATIONS = 120_000;
    private static final int KEY_SIZE = 256;

    public static void main(String[] args) throws Exception {

        byte[] salt = new byte[16];
        new SecureRandom().nextBytes(salt);

        PBEKeySpec spec = new PBEKeySpec(SENHA.toCharArray(), salt, ITERATIONS, KEY_SIZE);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        byte[] keyBytes = skf.generateSecret(spec).getEncoded();
        SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");

        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);
        byte[] encrypted = cipher.doFinal(CHAVE_REAL.getBytes(StandardCharsets.UTF_8));

        String saltB64   = Base64.getEncoder().encodeToString(salt);
        String ivB64     = Base64.getEncoder().encodeToString(iv);
        String cipherB64 = Base64.getEncoder().encodeToString(encrypted);

        // Base64 agora faz parte da logística da criptografia, não mais da segurança fajuta que tinha.

        System.out.println("SALT: " + saltB64);
        System.out.println("IV: " + ivB64);
        System.out.println("CHAVE_CIFRADA: " + cipherB64);

        // Após coleta dos dados, passei eles para a minha classe ChaveProtegida.
    }
}
