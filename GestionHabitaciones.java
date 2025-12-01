/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Renzo
 */
public class GestionHabitaciones{
    protected Habitacion [] arreglo;
    protected int contador;

    public GestionHabitaciones() {
        this.arreglo = new Habitacion [30];
        this.contador = 0;     
    }
    public void Modificar(int num){
        for (int i = 0; i<contador;i++) {
            if (arreglo[i].getNum() == num) {
                arreglo[i].getMax();
                arreglo[i].getPreNo();
                arreglo[i].getTip();
            }
        }
    }    
    public void eliminar(int num) {
        for (int i = 0; i<contador;i++) {
            if (arreglo[i].getNum() == num) {
                for (int j=i+1;j<contador - 1;j++) {
                    arreglo[j] = arreglo[j+1];
                }
                arreglo[contador-1] = null;
            }
        }
    }
    public void Ingresar(Habitacion ref) {
        if (contador < arreglo.length) {
            arreglo[contador] = ref;
            contador++;
        } else {
            System.out.println("No hay espacio para mas ");
        }
    }    

    public Habitacion AsignarHabitacionDisponible(String tipoHabitacion) {
        for (int i = 0; i < contador; i++) {
            if (
                arreglo[i].getEstado().equalsIgnoreCase("Disponible") &&
                arreglo[i].getTip().equalsIgnoreCase(tipoHabitacion)
            ) {
                return arreglo[i];
            }
        }
        return null; // Retorna null si no hay habitaciones disponibles de ese tipo
    }
    public Habitacion AsignarHabitacionDisponible(String tipoHabitacion, int diaInicio, int mesInicio, int anioInicio, int diaFin, int mesFin, int anioFin) {
        int totalInicio = diaInicio + (mesInicio) * 30 + (anioInicio) * 360;
        System.out.println(totalInicio);
        int totalFin = diaFin + (mesFin) * 30 + (anioFin) * 360;
        System.out.println(totalFin);
        for (int i = 0; i < contador; i++) {
            Habitacion h = arreglo[i];
            if (h.getTip().equalsIgnoreCase(tipoHabitacion)) {
                int[][] diasOcupados = h.getDiasOcupados();
                boolean disponible = true;
                for (int d = totalInicio; d < totalFin; d++) {
                    if (diasOcupados[d][1] == 1) {
                        disponible = false;
                        break;
                    }
                }
                if (disponible) {
                    return h;
                }
            }
        }
        return null; // Retorna null si no hay habitaciones disponibles de ese tipo y rango
    }
    public void verInfo() {
        System.out.println("----- Información de Habitaciones -----");
        for (int i = 0; i < contador; i++) {
            System.out.println(arreglo[i].getNum() + "\t" + arreglo[i].getTip());
        }
        System.out.println("--------------------------------------");
    }
}
