package com.salesianostriana;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contacto {

    private String nombre;
    private List<String> emails = new ArrayList<String>();

    public Contacto(String nombre, List<String> emails) {
        this.nombre = nombre;
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", emails=" + emails +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre) &&
                Objects.equals(emails, contacto.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, emails);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
