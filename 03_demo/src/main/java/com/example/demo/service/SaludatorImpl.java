package com.example.demo.service;

import com.example.demo.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludatorImpl implements Saludator {
    // su nombre como bean es saludatorImpl

    @Autowired
    private StringUtils stringUtils;

    @Override
    public String saludar() {
        return "Hola Mundo!";
    }

    @Override
    public String saludar(String nombre) {
        return stringUtils.reversed("Hola, " + nombre);
    }
}
