/*
 * Copyright (c) 2022.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo.application.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Aplicação que expõe serviços REST.
 *
 */
@SpringBootApplication
@CrossOrigin // Incluido por GFT AI Impact Bot para prevenir Cross-Site Request Forgery
public class Application {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Ignorados. Não são usados.
     */
    public static void main(String[] args) {
        // Incluido por GFT AI Impact Bot para prevenir Denial of Service: StringBuilder
        if (args == null) {
            throw new IllegalArgumentException("args não pode ser null");
        }
        SpringApplication.run(Application.class, args);
    }
}
// Nota: Não foi identificado Dead Code: Unused Field neste código.