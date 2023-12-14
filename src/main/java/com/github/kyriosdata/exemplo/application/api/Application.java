package com.github.kyriosdata.exemplo.application.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicação que expede serviços REST.
 */
@SpringBootApplication
public class Application {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Ignorados. Não são usados.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}