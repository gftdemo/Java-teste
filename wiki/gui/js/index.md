```markdown
# Documentação do Código

## Variáveis Globais

`const PATH = "http://localhost:8080/ds?data=";`

- `PATH`: Representa o caminho (URL) para a requisição.

## Funções

### atualizaDiaDaSemana()

Esta função é responsável por enviar uma requisição `GET` ao servidor e atualizar o conteúdo do elemento HTML com o id `resultado` com o dia da semana extraído da resposta do servidor.

### dataCorrente()

Esta função é usada para setar a data atual do sistema na tag `input` da página principal (`index.html`).

### extraiDiaDaSemanaDaResposta(resposta)

Esta função recebe a resposta do servidor como argumento e extrai o dia da semana. A resposta do servidor é assumida como um objeto JSON, que possui uma propriedade `diaDaSemana`.

### formataDiaOuMes(n)

Esta função recebe um número representando um dia ou um mês e retorna uma string formatada com dois dígitos. Se o número já tiver dois dígitos, ele é retornado como está. Se tiver apenas um dígito, um zero é adicionado à esquerda.

### formataAno(n)

Esta função recebe um número representando um ano e retorna uma string formatada com quatro dígitos. Se o número já tiver quatro dígitos, ele é retornado como está. Se tiver menos dígitos, zeros são adicionados à esquerda até que a string tenha quatro dígitos.

### formataData(data)

Esta função recebe uma data no formato `ano-mes-dia` e retorna a data no formato `dia-mes-ano`. A formatação do dia, mês e ano é feita usando as funções `formataDiaOuMes` e `formataAno`.
```
