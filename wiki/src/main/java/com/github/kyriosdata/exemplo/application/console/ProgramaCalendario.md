# Documentação do Código

## Pacote: com.github.kyriosdata.exemplo.application.console

### Classe: ProgramaCalendario

Esta classe é responsável por executar o programa que exibe o dia da semana para o dia em que é executado.

#### Método: ProgramaCalendario (Construtor privado)

Este construtor é privado e restringe a criação de instâncias desta classe. Sua função é apenas evitar a criação de uma instância.

#### Método: main

Este é o ponto de entrada da aplicação. Ele é responsável por iniciar o programa. Este método não recebe nenhum argumento específico (`args`), eles são ignorados neste caso.

Dentro deste método, é feita uma chamada para o método `diaDaSemanaParaHoje()` da classe `Calendario`. O resultado desta chamada é então impresso no console.

#### Classe Usada: Calendario

Este programa usa a classe `Calendario` e especificamente o método `diaDaSemanaParaHoje()`. Este método é responsável por obter o dia da semana atual. 

## Licença

Este código é licenciado sob a Creative Commons Attribution 4.0 International License. 

## Autor

Este código foi criado pela Fábrica de Software do Instituto de Informática (UFG) em 2023. 

Por favor, consulte o código fonte para mais detalhes.