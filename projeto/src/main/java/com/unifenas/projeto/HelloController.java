package com.unifenas.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    public String Hello() {
        return "index";
    }

    @GetMapping("/pagina1")
    public String Pagina1() {
        return "pagina1";
    }

    @PostMapping("/pagina2")
    public String Pagina2(
            @RequestParam String nome,
            @RequestParam String cidade,
            @RequestParam String idade,
            Model model) {
        model.addAttribute ("nome", nome);
        model.addAttribute ("cidade", cidade);
        model.addAttribute ("idade", idade);
        return "pagina2";
    }


}
