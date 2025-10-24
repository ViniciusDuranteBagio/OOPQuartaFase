package Aula6;
/*Faça um programa que cadastre um nome. Se o nome estiver vazio ou nulo, lance erro e trate.
Classes a criar:
Usuario
NomeInvalidoException
 */

public class Usuario {
    public String nome;
    Usuario(String nomeInicial){
        if(nomeInicial== null || nomeInicial.isEmpty()){
            throw new NomeInvalidoException("O nome não pode ser nulo ou vazio");
        }
    }
}
