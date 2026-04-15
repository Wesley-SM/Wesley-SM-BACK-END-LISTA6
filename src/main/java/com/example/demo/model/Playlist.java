package com.example.demo.model;



import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int id;
    private String nome;
    private List<Musica> musicas = new ArrayList<>(); // Inicializada para não dar erro

    // Construtor vazio (necessário para o Spring converter o JSON)
    public Playlist() {}

    public Playlist(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters (essenciais para o Spring ler o JSON)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<Musica> getMusicas() { return musicas; }
    public void setMusicas(List<Musica> musicas) { this.musicas = musicas; }
}