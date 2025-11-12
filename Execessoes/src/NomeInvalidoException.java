
    class NomeInvalidoException extends Exception {
        public NomeInvalidoException(String mensagem) {
            super(mensagem);
        }
    }

    class Usuario {
        private String nome;

        public Usuario(String nome) throws NomeInvalidoException {
            if (nome == null || nome.trim().isEmpty()) {
                throw new NomeInvalidoException("Nome não pode ser vazio ou nulo!");
            }
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
}
