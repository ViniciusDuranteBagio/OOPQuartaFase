
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    class UsuarioNaoEncontradoException extends Exception {
        public UsuarioNaoEncontradoException(String msg) {
            super(msg);
        }
    }

    class SenhaIncorretaException extends Exception {
        public SenhaIncorretaException(String msg) {
            super(msg);
        }
    }

    class Login {
        private static Map<String, String> usuarios = new HashMap<>();

        static {
            usuarios.put("admin", "1234");
            usuarios.put("baggio", "abcd");
        }

        public void autenticar(String usuario, String senha)
                throws UsuarioNaoEncontradoException, SenhaIncorretaException {
            if (!usuarios.containsKey(usuario)) {
                throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
            }
            if (!usuarios.get(usuario).equals(senha)) {
                throw new SenhaIncorretaException("Senha incorreta!");
            }
            System.out.println("Login realizado com sucesso!");
        }
}