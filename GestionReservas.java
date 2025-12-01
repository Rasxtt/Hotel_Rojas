/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Diego
 */
public class GestionReservas{
    Reservacion [] arreglo;
    private int contador;

    public GestionReservas() {
        this.arreglo = new Reservacion [30];
        this.contador = 0;
    }

    public Reservacion[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Reservacion[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void Ingresar(Reservacion ref) {
        if (contador < arreglo.length) {
            arreglo[contador] = ref;
            contador++;
        } else {
            System.out.println("No hay espacio para mas ");
        }
    } 

    public Reservacion buscarReservacionPorCodigo(int codigo) {
        for (int i = 0; i < contador; i++) {
            if (arreglo[i].getCod() == codigo) {
                return arreglo[i];
            }
        }
        return null; // Retorna null si no se encuentra la reservación
    }


    
}