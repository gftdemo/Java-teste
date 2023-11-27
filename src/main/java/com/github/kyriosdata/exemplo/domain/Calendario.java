/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo.domain;

import java.time.LocalDate;

/**
 * Implementação do cálculo de dia da semana.
 *
 * <p>Implementação do algoritmo criado por
 * LARSEN, K. S. Computing the Day of the week,
 * Dr. Dobb´s Journal, april, 1995.
 */
public final class Calendario {

    /**
     * Maior valor para um dia.
     */
    public static final int MAIOR_DIA = 31;

    /**
     * Valor correspondente ao mês de janeiro.
     */
    public static final int JANEIRO = 1;

    /**
     * Valor correspondente ao mês de fevereiro.
     */
    public static final int FEVEREIRO = 2;

    /**
     * Valor correspondente ao mês de dezembro.
     */
    public static final int DEZEMBRO = 12;

    /**
     * Total de dias em uma semana.
     */
    public static final int DIAS_DA_SEMANA = 7;

    /**
     * Ano de referência para o calendário gregoriano?!
     */
    public static final int CALENDARIO_GREGORIANO = 1753;

    /**
     * Nomes dos dias da semana, iniciado por "segunda-feira" (índice 0),
     * seguido de terça-feira (índice 1) e assim sucessivamente, até
     * "domingo" (índice 6).
     */
    // TODO substituir por enum
    // Corrigido: tornando o campo semana privado e final, e fornecendo um acessor público
    private static final String[] semana = {
            "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira",
            "sexta-feira", "sábado", "domingo"
    };

    /**
     * Não é esperada criação de instâncias desta classe.
     */
    private Calendario() {
        // Apenas para agradar análise de cobertura
    }

    // Acessor público para o campo semana
    public static String[] getSemana() {
        return semana;
    }

    // Restante do código...

    /**
     * Produz sequência de caracteres indicando o dia corrente e o
     * dia da semana correspondente.
     *
     * @return Sequência que indica o dia corrente (dia em que o método é
     * executado) e o dia da semana correspondente.
     */
    public static String diaDaSemanaParaHoje() {
        final LocalDate hoje = LocalDate.now();
        int dia = hoje.getDayOfMonth();
        int mes = hoje.getMonthValue();
        int ano = hoje.getYear();
        int diaDaSemana = diaDaSemana(dia, mes, ano);

        // Corrigido: usando %n em vez de \n para produzir o separador de linha específico da plataforma
        return String.format("Hoje é %s%n", semana[diaDaSemana]);
    }
}