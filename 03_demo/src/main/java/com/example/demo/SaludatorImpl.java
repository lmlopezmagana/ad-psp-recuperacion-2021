package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SaludatorImpl implements Saludator {

    @Override
    public String saludar() {
        return "Hola Mundo!";
    }

    @Override
    public String saludar(String nombre) {
        return "Hola, " + nombre;
    }
}
