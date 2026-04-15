package com.example.demo.service;

import com.example.demo.model.Jogador;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class JogadorService {
    private final String[] nomes = {"Ronaldo", "Lionel", "Cristiano", "Neymar"};
    private final String[] sobrenomes = {"Fenômeno", "Messi", "Ronaldo", "Jr"};

    public Jogador gerarJogadorAleatorio(String time, String posicao) {
        Random rand = new Random();
        String nome = nomes[rand.nextInt(nomes.length)];
        String sobrenome = sobrenomes[rand.nextInt(sobrenomes.length)];
        int idade = rand.nextInt(20) + 18; // Entre 18 e 38 anos

        return new Jogador(nome, sobrenome, idade, posicao, time);
    }
}