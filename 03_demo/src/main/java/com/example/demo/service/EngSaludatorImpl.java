package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class EngSaludatorImpl implements Saludator{
    @Override
    public String saludar() {
        return "Hello World";
    }

    @Override
    public String saludar(String nombre) {
        return "Hello, " + nombre;
    }
}
