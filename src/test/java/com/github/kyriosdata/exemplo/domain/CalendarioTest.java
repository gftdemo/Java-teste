/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalendarioTest { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'

    @Test
    void diaMenorQueUmInvalido() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertThrows(IllegalArgumentException.class,
                () -> Calendario.diaDaSemana(0, 8, 2016));
    }

    @Test
    void diaMaiorQue31Invalido() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertThrows(IllegalArgumentException.class,
                () -> Calendario.diaDaSemana(32, 8, 2016));
    }

    @Test
    void mesMenorQueUmInvalido() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertThrows(IllegalArgumentException.class,
                () -> Calendario.diaDaSemana(1, 0, 2016));
    }

    @Test
    void mesMaiorQue12Invalido() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertThrows(IllegalArgumentException.class,
                () -> Calendario.diaDaSemana(1, 13, 2016));
    }

    @Test
    void anoMenorQue1753Invalido() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertThrows(IllegalArgumentException.class,
                () -> Calendario.diaDaSemana(31, 12, 1752));
    }

    @Test
    void anoIgualAoLimiteInferior() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertEquals(0, Calendario.diaDaSemana(31, 12, 1753));
    }

    @Test
    void umDiaArbitrarioObtidoDeCalendario() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertEquals(2, Calendario.diaDaSemana(17, 8, 2016));
    }

    @Test
    void umAnoBissexto() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertEquals(0, Calendario.diaDaSemana(29, 2, 2016));
    }

    @Test
    void dataInvalidaAnoNaoBissextoNaoVerificaData() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertEquals(6, Calendario.diaDaSemana(29, 2, 2015));
    }

    @Test
    void umDiaDistanteParaOsHumanos() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        int diaDaSemana = LocalDate.of(5000, 1, 1).getDayOfWeek().ordinal();
        assertEquals(diaDaSemana, Calendario.diaDaSemana(1, 1, 5000));
    }

    @Test
    void nomesDiasDaSemana() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertEquals(7, Calendario.semana.length);
        assertEquals("segunda-feira", Calendario.semana[0]);
        assertEquals("terça-feira", Calendario.semana[1]);
        assertEquals("quarta-feira", Calendario.semana[2]);
        assertEquals("quinta-feira", Calendario.semana[3]);
        assertEquals("sexta-feira", Calendario.semana[4]);
        assertEquals("sábado", Calendario.semana[5]);
        assertEquals("domingo", Calendario.semana[6]);
    }

    @Test
    void diaDaSemanaDeHoje() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        String hojeStr = Calendario.diaDaSemanaParaHoje();

        // Primeiro dia da semana é domingo, valor 0.
        LocalDate hoje = LocalDate.now();
        int diaDaSemanaJava = hoje.getDayOfWeek().getValue();

        // Ajustando para padrão adotado em Calendario
        int ajustado = (diaDaSemanaJava + 6) % 7;

        assertTrue(hojeStr.contains(Calendario.semana[ajustado]));
    }

    @Test
    void coberturaCemPorCento() { // Alterado por GFT AI Impact Bot: Removido o modificador 'public'
        assertNotNull(new Calendario());
    }
}