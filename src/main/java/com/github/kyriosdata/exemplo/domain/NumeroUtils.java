public final class NumeroUtils {

    // ... código omitido ...

    public static String porExtenso(int valor) {
        // Incluido por GFT AI Impact Bot: Verificar se o valor é nulo
        if (valor == null) {
            throw new IllegalArgumentException("valor não pode ser nulo");
        }

        // Incluido por GFT AI Impact Bot: Limitar o valor máximo para evitar ataques de DoS
        if (valor < 0 || valor > 1000000) {
            throw new IllegalArgumentException("valor deve ser positivo e menor que 1.000.000");
        }

        if (valor == 0) {
            return "zero";
        }

        return concatenaTrechos(grupos(valor), ", ").trim();
    }

    // ... código omitido ...

    static String concatenaTrechos(List<String> trechos, String separador) {
        // Incluido por GFT AI Impact Bot: Verificar se os trechos são nulos
        if (trechos == null || separador == null) {
            throw new IllegalArgumentException("trechos e separador não podem ser nulos");
        }

        final String ultimo = trechos.remove(trechos.size() - 1);
        final String prefixo = trechos.stream()
                .collect(Collectors.joining(separador));
        return prefixo.isEmpty() ? ultimo : prefixo + " e " + ultimo;
    }

    // ... código omitido ...

}