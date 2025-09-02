package Aula2;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Lua", "4567");
        if (u1.verificarSenha("4567")){
            System.out.println("Senha correta!");
        }else{
            System.out.println("Senha incorreta!");
        }
    }
}
