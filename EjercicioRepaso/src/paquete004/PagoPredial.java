/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pago {

    double valorPropiedad ;
    double porcentaje;
    double pago;

    public PagoPredial(double valorP, double por) {
        valorPropiedad = valorP;
        porcentaje = por;
    }

    public void estableverValorPropiedad(double valorP) {
       valorPropiedad = valorP;
    }

    public void establecerPorcentaje(double por) {
        porcentaje = por;
    }

    public double obtenerValorPropiedad() {
        return valorPropiedad;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public double obtenerPago() {
        return pago;
    }

    @Override
    public void calcularPago() {
        pago = valorPropiedad - ((valorPropiedad * porcentaje) / 100);
    }
}
