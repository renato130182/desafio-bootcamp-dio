package com.br.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Mentoria {
    @Getter @Setter
    private String titulo;
    @Getter @Setter
    private String descricao;
    @Getter @Setter
    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
