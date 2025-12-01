/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import Paquete.Reservacion;
import Paquete.Habitacion;
import Paquete.Huesped;
import Paquete.GestionHuespedes;
import Paquete.Estadia;
import Paquete.Empleado;
import Paquete.Consumo;

/**
 *
 * @author Renzo
 */
public class Recepcionista extends Empleado{
    public Recepcionista(int dni, String nom, String ape, String rol) {
        super(dni, nom, ape, rol);
    }

public void GestionHuespedes(int dni, int noches, String nom, String ape, String otrosDat, Boolean esta,String tipoOperacion){
    if(tipoOperacion.equalsIgnoreCase("m")){
        Huesped H2= new Huesped(dni,noches,nom,ape,otrosDat,esta);
        SistemaHotel.GHU.Modificar(H2.getDni());
    }
    if(tipoOperacion.equalsIgnoreCase("e")){
        Huesped H2= new Huesped(dni,noches,nom,ape,otrosDat,esta);
        SistemaHotel.GHU.eliminar(H2.getDni());
    }
    if(tipoOperacion.equalsIgnoreCase("i")){
        Huesped H2= new Huesped(dni,noches,nom,ape,otrosDat,esta);
        SistemaHotel.GHU.Ingresar(H2);
        System.out.println("esta bien");
        }   
    }
    public Reservacion CrearReservacion(Huesped ref,Habitacion ref2){
        if (ref2 == null) {
            System.out.println("No hay habitación disponible para el rango y tipo solicitado.");
            // Opcional: mostrar mensaje en la interfaz gráfica
            return null;
        }
        Reservacion R1 = new Reservacion(ref2.getNum(),ref2.getD(),ref2.getM(),ref2.getA(),ref2.getDf(),ref2.getMf(),ref2.getAf(),ref2.getTip(),ref,ref2);
        int total = ref2.getD()+ref2.getM()*30+ref2.getA()*360;
        int totalf =  ref2.getDf()+ref2.getMf()*30+ref2.getAf()*360;
        
        R1.setEstadoOcupado(total, totalf);
        return R1;
        }
    
    public void hacerCheckIn(Reservacion res) {
    Estadia E = new Estadia(res.getCod(),res,res.getRef(),res.getRef2(),res.FechIn(),res.FechOut(),res.getRef2().getEstado());  
    E.realizarCheckIn(res);
    }
    public void hacerCheckOut(Reservacion res) {
    Estadia E = new Estadia(res.getCod(),res,res.getRef(),res.getRef2(),res.FechIn(),res.FechOut(),res.getRef2().getEstado());  
    E.realizarCheckOut(res);
    }
    public void registrarConsumo(Huesped hu,int cantidad, ServicioAdicional servicio) {
        Consumo C =new Consumo();
        C.registrarConsumo(hu,cantidad,servicio);
    } 
}

