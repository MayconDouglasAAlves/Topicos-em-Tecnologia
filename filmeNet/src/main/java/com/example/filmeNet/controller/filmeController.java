package com.example.filmeNet.controller;

import com.example.filmeNet.model.filme.DadosCadastroFilme;
import com.example.filmeNet.model.filme.Filme;
import com.example.filmeNet.model.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
