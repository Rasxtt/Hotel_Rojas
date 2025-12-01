/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Informe {
    

    public static String ReporteOcupacion(){
        Habitacion [] H1 = SistemaHotel.GH.arreglo;
        System.out.println("------Reporte de Ocupacion--------");
        String txt = "";
    for(int i = 0; i < H1.length; i++){
        Habitacion hab = H1[i];
        
        
        if (hab != null) {
            txt += "Habitación " + hab.getNum() + "- " + hab.getDispo() + "\n";
        }

        
    }
    return txt;

}
    public static String ReporteIngreso(int rangIni,int rangFin){
    int contador = SistemaHotel.GH.contador;
    float ingresosHabi = 0;
    float ingresoServicios = 0;

    System.out.println("--------Reporte de ingresos----------");
    System.out.println("Rango de días: " + rangIni + " - " + rangFin);

    for (int i = 0; i < contador; i++) {
        Reservacion r = SistemaHotel.GRV.arreglo[i];
        if (r == null) continue; // Con esto se salta el caso para que no bote error 

        Habitacion hab = r.getRef2();
        Huesped H1 = r.getRef();
        if (hab == null || H1 == null) continue; // Con esto se salta el caso para que no bote error 

        if (hab.getTotal() <= rangFin && hab.getTotalf() >= rangIni) {

            int noches = H1.getNoches();
            ingresosHabi += hab.getPreNo() * noches;
            ingresoServicios += H1.getGasAdi();
        }

        
    }
    String txt = "Ingresos por habitaciones: S/ " + ingresosHabi + "\n" +
                 "Ingresos por servicios:   S/ " + ingresoServicios + "\n" +
                 "Ingresos totales:         S/ " + (ingresosHabi + ingresoServicios) + "\n";

    return txt; 

    
    }
}
