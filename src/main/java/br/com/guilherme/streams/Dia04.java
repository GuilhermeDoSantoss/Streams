package br.com.guilherme.streams;

import java.util.List;

public class Dia04 extends DiaGenerico {
    @Override
    public void executarDesafio(List<Pessoa> lista) {
        lista.stream().filter(p -> p.getNome().contains("Ana ") && p.getIdade() >= 25 && p.getIdade() <= 70)
                .toList().forEach(p -> System.out.println(p));
    }
}
