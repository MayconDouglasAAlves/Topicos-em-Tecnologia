package com.example.filmeNet.controller;

import com.example.filmeNet.model.filme.DadosCadastroFilme;
import com.example.filmeNet.model.filme.Filme;
import com.example.filmeNet.model.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/filmes")

public class filmeController {
    @Autowired
    private FilmeRepository repository;

    @GetMapping ("/formulario")
    public String carregaFormulario() {
        return "filmes/formulario";
    }

    @GetMapping("/editar/{id}")
    public String carregaFormularioEdicao(@PathVariable Long id, Model model) {
        model.addAttribute("filme", repository.findById(id).orElseThrow());
        return "filmes/formulario";
    }

    @PostMapping ("/formulario")
    public String cadastraFilme(DadosCadastroFilme dados) {
        Filme F1 = new Filme(dados);
        repository.save(F1);
        return "redirect:/filmes/listagem";
    }

    @GetMapping("/listagem")
    public String carregaListagem(Model model) {
        model.addAttribute("lista",repository.findAll());
        return "filmes/listagem";
    }

    @DeleteMapping("/{id}")
    public String deletaFilme(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/filmes/listagem";
    }

    @PutMapping("/{id}")
    public String atualizaFilme(@PathVariable Long id, DadosCadastroFilme dados) {
        Filme filme = repository.findById(id).orElseThrow();
        filme.atualizaInformacoes(dados);
        repository.save(filme);
        return "redirect:/filmes/listagem";
    }
}
