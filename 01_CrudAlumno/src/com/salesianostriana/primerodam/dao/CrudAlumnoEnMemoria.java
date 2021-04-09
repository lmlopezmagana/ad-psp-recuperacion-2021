package com.salesianostriana.primerodam.dao;

import com.salesianostriana.primerodam.dao.CrudAlumno;
import com.salesianostriana.primerodam.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CrudAlumnoEnMemoria implements CrudAlumno {

    private List<Alumno> datos;

    public CrudAlumnoEnMemoria() {
        datos = new ArrayList<>();
    }

    @Override
    public List<Alumno> findAll() {
        return Collections.unmodifiableList(datos);
    }

    @Override
    public Alumno findOne(long id) {
        int position = indexById(id);
        return position == -1 ? null : this.datos.get(position);
    }

    @Override
    public void insert(Alumno alumno) {
        this.datos.add(alumno);
    }

    @Override
    public void edit(Alumno alumno) {
        int position = indexById(alumno.getId());
        if (position == -1)
            this.datos.add(alumno);
        else
            this.datos.set(position, alumno);

    }

    @Override
    public void delete(Alumno alumno) {
        int position = indexById(alumno.getId());
        if (position != -1)
            this.datos.remove(position);
    }

    private int indexById(long id) {
        int position = -1;
        for(int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId() == id)
                position = i;
        }
        return position;
    }
}
