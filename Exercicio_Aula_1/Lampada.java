package classe.Exercicio_Aula_1;

public class Lampada {

    private boolean acesa=true;
    void  definir(boolean acesa){
        if (acesa==true){
            this.acesa=acesa;
        }else {
            this.acesa=acesa;
        }
    }


        void ligar () {

            if(acesa==true) {
            System.out.println("Lampada foi ligada");
        }
    }


      void desligar(){
        if (acesa == false) {
            System.out.println("Lampada foi desligada");
        }
      }




}
