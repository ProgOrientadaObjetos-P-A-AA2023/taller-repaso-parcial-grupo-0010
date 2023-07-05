/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import java.util.ArrayList;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.Pago;
import paquete004.PagoAguaPotable;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        //Trabajo Enviado
        Ciudad ciu2 = new Ciudad("Zamora");
        Persona per = new Persona("Tara", "Cuenca", 18, "13532525323", ciu2);
        double[][] auz = DatosAgua.datosCasas();
        ArrayList<Pago> lis = new ArrayList<>();
        for (int i = 0; i < auz.length; i++) {
            PagoAguaPotable pag = new PagoAguaPotable("", auz[i][0], auz[i][1], auz[i][2]);
            lis.add(pag);
        }
        for (int i = 0; i < lis.size(); i++) {
            lis.get(i).calcularPago();
        }
       BilleteraPagos pago = new BilleteraPagos();
        pago.establecerLisPagos(lis);
        pago.establecerPersona(per);
        pago.establecerGastoPagos();
        System.out.println(pago);
    }
}
