package com.salesianostriana;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class EjemploFlatMap {

    public static void main(String[] args) {

        List<Contacto> contactos =
            Arrays.asList(
                    new Contacto("Luismi",
                            Arrays.asList("luismi.lopez@salesianos.edu", "calidad.sevillatri@salesianos.edu")),
                    new Contacto("Ángel",
                       Arrays.asList("angel.naranjo@salesianos.edu", "super.jefe.de.estudios@salesianos.edu"))
            );

        //List<String> emails =
        contactos.stream()
                    .map(Contacto::getEmails)
                    .flatMap(Collection::stream)
                    .forEach(System.out::println);



    }
}
