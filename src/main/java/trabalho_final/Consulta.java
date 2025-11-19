package trabalho_final;

public class Consulta {
 private final Animal animal;
 private final int tipoAtendimento;        
 private final String doenca;

 public Consulta(Animal animal, int tipoAtendimento, String doenca) {
     this.animal = animal;
     this.tipoAtendimento = tipoAtendimento;
     this.doenca = doenca;
 }

 @Override
 public String toString() {
     String base = animal.toString() + 
                  " | Atendimento: " + TipoAtendimento.getDescricao(tipoAtendimento);
     if (tipoAtendimento == TipoAtendimento.CONSULTA && doenca != null) {
         base += " | Doença: " + doenca;
     }
     return base;
 }

 
 public int getTipoAtendimento() { return tipoAtendimento; }
 public String getDoenca() { return doenca; }
 public Animal getAnimal() { return animal; }
}