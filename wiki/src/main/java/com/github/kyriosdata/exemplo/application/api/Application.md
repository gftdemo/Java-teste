Português

# Documentação do Código

O código a seguir pertence a um projeto de software desenvolvido pela Fábrica de Software do Instituto de Informática (UFG) e está sob a licença Creative Commons Attribution 4.0 International License.

```
/*
 * Copyright (c) 2022.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
```

Este pacote pertence ao módulo de aplicação de API do projeto.

```java
package com.github.kyriosdata.exemplo.application.api;
```

As bibliotecas do `SpringBoot` são importadas para facilitar a criação de aplicações stand-alone com opções mínimas de configuração.

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
```

A aplicação é do tipo `SpringBootApplication`, que é uma conveniência para uma configuração padrão de aplicação Spring. Ela procura por configuração, outras classes de serviço e interfaces REST na mesma package ou abaixo.

```java
/**
 * Aplicação que expõe serviços REST.
 *
 */
@SpringBootApplication
public class Application {

```

O método `main` é o ponto de entrada da aplicação. O array de strings `args` é o parâmetro do método, mas neste caso, ele é ignorado e não é usado na aplicação.

```java
    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Ignorados. Não são usados.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

A chamada `SpringApplication.run(Application.class, args);` inicia a aplicação Spring.