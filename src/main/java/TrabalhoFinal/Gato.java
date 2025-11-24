package TrabalhoFinal;

public class Gato extends Animal {

        public Gato (String nome, int idade, String raca) throws ValidacaoException {
            super(nome, idade, raca);
        }
            @Override
            public String[] getDoencas() {
                return new String[]{
                        "PIF",
                        "Rinotraqueíte",
                        "Calicivirose",
                        "Panleucopenia",
                        "Otite" };
            }
        }

