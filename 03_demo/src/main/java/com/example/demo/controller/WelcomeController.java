package com.example.demo.controller;


import com.example.demo.service.Saludator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

    @Autowired
    @Qualifier("saludatorImpl")
    private Saludator saludator;

    /*@Autowired
    public void setSaludator(Saludator saludator) {
        this.saludator = saludator;
    }*/

    /*public WelcomeController(Saludator saludator) {
        this.saludator = saludator;
    }*/

    public void welcome() {
        System.out.println("Demos la bienvenida!!!");
        System.out.println(saludator.saludar("Antonio"));
    }


}
