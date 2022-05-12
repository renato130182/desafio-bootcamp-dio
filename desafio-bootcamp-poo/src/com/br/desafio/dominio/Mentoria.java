package com.br.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    @Getter @Setter
    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO+20d;
    }
}
