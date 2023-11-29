Português

# Documentação de Código

## Pacote: com.github.kyriosdata.exemplo.domain

### Classe: DiaDaSemana

Essa classe está dentro do pacote `com.github.kyriosdata.exemplo.domain` e tem como objetivo principal reunir uma data e o dia da semana correspondente. Ela foi criada exclusivamente para ilustrar a resposta via RESTFul API.

A classe `DiaDaSemana` possui dois atributos privados e finais:

- `LocalDate data`: Representa uma data específica.
- `String diaDaSemana`: Representa o dia da semana correspondente à data.

#### Método Construtor: DiaDaSemana(LocalDate data, String diaDaSemana)

Esse é o método construtor da classe. Ele recebe dois parâmetros:

- `LocalDate data`: Representa a data que será associada ao objeto instanciado.
- `String diaDaSemana`: Representa o dia da semana que será associado ao objeto instanciado.

#### Método: LocalDate getData()

Esse método é um getter para o atributo `data`. Ele retorna a data associada ao objeto.

#### Método: String getDiaDaSemana()

Esse método é um getter para o atributo `diaDaSemana`. Ele retorna o dia da semana associado ao objeto.