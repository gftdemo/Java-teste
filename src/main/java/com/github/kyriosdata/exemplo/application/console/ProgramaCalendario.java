/*
 * Copyright (c) 2023.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo.application.console;

import com.github.kyriosdata.exemplo.domain.Calendario;

/**
 * Programa que exibe o dia da semana para o dia em que é executado.
 *
 */
public final class ProgramaCalendario {

    /**
     * Restringe criação de instância.
     */
    private ProgramaCalendario() {
        // Apenas evita criação de instância.
    }

    /**
     * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
     *
     * @param args Ignorados.
     */
    public static void main(final String[] args) {
        String diaDaSemana = Calendario.diaDaSemanaParaHoje(); //Alterado por GFT AI Impact Bot
        if(diaDaSemana != null) { //Incluido por GFT AI Impact Bot
            System.out.println(diaDaSemana);
        } else {
            System.out.println("Erro: dia da semana não encontrado"); //Incluido por GFT AI Impact Bot
        }
    }

}