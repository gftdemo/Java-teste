/*
 * Copyright (c) 2022.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo.domain;

import java.time.LocalDate;

/**
 * Reúne uma data e o dia da semana correspondente.
 * Criada exclusivamente para ilustrar a resposta via RESTFul API.
 */
public class DiaDaSemana {

    private final LocalDate data;
    private final String diaDaSemana;

    /**
     * Cria instância com data e dia da semana correspondente.
     *
     * @param data Data.
     * @param diaDaSemana Dia da semana.
     */
    public DiaDaSemana(LocalDate data, String diaDaSemana) {
        if(data == null || diaDaSemana == null || diaDaSemana.isEmpty()) { // Incluido por GFT AI Impact Bot
            throw new IllegalArgumentException("Data e dia da semana não podem ser nulos ou vazios"); // Incluido por GFT AI Impact Bot
        }
        this.data = data;
        this.diaDaSemana = diaDaSemana;
    }

    /**
     * Obtém data.
     *
     * @return A data.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Obtém dia da semana.
     *
     * @return O dia da semana para a data.
     */
    public String getDiaDaSemana() {
        return diaDaSemana;
    }
}