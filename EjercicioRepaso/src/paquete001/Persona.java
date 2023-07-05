package paquete001;

import paquete002.Ciudad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author reroes
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private Ciudad ciudad;

    public Persona(String nom, String ape, int ed, String ced, Ciudad ci) {
        nombre = nom;
        apellido = ape;
        edad = ed;
        cedula = ced;
        ciudad = ci;
    }

    public void establecerNombre(String nom) {
        this.nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerEdad(int ed) {
        edad = ed;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerCiudad(Ciudad ciu) {
        ciudad = ciu;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Ciudad ObtenerCiudad() {
        return ciudad;
    }

}
