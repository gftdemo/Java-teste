# Documentação do Dockerfile

Este é um Dockerfile, que é um script de texto que contém todas as instruções necessárias para criar uma imagem Docker. Neste caso, a imagem Docker será usada para rodar uma aplicação Java. Vamos passar por cada linha do script.

```Dockerfile
FROM kyriosdata/jdk11
```
A instrução `FROM` inicia um novo estágio de construção e define a imagem base para as instruções subsequentes. Neste caso, a imagem base é `kyriosdata/jdk11`, que é uma imagem que já tem o JDK 11 instalado.

```Dockerfile
ENTRYPOINT ["java", "-jar", "/app.jar"]
```
A instrução `ENTRYPOINT` permite que você configure um contêiner que será executado como um executável. Aqui, o ENTRYPOINT é configurado para executar `java -jar /app.jar`. Isso significa que, quando o contêiner é iniciado, ele executará o arquivo JAR localizado em `/app.jar`.

```Dockerfile
ADD target/api.jar /app.jar
```
A instrução `ADD` copia novos arquivos, diretórios ou arquivos remotos para o sistema de arquivos do contêiner no caminho especificado. Aqui, `target/api.jar` é o arquivo JAR que queremos adicionar ao contêiner, e `/app.jar` é o local no contêiner onde queremos que o arquivo JAR seja colocado. Em outras palavras, esta instrução está adicionando o arquivo JAR do projeto ao contêiner e renomeando-o para `app.jar`.

Em resumo, este Dockerfile cria uma imagem Docker que, quando executada, iniciará um contêiner que executa o arquivo JAR do aplicativo Java.