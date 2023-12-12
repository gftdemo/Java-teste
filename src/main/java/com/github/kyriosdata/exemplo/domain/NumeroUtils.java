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

    private static final int CEM = 100;
    private static final int LIMITE_DEZENAS = 19;

    private static final String[] CENTENAS = {
            "", "cento", "duzentos", "trezentos",
            "quatrocentes", "quinhentos", "seiscentos", "setecentos",
            "oitocentos", "novecentos"
    };

    private static String[] SINGULAR = {
            "", "mil", "milhão", "bilhão", "trilhão"
    };

    private static String[] PLURAL = {
            "", "mil", "milhões", "bilhões", "trilhões"
    };

    private static String[] DEZENAS = {"", "", "vinte", "trinta",
            "quarenta", "cinquenta", "sessenta", "setenta",
            "oitenta", "noventa"
    };

    private static String[] MENOR_QUE_VINTE = {
            "", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "catorze", "quinze", "dezesseis",
            "dezessete", "dezoito", "dezenove"
    };

    private NumeroUtils() {
    }

    public static String porExtenso(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("valor deve ser positivo");
        }

        if (valor == 0) {
            return "zero";
        }

        List<String> grupos = grupos(valor);
        if(grupos == null) { // Incluido por GFT AI Impact Bot
            throw new IllegalArgumentException("grupos não pode ser nulo"); // Incluido por GFT AI Impact Bot
        }

        return concatenaTrechos(grupos, ", ").trim();
    }

    static String concatenaTrechos(List<String> trechos, String separador) {
        if(trechos == null || trechos.isEmpty()) { // Incluido por GFT AI Impact Bot
            return ""; // Incluido por GFT AI Impact Bot
        }

        final String ultimo = trechos.remove(trechos.size() - 1);
        final String prefixo = trechos.stream()
                .collect(Collectors.joining(separador));
        return prefixo.isEmpty() ? ultimo : prefixo + " e " + ultimo;
    }

    static String seUmMilTroquePorMil(final String trecho) {
        return "um mil".equals(trecho) ? "mil" : trecho;
    }

    private static List<String> grupos(final int valor) {
        List<String> strs = new ArrayList<>();

        for (int posicao = totalDeGrupos(valor) - 1; posicao >= 0; posicao--) {
            int grupo = extraiGrupo(valor, posicao);
            if (grupo != 0) {
                strs.add(seUmMilTroquePorMil(grupoToString(grupo, posicao)));
            }
        }

        return strs;
    }

    static String grupoToString(final int valor, final int posicao) {
        return tresDigitos(valor) + " " + unidade(valor, posicao);
    }

    static String unidade(final int valor, final int posicao) {
        final String[] numero = valor == 1 ? SINGULAR : PLURAL;
        return posicao == 0 ? "" : numero[posicao];
    }

    private static String tresDigitos(final int cdu) {
        if (cdu > CEM) {
            final int du = cdu % CEM;
            final String fmt = du == 0 ? "%s" : "%s e %s";
            return String.format(fmt, CENTENAS[cdu / CEM], doisDigitos(du));
        }

        if (cdu < CEM) {
            return doisDigitos(cdu);
        }

        return "cem";
    }

    private static String doisDigitos(final int du) {
        if (du > LIMITE_DEZENAS) {
            return DEZENAS[du / 10] + umDigito(du % 10);
        }

        return MENOR_QUE_VINTE[du];
    }

    private static String umDigito(final int unidade) {
        return unidade == 0 ? "" : " e " + MENOR_QUE_VINTE[unidade];
    }

    static int extraiGrupo(int valor, int posicao) {
        return (valor / (int) Math.pow(1000, posicao)) % 1000;
    }

    static int totalDeDigitos(final int valor) {
        return (int) (Math.log10(valor) + 1);
    }

    static int totalDeGrupos(final int valor) {
        int totalDigitos = totalDeDigitos(valor);
        return (int) (Math.ceil(totalDigitos / 3.0));
    }
}