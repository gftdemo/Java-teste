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
        // Incluido por GFT AI Impact Bot: Verificação de null
        if (args == null) {
            throw new IllegalArgumentException("args não pode ser null");
        }
        
        String diaDaSemana = Calendario.diaDaSemanaParaHoje();
        
        // Incluido por GFT AI Impact Bot: Verificação de null
        if (diaDaSemana == null) {
            throw new IllegalStateException("diaDaSemana não pode ser null");
        }
        
        System.out.println(diaDaSemana);
    }

}