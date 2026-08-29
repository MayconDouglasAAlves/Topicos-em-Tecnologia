package com.avaliativo.prototipoMarvel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CadastroController {

    @GetMapping("/pagina1")
    public String pagina1() {
        return "pagina1";
    }

    @GetMapping ("/pagina2")
    public String Pagina2() {
        return "pagina2";
    }

    @PostMapping("/pagina3")
    public String Pagina3(
            @RequestParam String titulo,
            @RequestParam String anoLancamento,
            @RequestParam String diretor,
            @RequestParam String duracao,
            @RequestParam String genero,
            Model model) {
        model.addAttribute ("titulo", titulo);
        model.addAttribute ("anoLancamento", anoLancamento);
        model.addAttribute ("diretor", diretor);
        model.addAttribute ("duracao", duracao);
        model.addAttribute ("genero", genero);
        return "pagina3";
    }
}
