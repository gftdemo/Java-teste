 ```java
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
    private static final int CEM = 100;

    /**
     * Limite a partir do qual tem-se regras genéricas para produção da
     * representação textual correspondente.
     */
    private static final int LIMITE_DEZENAS = 19;

    /**
     * Texto correspondente a centenas onde o índice de valor 1 identifica
     * "cento", 2 identifica "duzentos" e assim por diante. Apenas os valores
     * de 1 até 9, inclusive, são utilizados.
     */
    private static final String[] CENTENAS = {
            "", "cento", "duzentos", "trezentos",
            "quatrocentos", "quinhentos", "seiscentos", "setecentos",
            "oitocentos", "novecentos"
    };

    /**
     * Unidades no singular em potências de 1.000. O índice 1 identifica
     * "mil", 2 identifica "milhão", 3 identifica "bilhão" e 4 identifica
     * "trilhão".
     */
    private static String[] SINGULAR = {
            "", "mil", "milhão", "bilhão", "trilhão"
    };

    /**
     * O mesmo que o parâmetro {@code #SINGULAR}, exceto que a representação
     * das unidades segue no plural.
     */
    private static String[] PLURAL = {
            "", "mil", "milhões", "bilhões", "trilhões"
    };

    /**
     * Representação textual das dezenas. Para o índice 2, primeiro índice
     * válido, tem-se "vinte", para 3 tem-se "trinta" e assim sucessivamente,
     * até o 9 para "noventa".
     */
    private static String[] DEZENAS = {"", "", "vinte", "trinta",
            "quarenta", "cinquenta", "sessenta", "setenta",
            "oitenta", "noventa"
    };

    /**
     * Representação textual de todos os numerais menores que vinte e maiores
     * que 0. O índice 1 identifica "um", o índice 2 identifica "dois" e
     * assim sucessivamente. Ou seja, o índice remete ao texto correspondente
     * ao valor do próprio índice.
     */
    private static String[] MENOR_QUE_VINTE = {
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

    /**
     * Produz a sequência de caracteres correspondente ao valor fornecido, ou
     * o que é denominado de valor por extenso. Por exemplo, se o valor 10
     * fornecido, então a resposta é "dez".
     *
     * <p>O valor 1.000 produz apenas a sequência "mil".
     * Adicionalmente, 1.001.000 e outros similares, também evitam a
     * expressão "um mil", neste caso, a saída é "um milhão e mil".</p>
     *
     * <p>O separador padrão é ",", exceto para o último separador, por
     * exemplo, "um milhão, mil e um" é a sequência para 1.001.001. </p>
     *
     * @param valor O valor.
     * @return Representação por extenso (textual) do valor fornecido.
     * @throws IllegalArgumentException Se um valor negativo for fornecido.
     */
    public static String porExtenso(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("valor deve ser positivo");
        }

        if (valor