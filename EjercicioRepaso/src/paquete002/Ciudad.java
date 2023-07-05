/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author reroes
 */
public class Ciudad {
    private String nombreCiudad;

    public Ciudad(String nombreCiu) {
        nombreCiudad = nombreCiu;
    }

    public void establecerNombreCiudad(String nombreCi) {
        nombreCiudad = nombreCi;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }
    
}
