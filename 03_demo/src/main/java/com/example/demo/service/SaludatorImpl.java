package com.example.demo.service;

import com.example.demo.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaludatorImpl implements Saludator {
    // su nombre como bean es saludatorImpl

    @Autowired
    private Optional<StringUtils> stringUtils;

    @Override
    public String saludar() {
        return "Hola Mundo!";
    }

    @Override
    public String saludar(String nombre) {
        if (stringUtils.isPresent())
            return stringUtils.get().reversed("Hola, " + nombre);
        else
            return "Hola, " + nombre;
    }
}
