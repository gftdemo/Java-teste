Português

---

# Documentação do Código HTML - Dia da Semana

## Estrutura do HTML

### <!DOCTYPE html>
A declaração do tipo de documento informa ao navegador sobre a versão do HTML do documento.

### <html>
Este é o elemento raiz de uma página HTML.

### <head>
O elemento <head> contém metadados (dados sobre os dados) e links para scripts e folhas de estilo.

#### <meta charset="utf-8" />
Define o conjunto de caracteres para o documento.

#### <meta http-equiv="X-UA-Compatible" content="IE=edge">
Esta tag é usada para definir como o Internet Explorer deve exibir a página.

#### <title>
Define o título do documento que é exibido na barra de título do navegador.

### <body>
Este elemento contém o conteúdo da página web.

#### <body onload="dataCorrente()">
Este evento acontece quando a página termina de carregar. Aqui, ele chama a função `dataCorrente()` que precisa ser definida no arquivo `index.js`.

### <h1>
Define um cabeçalho de nível 1.

### <label for="data">
Define um rótulo para o controle com o ID "data".

### <input type="date" id="data" onchange="atualizaDiaDaSemana()">
Este é um controle de entrada que permite ao usuário selecionar uma data. Quando a data é alterada, a função `atualizaDiaDaSemana()` é chamada.

### <button onclick="atualizaDiaDaSemana();">
Este é um botão que, quando clicado, chama a função `atualizaDiaDaSemana()`.

### <span style="color: blue; font-size: 20pt;" id="resultado">
Este é um elemento span usado para exibir o resultado. O texto dentro deste elemento será de cor azul e terá um tamanho de fonte de 20pt.

## Nota
As funções `dataCorrente()` e `atualizaDiaDaSemana()` precisam ser definidas no arquivo `index.js` para que este código funcione corretamente.