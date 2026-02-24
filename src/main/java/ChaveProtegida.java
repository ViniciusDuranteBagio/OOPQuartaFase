import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ChaveProtegida {

    private static final String SALT_B64 = "v6iuzy25SfTtv5OGWvbnVA==";
    private static final String IV_B64   = "EzkeUZFx0r/0G8xefBkmiA==";
    private static final String CHAVE_CIFRADA_B64 = "PevzyCaM6vjB5ffqpS/uVnXYJh6m4EyQnT7Q8Ox0QGu27G8hJNvnVgS3eoe2O5Wq";

    private static final int ITERATIONS = 120_000;
    private static final int KEY_SIZE = 256;

    public static String obterChaveReal(String senhaUsuario) {
        try {

            byte[] salt = Base64.getDecoder().decode(SALT_B64);
            byte[] iv = Base64.getDecoder().decode(IV_B64);
            byte[] chaveCifrada = Base64.getDecoder().decode(CHAVE_CIFRADA_B64);

            PBEKeySpec spec = new PBEKeySpec(senhaUsuario.toCharArray(), salt, ITERATIONS, KEY_SIZE);
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            byte[] keyBytes = skf.generateSecret(spec).getEncoded();
            SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
            byte[] decrypted = cipher.doFinal(chaveCifrada);

            return new String(decrypted, StandardCharsets.UTF_8);

        } catch (Exception e) {
            return null;
        }
    }
}
