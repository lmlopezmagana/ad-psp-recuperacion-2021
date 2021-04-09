package com.salesianostriana.deberes;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo> {


    /*
    la matrícula (como un String),
    la marca (como una valor de la enumeración anterior),
    y el número de kilómetros (como un entero).

     */

    private String matricula;
    private Marca marca;
    private int numeroKms;

    public Vehiculo() { }

    public Vehiculo(String matricula, Marca marca, int numeroKms) {
        this.matricula = matricula;
        this.marca = marca;
        this.numeroKms = numeroKms;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getNumeroKms() {
        return numeroKms;
    }

    public void setNumeroKms(int numeroKms) {
        this.numeroKms = numeroKms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return numeroKms == vehiculo.numeroKms &&
                Objects.equals(matricula, vehiculo.matricula) &&
                marca == vehiculo.marca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, marca, numeroKms);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca=" + marca +
                ", numeroKms=" + numeroKms +
                '}';
    }

    @Override
    public int compareTo(Vehiculo o) {
        return Integer.compare(this.numeroKms, o.getNumeroKms());
        //return this.getNumeroKms() - o.getNumeroKms();
    }
}
