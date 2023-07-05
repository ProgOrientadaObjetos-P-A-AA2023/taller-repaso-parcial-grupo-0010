/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.Pago;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {

    private Persona persona;
    private double gastoPagos=0;
    private String mes;
    /*
    public PagoAguaPotable aguaCasa;
    public PagoAguaPotable aguaComercio;
    public PagoLuzElectrica luzCasa;
    public PagoLuzElectrica luzComercio;
    public PagoPredial casa1;
    public PagoPredial casa2;
    public PagoTelefonoConvencional telefonoCasa;
    public PagoTelefonoConvencional telefonoFinca;*/
    
    private ArrayList<Pago> lisPagos;

    public void establecerPersona(Persona pers) {
        persona = pers;
    }

    public void establecerGastoPagos() {
        for (Pago lisP : lisPagos) {
            gastoPagos=gastoPagos+lisP.obtenerPago();
        }
    }

    public void establecerMes(String me) {
        mes = me;
    }

    public void establecerLisPagos(ArrayList<Pago> lisPa) {
        lisPagos = lisPa;
    }

    public Persona obtenerPersona() {
        return persona;
    }

    public double obtenerGastoPagos() {
        return gastoPagos;
    }

    public String obtenerMes() {
        return mes;
    }

    public ArrayList<Pago> getLisPagos() {
        return lisPagos;
    }

    @Override
    public String toString() {
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
         */
        String cadena="Reporte\n";
         cadena=String.format("%sPersona\nNombre: %s\nCedula: %s\n"
                 + "Edad: %d\nCiudad: %s\n",cadena,persona.obtenerNombre()+" "+persona.obtenerApellido(),
                 persona.obtenerCedula(),persona.obtenerEdad(),persona.ObtenerCiudad().obtenerNombreCiudad());
        for (int i = 0; i < lisPagos.size(); i++) {
            cadena=String.format("%s%s\n", cadena,lisPagos.get(i));
        }
         cadena=String.format("%sPago Total: %.2f",cadena,gastoPagos);
        return cadena;
    }

}
