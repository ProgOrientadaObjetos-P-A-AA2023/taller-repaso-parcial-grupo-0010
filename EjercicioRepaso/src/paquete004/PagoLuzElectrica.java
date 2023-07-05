/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete002.Ciudad;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends Pago {

    private double tarifaBase;
    private double kilovatiosConsumidos ;
    private double costoKilovatio;
    private Ciudad ciudad;

    public PagoLuzElectrica(double ta,double kil,double cos,Ciudad ciu) {
        tarifaBase=ta;
        kilovatiosConsumidos=kil;
        costoKilovatio=cos;
        ciudad=ciu;
    }

    public void establecerTarifaBase(double tari) {
        tarifaBase = tari;
    }

    public void establecerCiudad(Ciudad ciu) {
        ciudad = ciu;
    }

    public void establecerKilovatiosConsumidos(double kilo) {
        kilovatiosConsumidos = kilo;
    }

    public void establecerostoKilovatio(double cost) {
        costoKilovatio = cost;
    }

    public double obtenerarifaBase() {
        return tarifaBase;
    }

    public double obtenerKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public double obtenerCostoKilovatio() {
        return costoKilovatio;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    @Override
    public void calcularPago() {

        if (ciudad.obtenerNombreCiudad().equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }
    @Override
    public String toString(){
        String cadena="Pago de Luz Electrica\n";
        cadena=String.format("%sCiudad: %s\n"+
                "Tarifa Fija: %.2f\nKilobatios Consumidos: %.2f\n"
                + "Costo Consumo por Kilobatio: %.2f\n"
                + "Pago de Luz: %.2f\n", cadena,ciudad.obtenerNombreCiudad(),tarifaBase,
                kilovatiosConsumidos,costoKilovatio,pago);
        return cadena;
    }
}
