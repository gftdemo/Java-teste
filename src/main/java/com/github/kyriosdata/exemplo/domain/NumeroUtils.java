/**
 * Copyright (c) 2019
 * Fábrica de Software - Instituto de Informática
 * Fábio Nogueira de Lucena
 */

package com.github.kyriosdata.exemplo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementa conversão de valor inteiro em representação textual
 * (por extenso).
 */
public final class NumeroUtils {

    /**
     * Valor empregado em várias operações para obtenção de dezenas,
     * dentre outras.
     */
    private static final int cem = 100;

    /**
     * Limite a partir do qual tem-se regras genéricas para produção da
     * representação textual correspondente.
     */
    private static final int limiteDezenas = 19;

    /**
     * Texto correspondente a centenas onde o índice de valor 1 identifica
     * "cento", 2 identifica "duzentos" e assim por diante. Apenas os valores
     * de 1 até 9, inclusive, são utilizados.
     */
    private static final String[] centenas = {
            "", "cento", "duzentos", "trezentos",
            "quatrocentes", "quinhentos", "seiscentos", "setecentos",
            "oitocentos", "novecentos"
    };

    /**
     * Unidades no singular em potências de 1.000. O índice 1 identifica
     * "mil", 2 identifica "milhão", 3 identifica "bilhão", 4 identifica
     * "trilhão".
     */
    private static String[] singular = {
            "", "mil", "milhão", "bilhão", "trilhão"
    };

    /**
     * O mesmo que o parâmetro {@code #singular}, exceto que a representação
     * das unidades segue no plural.
     */
    private static String[] plural = {
            "", "mil", "milhões", "bilhões", "trilhões"
    };

    /**
     * Representação textual das dezenas. Para o índice 2, primeiro índice
     * válido, tem-se "vinte", para 3 tem-se "trinta" e assim sucessivamente,
     * até o 9 para "noventa".
     */
    private static String[] dezenas = {"", "", "vinte", "trinta",
            "quarenta", "cinquenta", "sessenta", "setenta",
            "oitenta", "noventa"
    };

    /**
     * Representação textual de todos os numerais menores que vinte e maiores
     * que 0. O índice 1 identifica "um", o índice 2 identifica "dois" e
     * assim sucessivamente. Ou seja, o índice remete ao texto correspondente
     * ao valor do próprio índice.
     */
    private static String[] menorQueVinte = {
            "", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "catorze", "quinze", "dezesseis",
            "dezessete", "dezoito", "dezenove"
    };

    /**
     * Evita criação desnecessária de instância.
     */
    private NumeroUtils() {
    }

    // Restante do código...
}