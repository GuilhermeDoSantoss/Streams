package br.com.guilherme.streams;

import java.util.Comparator;
import java.util.List;

public class Dia08 extends DiaGenerico{
    @Override
    public void executarDesafio(List<Pessoa> lista) {

        lista.stream().map(p->Utilitarios.fromPessoaToUsuario(p))
                .filter(u->u.email().contains("@gmail.com"))
                .sorted(Comparator.comparing(Usuario::email))
                .toList()
                .forEach(u->System.out.println(u));
    }
}
