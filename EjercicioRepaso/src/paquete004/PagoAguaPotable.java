/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author reroes
 */
public class PagoAguaPotable extends Pago {

    private String tipo;
    private double pago;
    double tarifaFija;
    double metrosCubicosConsumo;
    double costoConsumoCubicos;

    public PagoAguaPotable(String tip,double tari,double metro, double cos) {
        tipo = tip;
        tarifaFija=tari;
        metrosCubicosConsumo=metro;
        costoConsumoCubicos=cos;
    }

    public void establecerTipo(String tip) {
        tipo = tip;
    }

    public void establecerTarifaFija(double tarifa) {
       tarifaFija = tarifa;
    }

    public void establecerMetrosCubicosConsumo(double metros) {
       metrosCubicosConsumo = metros;
    }

    public void establecerCostoConsumoCubicos(double costo) {
        costoConsumoCubicos = costo;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerPago() {
        return pago;
    }

    public double obtenerTarifaFija() {
        return tarifaFija;
    }

    public double obtenerMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public double obtenerCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    @Override
    public void calcularPago() {
        if (tipo.equals("comercial")) {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        } else {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
    }
}
