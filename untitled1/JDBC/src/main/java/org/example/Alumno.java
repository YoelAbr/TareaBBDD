package org.example;

import java.util.Objects;

public class Alumno {

    private int id;
    private String nombre;
    private String curso;
    private String email;

    public Alumno() {

    }

    public Alumno(int id,String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        this.id = id;
    }

    public Alumno(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(email, alumno.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }



}
