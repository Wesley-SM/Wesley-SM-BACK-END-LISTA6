package com.example.demo.controller;

import com.example.demo.model.Estudante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    private List<Estudante> estudantes = new ArrayList<>();

    @PostMapping
    public Estudante cadastrar(@RequestBody Estudante estudante) {
        estudantes.add(estudante);
        return estudante;
    }

    @GetMapping
    public List<Estudante> listarTodos() {
        return estudantes;
    }

    @GetMapping("/{codigo}")
    public Estudante buscarPorCodigo(@PathVariable int codigo) {
        return estudantes.stream()
                .filter(e -> e.codigo() == codigo)
                .findFirst()
                .orElse(null);
    }
}