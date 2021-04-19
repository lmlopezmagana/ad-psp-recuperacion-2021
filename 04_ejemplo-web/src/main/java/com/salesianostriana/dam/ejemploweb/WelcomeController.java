package com.salesianostriana.dam.ejemploweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping({"/", "/saludo"})
    public String index(Model model) {

        model.addAttribute("saludo", "Hola a los alumnos de 2º DAM");

        return "index.html";
    }

    @GetMapping("/despedida")
    public String bye(Model model) {

        model.addAttribute("despedida", "¡Adios a todos!");

        return "bye.html";
    }

}
