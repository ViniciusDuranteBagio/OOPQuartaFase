package Atvd_aula6;

public class ValidadorDocumento {

    public void validardoc(String cpf){
        try {
            if (cpf == null || cpf.length() !=14){
                throw new DocumentoInvalidoException("CPF inválido, precisa ter 11 números.");
            }
            System.out.println("CPF válido: "+ cpf);
        }catch (DocumentoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
