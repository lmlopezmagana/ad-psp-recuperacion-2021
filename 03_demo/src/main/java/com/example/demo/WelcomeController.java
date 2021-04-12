package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

    @Autowired
    @Qualifier("saludatorImpl")
    private Saludator saludator;

    public void welcome() {
        System.out.println("Demos la bienvenida!!!");
        System.out.println(saludator.saludar());
    }


}
