package Aula6;
/*Faça um programa que cadastre um nome. Se o nome estiver vazio ou nulo, lance erro e trate.
Classes a criar:
Usuario
NomeInvalidoException
 */

public class Usuario {
    private String nome;

    public void setNome (String nome) throws NomeInvalidoException {
        if ( nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("O nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }
}
