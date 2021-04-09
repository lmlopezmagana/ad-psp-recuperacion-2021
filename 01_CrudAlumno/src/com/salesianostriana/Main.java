package com.salesianostriana;

import com.salesianostriana.primerodam.modelo.Alumno;
import com.salesianostriana.primerodam.servicio.AlumnoServicio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        AlumnoServicio servicio = new AlumnoServicio();


        servicio.insert(new Alumno(1, "Alejandro", "Vidal Marín", "vidal.maale20@triana.salesianos.edu", LocalDate.of(1998, 10, 14)));
        servicio.insert(new Alumno(2, "Francisco Javier", "Mateos Guillén", "mateos.gufra20@triana.salesianos.edu", LocalDate.of(1999, 1, 28)));
        servicio.insert(new Alumno(3, "Antonio Joaquín", "Montero García", "montero.gaant20@triana.salesianos.edu", LocalDate.of(1999, 10, 27)));


        System.out.println("Alumnos por orden alfabético");
        System.out.println("============================");
        servicio.getByOrdenAlfabetico().forEach(System.out::println);

        System.out.println("\nAlumnos por edad");
        System.out.println("====================");
        servicio.getByEdad().forEach(System.out::println);



    }
}
