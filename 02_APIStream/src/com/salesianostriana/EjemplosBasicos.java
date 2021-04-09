package com.salesianostriana;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EjemplosBasicos {

    public static void main(String[] args) {

        // 1. Usando el API stream, mostrar por consola los números
        // que sean múltiplos de 2 y de 3, en el rango [0,1000].

        // SIN API STREAM
        /*
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<= 1000; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                //System.out.println(i);
                sb.append(i);
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
        */

        // CON API STREAM
/*
        IntPredicate multiplos2 = x -> x % 2 == 0;
        IntPredicate multiplos3 = x -> x % 3 == 0;

        IntStream.rangeClosed(0, 1000)
                    // .filter(x -> x % 2 == 0 && x % 3 == 0)
                    .filter(multiplos2.and(multiplos3))
//                    .forEach(new IntConsumer() {
//                        @Override
//                        public void accept(int value) {
//                            System.out.println(value);
//                        }
//                    });
                    //.forEach(x -> System.out.println(x));
                    .forEach(System.out::println);

*/
        String[] nombres = new String[]{"Javi", "Antonio", "Luismi", "Alejandro"};

        /*Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/

        /*
        Arrays.sort(nombres,
                (String nombre1, String nombre2) ->
                        nombre1.compareToIgnoreCase(nombre2));
        */

        //Arrays.sort(nombres, (n1, n2) -> n1.compareToIgnoreCase(n2));

        //Arrays.sort(nombres, String::compareToIgnoreCase);

        Arrays.sort(nombres, Comparator.comparing(String::length));

        Arrays.stream(nombres).forEach(System.out::println);


        // Aleatorios

        new Random().ints(100, 1, 1000)
                .sorted()
                .forEach(System.out::println);


    }
}
