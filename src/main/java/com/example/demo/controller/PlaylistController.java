

package com.exemplo.demo.controller;

import com.example.demo.model.Playlist;
import com.example.demo.model.Musica;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    // Lista em memória para simular o banco de dados
    private List<Playlist> bancoDePlaylists = new ArrayList<>();

    // 1. Criar Playlist
    @PostMapping
    public String criarPlaylist(@RequestBody Playlist novaPlaylist) {
        bancoDePlaylists.add(novaPlaylist);
        return "Playlist criada com ID: " + novaPlaylist.getId();
    }

    // 2. Adicionar Música a uma Playlist existente
    @PostMapping("/{id}/musica")
    public String adicionarMusica(@PathVariable int id, @RequestBody Musica novaMusica) {
        for (Playlist p : bancoDePlaylists) {
            if (p.getId() == id) {
                p.getMusicas().add(novaMusica);
                return "Música '" + novaMusica.nome() + "' adicionada à playlist " + p.getNome();
            }
        }
        return "Erro: Playlist com ID " + id + " não encontrada.";
    }

    // 3. Listar todas as Playlists
    @GetMapping
    public List<Playlist> listarTudo() {
        return bancoDePlaylists;
    }

    // 4. Listar músicas de uma playlist específica
    @GetMapping("/{id}")
    public List<Musica> listarMusicasDaPlaylist(@PathVariable int id) {
        return bancoDePlaylists.stream()
                .filter(p -> p.getId() == id)
                .map(Playlist::getMusicas)
                .findFirst()
                .orElse(null);
    }
}