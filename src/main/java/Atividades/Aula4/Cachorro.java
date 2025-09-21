package Atividades.Aula4;

import javax.swing.*;

public class Cachorro extends Animal{

    Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    protected void  latir(){
        JOptionPane.showMessageDialog(null, "O cachorro está latindo");
    }
    protected  void brincar(){
        JOptionPane.showMessageDialog(null, "O cachorro" + nome +"está brincando!");
    }
}
