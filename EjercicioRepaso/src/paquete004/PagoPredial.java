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

    Propiedad valorPropiedad ;
    double porcentaje;

    public PagoPredial(Propiedad valorP, double por) {
        valorPropiedad = valorP;
        porcentaje = por;
    }

    public void estableverValorPropiedad(Propiedad valorP) {
       valorPropiedad = valorP;
    }

    public void establecerPorcentaje(double por) {
        porcentaje = por;
    }

    public Propiedad obtenerValorPropiedad() {
        return valorPropiedad;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    @Override
    public void calcularPago() {
        pago = valorPropiedad.obtenerCostoPropiedad() - ((valorPropiedad.obtenerCostoPropiedad() * porcentaje) / 100);
    }
    @Override
    public String toString(){
        String cadena="Pago Predial\n";
        cadena=String.format( "%sCosto Propiedad: %.2f\n"
                + "Porcentaje: %.2f\n"
                + "Pago predial: %.2f\n", cadena,
                valorPropiedad.obtenerCostoPropiedad(),porcentaje,
                pago);
        return cadena;
    }
}
