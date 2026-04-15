package com.example.demo.controller;

import com.example.demo.model.Jogador;
import com.example.demo.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @GetMapping("/{time}/{posicao}")
    public Jogador getJogador(@PathVariable String time, @PathVariable String posicao) {
        return service.gerarJogadorAleatorio(time, posicao);
    }
}