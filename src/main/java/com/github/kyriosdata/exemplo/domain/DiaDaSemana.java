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
    private final String nomeDoDia; // Alterado por GFT AI Impact Bot

    /**
     * Cria instância com data e dia da semana correspondente.
     *
     * @param data Data.
     * @param nomeDoDia Dia da semana. // Alterado por GFT AI Impact Bot
     */
    public DiaDaSemana(LocalDate data, String nomeDoDia) { // Alterado por GFT AI Impact Bot
        this.data = data;
        this.nomeDoDia = nomeDoDia; // Alterado por GFT AI Impact Bot
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
    public String getNomeDoDia() { // Alterado por GFT AI Impact Bot
        return nomeDoDia; // Alterado por GFT AI Impact Bot
    }
}