
    class DocumentoInvalidoException extends Exception {
        public DocumentoInvalidoException(String mensagem) {
            super(mensagem);
        }
    }

    class ValidadorDocumento {
        public void validarCPF(String cpf) throws DocumentoInvalidoException {
            if (cpf == null || cpf.length() != 11) {
                throw new DocumentoInvalidoException("CPF inválido! Deve conter 11 números.");
            }
            System.out.println("CPF válido!");
        }

        public void main(String[] args) {
            ValidadorDocumento val = new ValidadorDocumento();

            try {
                val.validarCPF("1234567890"); // 10 dígitos
            } catch (DocumentoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
    }