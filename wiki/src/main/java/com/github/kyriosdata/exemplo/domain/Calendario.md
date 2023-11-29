# Documentação do Código Fonte

Este é o código fonte da classe `Calendario` no pacote `com.github.kyriosdata.exemplo.domain`. Esta classe é uma implementação do algoritmo criado por Larsen, K. S. para calcular o dia da semana, publicado na Dr. Dobb's Journal em Abril de 1995.

A classe `Calendario` é uma classe final, o que significa que ela não pode ser estendida.

## Constantes

A classe `Calendario` define várias constantes:

- `MAIOR_DIA`: O maior valor possível para um dia, que é 31.
- `JANEIRO`, `FEVEREIRO` e `DEZEMBRO`: Valores correspondentes aos meses de Janeiro, Fevereiro e Dezembro.
- `DIAS_DA_SEMANA`: O total de dias em uma semana, que é 7.
- `CALENDARIO_GREGORIANO`: O ano de referência para o calendário gregoriano, que é 1753.

## Construtor

A classe tem um construtor protegido que não faz nada. Isto é usado para garantir que nenhuma instância desta classe possa ser criada.

## Array Semana

A classe define um array de Strings chamado `semana`, que contém os nomes dos dias da semana, começando com "segunda-feira" no índice 0 e terminando com "domingo" no índice 6.

## Métodos

### diaDaSemana

O método `diaDaSemana` calcula o dia da semana para uma data fornecida. Ele aceita três parâmetros: dia, mês e ano. O método retorna o índice do dia da semana, com 0 para segunda-feira, 1 para terça-feira, etc.

Se o dia fornecido for inválido (menor que 1 ou maior que 31), o mês for inválido (menor que 1 ou maior que 12), ou o ano for menor que 1753, o método lança uma `IllegalArgumentException`.

### diaDaSemanaParaHoje

O método `diaDaSemanaParaHoje` retorna uma String que indica o dia da semana para a data atual. Ele usa o método `diaDaSemana` para calcular o dia da semana para a data atual, e então retorna uma String formatada que indica o dia da semana.