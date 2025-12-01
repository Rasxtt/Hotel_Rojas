/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Diego
 */
public class SistemaHotel {
    public static Administrador admin = new Administrador(CredencialesAdmin.dniAdmin,CredencialesAdmin.NombreAdmin, CredencialesAdmin.ApellidoAdmin,"A");
    public static Recepcionista recep = new Recepcionista(CredencialesRecepcionista.dniRecep,CredencialesRecepcionista.NombreRecep, CredencialesRecepcionista.ApellidoRecep,"R");     
    public static GestionEmpleados<Recepcionista> GR = new GestionEmpleados<Recepcionista>();
    public static GestionEmpleados<Administrador> GA = new GestionEmpleados<Administrador>();
    public static GestionHabitaciones GH = new GestionHabitaciones();
    public static GestionHuespedes GHU = new GestionHuespedes();
    public static GestionServicios GS = new GestionServicios();
    public static GestionReservas GRV = new GestionReservas();


    public static void verInfoTotal() {
        System.out.println("=== INFORMACIÓN COMPLETA DEL HOTEL ===");
        GR.verInfo();
        GA.verInfo();
        GH.verInfo();
        GHU.verInfo();
        GS.verInfo();
        System.out.println("======================================");
    }
}
