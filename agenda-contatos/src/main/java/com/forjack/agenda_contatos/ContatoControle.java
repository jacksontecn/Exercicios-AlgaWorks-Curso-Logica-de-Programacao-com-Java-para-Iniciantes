package com.forjack.agenda_contatos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.UUID;

@Controller
public class ContatoControle {

    private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();

    static {
        LISTA_CONTATOS.add(new Contato("1", "Aline", "+55 81 00000 0000"));
        LISTA_CONTATOS.add(new Contato("2", "Gabriel", "+55 81 00000 0000"));
        LISTA_CONTATOS.add(new Contato("3", "Ana", "+55 81 00000 0000"));
        LISTA_CONTATOS.add(new Contato("4", "Thiago", "+55 81 00000 0000"));
        LISTA_CONTATOS.add(new Contato("5", "Josuel", "+55 81 00000 0000"));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contatos")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("listar");

        modelAndView.addObject("contatos", LISTA_CONTATOS);

        return modelAndView;
    }
    @GetMapping("/contatos/novo")
    public ModelAndView formulario(){
        ModelAndView modelAndView = new ModelAndView("formulario");

        modelAndView.addObject("contato", new Contato());

        return modelAndView;
    }
    @PostMapping("/contatos")
    public String cadastrar(Contato contato){
        String id = UUID.randomUUID().toString();
        contato.setId(id);

        LISTA_CONTATOS.add(contato);

        return "redirect:/contatos";
    }
}
