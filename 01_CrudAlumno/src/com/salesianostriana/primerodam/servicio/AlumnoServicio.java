package com.salesianostriana.primerodam.servicio;

import com.salesianostriana.primerodam.dao.CrudAlumno;
import com.salesianostriana.primerodam.dao.CrudAlumnoEnFichero;
import com.salesianostriana.primerodam.modelo.Alumno;
import com.salesianostriana.primerodam.dao.CrudAlumnoEnMemoria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlumnoServicio {

    private CrudAlumno crudAlumno;

    public AlumnoServicio() {
        //crudAlumno = new CrudAlumnoEnMemoria();
        crudAlumno = new CrudAlumnoEnFichero();
    }

    public List<Alumno> findAll() {
        return crudAlumno.findAll();
    }

    public Alumno findOne(long id) {
        return crudAlumno.findOne(id);
    }

    public void insert(Alumno alumno) {
        crudAlumno.insert(alumno);
    }

    public void edit(Alumno alumno) {
        crudAlumno.edit(alumno);
    }

    public void delete(Alumno alumno) {
        crudAlumno.delete(alumno);
    }

    public List<Alumno> getByOrdenAlfabetico() {

        return crudAlumno.findAll()
                .stream()
                .sorted(Comparator.comparing(Alumno::getApellidos))
                .collect(Collectors.toUnmodifiableList());
    }

    public List<Alumno> getByEdad() {
        return crudAlumno.findAll()
                .stream()
                .sorted(Comparator.comparing(Alumno::getFechaNacimiento))
                .collect(Collectors.toUnmodifiableList());
    }


}
