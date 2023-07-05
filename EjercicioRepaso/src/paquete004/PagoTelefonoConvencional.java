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
    private double pago;

    public PagoTelefonoConvencional(double ta, double min, double costoMin) {
        tarifa = ta;
        minutosConsumidos = min;
        costoMinuto = costoMin;
    }

    @Override
    public void calcularPago() {

        pago = tarifa + (minutosConsumidos * costoMinuto);
    }
}
