/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Renzo
 */
public class Estadia extends GestionHabitaciones {
    private int cod;
    Reservacion ref;
    Huesped ref2;
    Habitacion ref3;
    String fechIn,fechOut,estado;

    public Estadia(int cod,Reservacion ref, Huesped ref2, Habitacion ref3, String fechIn, String fechOut, String estado) {
        this.cod = cod;
        this.ref = ref;
        this.ref2 = ref2;
        this.ref3 = ref3;
        this.fechIn = fechIn;
        this.fechOut = fechOut;
        this.estado = estado;
    }



    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Reservacion getRef() {
        return ref;
    }

    public void setRef(Reservacion ref) {
        this.ref = ref;
    }

    public Huesped getRef2() {
        return ref2;
    }

    public void setRef2(Huesped ref2) {
        this.ref2 = ref2;
    }

    public Habitacion getRef3() {
        return ref3;
    }

    public void setRef3(Habitacion ref3) {
        this.ref3 = ref3;
    }

    public String getFechIn() {
        return fechIn;
    }

    public void setFechIn(String fechIn) {
        this.fechIn = fechIn;
    }

    public String getFechOut() {
        return fechOut;
    }

    public void setFechOut(String fechOut) {
        this.fechOut = fechOut;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void realizarCheckIn(Reservacion res) {
    Habitacion hab = res.getRef2();
    hab.setDispo("Ocupada");
    hab.setEstado("Limpia");
    System.out.println("Check-in realizado. Habitación: " + hab.getNum());
    }
    public static float realizarCheckOut(Reservacion res) {
    Habitacion hab = res.getRef2();
    Huesped hu = res.getRef();
    hab.setDispo("Libre") ;  
    hab.setEstado("Sucia");
    return hu.getGasAdi()+hu.getNoches()*hab.getPreNo();
    }    
}
