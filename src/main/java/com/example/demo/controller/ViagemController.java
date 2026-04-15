package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViagemController {

    @GetMapping("/recomendar")
    public String recomendar(@RequestParam String clima, @RequestParam String estilo) {

        // Validação simples para evitar erro caso venha vazio
        if (clima == null || estilo == null) {
            return "Por favor, informe o clima e o estilo!";
        }

        if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("natureza")) {
            return "Rio de Janeiro";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("aventura")) {
            return "Bariloche";
        } else if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("urbano")) {
            return "Dubai";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("descanso")) {
            return "Gramado";
        }

        return "Destino não encontrado para essa combinação.";
    }
}