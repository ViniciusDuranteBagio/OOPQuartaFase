package Aula6;

    class Pessoa {
        private int idade;

        public void setIdade(int idade) throws IdadeInvalidaException {
            if (idade < 0) {
                throw new IdadeInvalidaException("A idade não pode ser negativa");
            }
            this.idade = idade;
        }

        public int getIdade() {
            return idade;
        }
    }
}
