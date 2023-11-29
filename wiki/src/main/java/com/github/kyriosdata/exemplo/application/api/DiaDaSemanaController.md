```markdown
# Documentação do Código Fonte

## Pacote: com.github.kyriosdata.exemplo.application.api

Este pacote contém o controlador REST que expõe serviço para obtenção do dia da semana para uma data. 

### Classe: DiaDaSemanaController

Esta é uma classe de controlador REST que possui métodos para obter o dia da semana para uma data específica.

#### Método: diaDaSemana(String data)

Este método retorna o dia da semana para a data informada. A data é passada como um parâmetro do tipo String. Se a data não for fornecida ou for inválida, o método usará a data atual. 

Os parâmetros são:

- `data`: Data para a qual se deseja obter o dia da semana. Se não for fornecida ou for inválida, a data atual é usada.

Retorna:

- Dia da semana para a data informada.

#### Método: localDateFromString(String data)

Este método recupera a instância de LocalDate correspondente à sequência de caracteres no formato dd-MM-yyyy. 

Os parâmetros são:

- `data`: Sequência de caracteres no formato dd-MM-yyyy.

Retorna:

- Instância de LocalDate correspondente à sequência de caracteres, ou null, se a sequência não estiver no formato esperado (por exemplo, "01-01-2018").
```
