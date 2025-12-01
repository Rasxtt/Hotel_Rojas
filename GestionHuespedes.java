/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Renzo
 */
public class GestionHuespedes {
    private Huesped [] arreglo;
    private int contador;

    public GestionHuespedes() {
        this.arreglo = new Huesped [30];
        this.contador = 0;     
    }

    public Huesped[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Huesped[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    


    public void Modificar(int dni){
        for (int i = 0; i<contador;i++) {
            if (arreglo[i].getDni() == dni) {
                arreglo[i].getNoches();
                arreglo[i].getNom();
                arreglo[i].getApe();
                arreglo[i].getOtrosDat();
                arreglo[i].getEsta();
            }
        }
    }    
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
    public void Ingresar(Huesped ref) {
        if (contador < arreglo.length) {
            arreglo[contador] = ref;
            contador++;
        } else {
            System.out.println("No hay espacio para mas ");
        }
    }    

    public Huesped BuscarHuespedPorDNI(int num) {
        for (int i = 0; i < contador; i++) {
            if (arreglo[i].getDni() == num) {
                return arreglo[i];
            }
        }
        return null; // Retorna null si no se encuentra la habitación
    }
    public void verInfo() {
        System.out.println("----- Información de Huespedes -----");
        for (int i = 0; i < contador; i++) {
            System.out.println(arreglo[i].getDni());
        }
        System.out.println("------------------------------------");
    }
}
