package br.com.guilherme.streams;

public class Utilitarios {

    public static Usuario fromPessoaToUsuario(Pessoa pessoa){
        return new Usuario(pessoa.getId(), pessoa.getEmail());
    }
}
