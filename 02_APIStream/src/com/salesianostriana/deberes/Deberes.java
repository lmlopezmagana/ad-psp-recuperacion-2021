package com.salesianostriana.deberes;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Deberes {

    public static void main(String[] args) {

        /*
            1111AAA BMW 15000
            2222BBB AUDI 130000
            3333CCC VOLKSWAGEN 20500
            4444DDD PEUGEOT 50000
            5555EEE CITROEN 75000
            6666FFF FORD 150000
            7777FFF VOLSKWAGEN 7000
         */

        List<Vehiculo> vehiculos =
                Arrays.asList(new Vehiculo("1111AAA", Marca.BMW, 15000),
                              new Vehiculo("2222BBB", Marca.AUDI, 130000),
                              new Vehiculo("3333CCC", Marca.VOLKSWAGEN, 20500),
                              new Vehiculo("4444DDD", Marca.PEUGEOT, 50000),
                              new Vehiculo("5555EEE", Marca.CITROEN, 75000),
                              new Vehiculo("6666FFF", Marca.FORD, 150000),
                              new Vehiculo("7777FFF", Marca.VOLKSWAGEN, 7000)
                        );

        // 1. map

        System.out.println("Ejercicio 1 - Map ");
        System.out.println("======================");
        List<String> matriculas =
                vehiculos.stream()
                    .map(Vehiculo::getMatricula)
                    .distinct()
                    .collect(Collectors.toUnmodifiableList());

        matriculas.forEach(System.out::println);

        // 1. version 2
        String matriculasStr = vehiculos.stream()
                .map(Vehiculo::getMatricula)
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(matriculasStr);

        // 1. version 3
        Set<String> setMatriculas =
                vehiculos.stream()
                    .map(Vehiculo::getMatricula)
                    .collect(Collectors.toCollection(TreeSet::new));

        // 2. filter

        System.out.println("\n\nEjercicio 2 - Filter ");
        System.out.println("=========================");

        //Predicate<Vehiculo> cincuentamil = v -> v.getNumeroKms() >= 50000;
        //Predicate<Vehiculo> esAudi = v -> v.getMarca() == Marca.AUDI;

        List<Vehiculo> ocasion =
                vehiculos.stream()
                            //.filter(cincuentamil.and(esAudi))
                            //.filter(esAudi)
                            .filter(v -> v.getNumeroKms() >= 50000)
                            .collect(Collectors.toList());

        ocasion.forEach(System.out::println);


        // 3. sorted

        System.out.println("\n\nEjercicio 3 - Sorted ");
        System.out.println("=========================");

        List<Vehiculo> ordenadosPorKms =
                vehiculos.stream()
                            //.sorted((v1, v2) -> v2.getNumeroKms()-v1.getNumeroKms())
                            .sorted(Comparator.comparingInt(Vehiculo::getNumeroKms).reversed())
                            .collect(Collectors.toList());

        ordenadosPorKms.forEach(System.out::println);


        // 4. map y distinct

        System.out.println("\n\nEjercicio 4 - Distinct ");
        System.out.println("=========================");


        //List<String> marcas =
        String marcas =
                vehiculos.stream()
                .map(v -> v.getMarca().toString())
                //.map(m -> m.toString())
                .distinct()
                //.collect(Collectors.toList());
                .collect(Collectors.joining(", "));

        //marcas.forEach(System.out::println);
        System.out.println(marcas);


        // 5. map y reduce

        System.out.println("\n\nEjercicio 5 - Map-Reduce ");
        System.out.println("==============================");

        int suma =
                vehiculos.stream()
                            .mapToInt(Vehiculo::getNumeroKms)
                            //.reduce(0, (x1, x2) -> x1 + x2)
                            //.reduce(Integer::sum)
                            .sum();
                            //.getAsInt();
        System.out.println("La suma total es: " + suma);

        double media =
                vehiculos.stream()
                    .mapToInt(Vehiculo::getNumeroKms)
                    .average()
                    .getAsDouble();

        System.out.println("La media de kms es: " + media);

        IntSummaryStatistics estadistica =
                vehiculos.stream()
                .mapToInt(Vehiculo::getNumeroKms)
                .summaryStatistics();

        System.out.printf("La media es %.2f y la suma es %d",
                estadistica.getAverage(),
                estadistica.getSum());


        /* Ejercicio
                Obtén las dos primeras marcas de vehículos
                que tienen coches con menos de 100.000 kms
                en la lista original.
        */


        System.out.println("\n\nEjercicio 6 - Filter - Map - Limit ");
        System.out.println("======================================");

        vehiculos.stream()
                    .filter(v -> v.getNumeroKms() < 100000)
                    .map(Vehiculo::getMarca)
                    .sorted(Comparator.comparing(Marca::toString))
                    //.sorted()
                    .limit(2)
                    .forEach(System.out::println);


    }

}
