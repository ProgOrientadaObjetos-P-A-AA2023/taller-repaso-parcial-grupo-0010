/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends Pago {

    private double pago = 0;
    private double tarifaBase;
    private double kilovatiosConsumidos ;
    private double costoKilovatio;

    public PagoLuzElectrica(double ta,double kil,double cos) {
        tarifaBase=ta;
        kilovatiosConsumidos=kil;
        costoKilovatio=cos;
    }

    public void establecerTarifaBase(double tari) {
        tarifaBase = tari;
    }

    public void establecerKilovatiosConsumidos(double kilo) {
        kilovatiosConsumidos = kilo;
    }

    public void establecerostoKilovatio(double cost) {
        costoKilovatio = cost;
    }

    public double obtenerPago() {
        return pago;
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

    @Override
    public void calcularPago() {

        String ciudad = "Loja";
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }
}
