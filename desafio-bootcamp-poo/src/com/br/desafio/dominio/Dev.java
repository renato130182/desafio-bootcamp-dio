package com.br.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    @Getter @Setter
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscrever(Bootcamp bootcamp){}
    public void progredir(){}
    public void calcularTotalXp(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoConcluido);
    }
}
