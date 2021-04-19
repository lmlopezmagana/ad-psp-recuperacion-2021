package com.salesianostriana.dam.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Task {

    @Id @GeneratedValue
    private long id;

    private String nombre;

    private LocalDate fechaCreacion, fechaCaducidad;

    public Task(String nombre, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.fechaCaducidad = fechaCaducidad;
    }



}
