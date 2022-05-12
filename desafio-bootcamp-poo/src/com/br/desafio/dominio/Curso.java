package com.br.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Curso extends  Conteudo{

    @Getter @Setter
    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO*cargaHoraria;
    }
}
