package Aula6;

import javax.swing.*;

public class Pessoa  {
   private int idade;

    public void setIdade(int idade) throws IdadeInvalidaException {
       if (idade < 0) {
           throw new IdadeInvalidaException("Idade Negativa! Tente Novamente");
       }
       this.idade = idade;
   }
   public int getIdade() {
        return idade;
   }

    public static void main(String[] args) {
        Pessoa person = new Pessoa();
        boolean idadeValida = false;

        while (!idadeValida) {
            try {
                String input = JOptionPane.showInputDialog("Digite sua idade: ");
                if (input == null){
                    System.out.println("Operação foi cancelada pelo usuário");
                    break;
                }
                int idade = Integer.parseInt(input);
                person.setIdade(idade);

                JOptionPane.showMessageDialog(null,
                        "Idade digitada aceita! " + "\nidade digitada: " + person.getIdade());

                idadeValida = true;
            } catch (IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido");
            }
        }
        System.out.println("Programa finalizado");

    }
}
