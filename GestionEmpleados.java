/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import Paquete.Empleado;
import java.util.HashSet;

/**
 *
 * @author Renzo
 */
public class GestionEmpleados <T extends Empleado>{
    private T[] arreglo;
    private int contador;

    public GestionEmpleados() {
        this.arreglo = (T[]) new Empleado[30];  // ← así sí funciona
        this.contador = 0;
    }

    public void Ingresar(T ref) {
        if (contador < arreglo.length) {
            arreglo[contador] = ref;
            contador++;
        } else {
            System.out.println("No hay espacio para mas ");
        }
    }

    public int Tamaño() {
        return contador;
    }
    // Eliminar por código: implementación usando desplazamiento (adaptada)
    public void eliminar(int dni) {
        for (int i = 0; i<contador;i++) {
            if (arreglo[i].getDni() == dni) {
                for (int j=i+1;j<contador - 1;j++) {
                    arreglo[j] = arreglo[j+1];
                }
                arreglo[contador-1] = null;
            }
        }
    }
    public void Modificar(int dni){
        for (int i = 0; i<contador;i++) {
            if (arreglo[i].getDni() == dni) {
                arreglo[i].getApe();
                arreglo[i].getContra();
                arreglo[i].getNom();
                arreglo[i].getUsu();
                arreglo[i].getRol();
            }
        }
    }
    public void verInfo() {
        System.out.println("----- Información de Empleados -----");
        for (int i = 0; i < contador; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("------------------------------------");
    }
}
