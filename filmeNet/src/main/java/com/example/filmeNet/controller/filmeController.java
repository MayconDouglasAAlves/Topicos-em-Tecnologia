package com.example.filmeNet.controller;

import com.example.filmeNet.model.filme.DadosAlteracaoFilme;
import com.example.filmeNet.model.filme.DadosCadastroFilme;
import com.example.filmeNet.model.filme.Filme;
import com.example.filmeNet.model.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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
    public String carregaFormulario(Long id, Model model) {
        if(id != null)
        {
            Filme f1 = repository.getReferenceById(id);
            model.addAttribute("filme",f1);
        }
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

    @DeleteMapping
    @Transactional
    public String removeFilme(Long id) {
        repository.deleteById(id);
        return "redirect:/filmes/listagem";
    }

    @PutMapping("/formulario")
    @Transactional
    public String alteraFilme(DadosAlteracaoFilme dados)
    {
        Filme f1 = repository.getReferenceById(dados.id());
        f1.atualizaDados(dados);
        return "redirect:/filmes/listagem";
    }
}
