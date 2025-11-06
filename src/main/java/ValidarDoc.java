   class DocumentoInvalidoException extends Exception {
       public DocumentoInvalidoException(String mensagem) {
           super(mensagem);
       }
   }
    class ValidarDoc {
     public void validarCPF(String cpf) throws DocumentoInvalidoException {
            if (cpf == null || !cpf.matches("\\d{11}")) {
                throw new DocumentoInvalidoException("CPF inválido! Deve conter exatamente 11 números.");
            }
            System.out.println("CPF válido: " + cpf);
     }
}
