public class Validadores {

    public static void validarNome(String nome) throws NomeInvalidoException{
        if(nome == null ||nome.trim().isEmpty()){
            throw new NomeInvalidoException("O nome não pode ser vazio");
        }if(nome.trim().length() <2){
            throw new NomeInvalidoException("O nome deve ter no mínimo 2 letras");
        }if(!nome.matches("[A-Za-zÀ-ú ]+")){
            throw new NomeInvalidoException("O nome deve ter apenas letras e espaços");
        }
    }
    public static int validarIdade(String idadeStr) throws IdadeInvalidaException{
        try{
            int idade = Integer.parseInt(idadeStr);
            if(idade <= 0){
                throw new IdadeInvalidaException("A idade deve ser maior que 0");
            } return idade;
        }catch (NumberFormatException exception){
            throw new IdadeInvalidaException("Idade deve ser um número inteiro válido");
        }
    }
    public static void validarRaca(String raca) throws RacaInvalidaException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new RacaInvalidaException("Raça não pode ser vazia");
        }
        if (!raca.matches("[A-Za-zÀ-ú ]+")) {
            throw new RacaInvalidaException("A raça deve ter apenas letras e espaços");
        }
    }
}
