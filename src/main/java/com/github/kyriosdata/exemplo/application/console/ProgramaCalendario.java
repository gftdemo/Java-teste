/*
 * Copyright (c) 2023.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo.application.console;

import com.github.kyriosdata.exemplo.domain.Calendario;
import java.util.logging.Logger; // Incluido por GFT AI Impact Bot

/**
 * Programa que exibe o dia da semana para o dia em que é executado.
 *
 */
public final class ProgramaCalendario {

    private static final Logger logger = Logger.getLogger(ProgramaCalendario.class.getName()); // Incluido por GFT AI Impact Bot

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
        logger.info(Calendario.diaDaSemanaParaHoje()); // Alterado por GFT AI Impact Bot
    }

}