package br.com.guilherme.streams;

public record Usuario(Integer id, String email) {

    public Usuario fromPessoaToUsuario(Pessoa pessoa){
        return new Usuario(pessoa.getId(), pessoa.getEmail());
    }
}
