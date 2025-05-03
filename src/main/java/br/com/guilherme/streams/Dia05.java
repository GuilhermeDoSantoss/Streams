package br.com.guilherme.streams;

import java.util.Comparator;
import java.util.List;

public class Dia05 extends DiaGenerico{
    @Override
    public void executarDesafio(List<Pessoa> lista) {

        lista.stream().filter(p -> p.getNome().startsWith("Ana "))
                .sorted(Comparator.comparing(Pessoa :: getIdade))
                .toList()
                .forEach(p -> System.out.println(p));
    }
}
