public class ErroComException extends Exception {
        private int codigoErro;

        public ErroComException(int codigoErro, String mensagem) {
            super(mensagem);
            this.codigoErro = codigoErro;
        }
        public int getCodigoErro() {
            return codigoErro;
        }
    }
