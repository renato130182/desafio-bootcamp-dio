package com.br.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Curso {
    @Getter @Setter
    private String titulo;
    @Getter @Setter
    private String descricao;
    @Getter @Setter
    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
