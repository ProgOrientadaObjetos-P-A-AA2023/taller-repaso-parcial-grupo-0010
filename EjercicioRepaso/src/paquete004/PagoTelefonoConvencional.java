/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional extends Pago {

    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;

    public PagoTelefonoConvencional(double ta, double min, double costoMin) {
        tarifa = ta;
        minutosConsumidos = min;
        costoMinuto = costoMin;
    }

    public void establecerTarifa(double ta) {
        tarifa = ta;
    }

    public void establecerMinutosConsumidos(double min) {
        minutosConsumidos = min;
    }

    public void establecerCostoMinuto(double costoMi) {
        costoMinuto = costoMi;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public double obtenerMinutosConsumidos() {
        return minutosConsumidos;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    @Override
    public void calcularPago() {
        pago = tarifa + (minutosConsumidos * costoMinuto);
    }
    @Override
    public String toString(){
        String cadena="Pago de Telefonia\n";
        cadena=String.format("%sTarifa Fija: %.2f\nMinutos Consumidos: %.2f\n"
                + "Costo por Minuto: %.2f\n"
                + "Pago Telefono: %.2f\n", cadena,tarifa,minutosConsumidos,
               costoMinuto,pago);
        return cadena;
    }
}
