/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import java.util.ArrayList;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
import paquete004.Pago;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Propiedad pro1=new Propiedad(15000);
        PagoAguaPotable  pagoA= new PagoAguaPotable("comercial", 10, 2, 2.5);
        Ciudad ciu=new Ciudad("Loja");
        Ciudad ciu2=new Ciudad("Zamora");
        Persona per=new Persona("Tara", "Cuenca", 18, "13532525323", ciu2);
        PagoLuzElectrica pagoLuz= new PagoLuzElectrica(12, 2, 3, ciu);
        PagoPredial pagoPre=new PagoPredial(pro1, 12);
        PagoTelefonoConvencional pagoTe=new PagoTelefonoConvencional(5, 10, 1);
        ArrayList<Pago> lis=new ArrayList<>();
        lis.add(pagoA);
        lis.add(pagoLuz);
        lis.add(pagoPre);
        lis.add(pagoTe);
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
