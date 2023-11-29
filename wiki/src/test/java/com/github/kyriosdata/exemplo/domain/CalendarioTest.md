# Documentação do Código

Este código é uma suite de testes para a classe `Calendario`. Ele verifica a corretude de vários métodos na classe `Calendario` e garante que eles lidem corretamente com várias condições de entrada.

## Pacotes
O código está contido no pacote `com.github.kyriosdata.exemplo.domain`.

## Importações
O código importa a classe `org.junit.jupiter.api.Test`, que fornece funcionalidades para criar testes unitários e a classe `java.time.LocalDate` que é usada para trabalhar com datas.

## Classe `CalendarioTest`
Esta classe contém vários métodos de teste que verificam a funcionalidade da classe `Calendario`.

### Métodos

1. `diaMenorQueUmInvalido()`: Este método testa se a classe `Calendario` lança uma exceção `IllegalArgumentException` quando um dia menor que 1 é passado para o método `diaDaSemana()`.

2. `diaMaiorQue31Invalido()`: Este método testa se a classe `Calendario` lança uma exceção `IllegalArgumentException` quando um dia maior que 31 é passado para o método `diaDaSemana()`.

3. `mesMenorQueUmInvalido()`: Este método testa se a classe `Calendario` lança uma exceção `IllegalArgumentException` quando um mês menor que 1 é passado para o método `diaDaSemana()`.

4. `mesMaiorQue12Invalido()`: Este método testa se a classe `Calendario` lança uma exceção `IllegalArgumentException` quando um mês maior que 12 é passado para o método `diaDaSemana()`.

5. `anoMenorQue1753Invalido()`: Este método testa se a classe `Calendario` lança uma exceção `IllegalArgumentException` quando um ano menor que 1753 é passado para o método `diaDaSemana()`.

6. `anoIgualAoLimiteInferior()`: Este método testa se a classe `Calendario` retorna o dia correto da semana para a data 31/12/1753.

7. `umDiaArbitrarioObtidoDeCalendario()`: Este método testa se a classe `Calendario` retorna o dia correto da semana para uma data arbitrária.

8. `umAnoBissexto()`: Este método testa se a classe `Calendario` retorna o dia correto da semana para uma data em um ano bissexto.

9. `dataInvalidaAnoNaoBissextoNaoVerificaData()`: Este método testa se a classe `Calendario` retorna o dia correto da semana para uma data inválida em um ano não bissexto.

10. `umDiaDistanteParaOsHumanos()`: Este método testa se a classe `Calendario` retorna o dia correto da semana para uma data distante no futuro.

11. `nomesDiasDaSemana()`: Este método testa se a classe `Calendario` tem os nomes corretos para os dias da semana.

12. `diaDaSemanaDeHoje()`: Este método testa se a classe `Calendario` retorna o nome correto do dia da semana para a data atual.

13. `coberturaCemPorCento()`: Este método testa se uma instância da classe `Calendario` pode ser criada com sucesso.