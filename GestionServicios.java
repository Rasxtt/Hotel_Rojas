/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Renzo
 */
public class GestionServicios {
    private ServicioAdicional [] arreglo;
    private int contador;

    public GestionServicios() {
        this.arreglo = new ServicioAdicional[30];
        this.contador = 0;
    }
    public void Modificar(String nom, float nuevoPre){
        for (int i = 0; i<contador;i++) {
            if (arreglo[i].getNom().equalsIgnoreCase(nom)) {
                arreglo[i].setPrecio(nuevoPre);
                System.out.println("Servicio modificado correctamente");
            }
        }
    }
    public void eliminar(String nom) {
        for (int i = 0; i<contador;i++) {
            if (arreglo[i].getNom().equalsIgnoreCase(nom)) {
                for (int j=i+1;j<contador - 1;j++) {
                    arreglo[j] = arreglo[j+1];
                }
                arreglo[contador-1] = null;
                contador--;
                System.out.println("Servicio Eliminado");
            }
        }
    }
    public void Ingresar(ServicioAdicional ref) {
        if (contador < arreglo.length) {
            arreglo[contador] = ref;
            contador++;
        } else {
            System.out.println("No hay espacio para mas ");
        }
    }

    public String[] obtenerNombres() {
    String[] nombres = new String[contador];
    
    for (int i = 0; i < contador; i++) {
        nombres[i] = arreglo[i].getNom();
    }
    
    return nombres;
}

    public ServicioAdicional buscarServicioPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (arreglo[i].getNom().equalsIgnoreCase(nombre)) {
                return arreglo[i];
            }
        }
        return null; // Retorna null si no se encuentra el servicio
    }


    public void verInfo() {
        System.out.println("----- Información de Servicios -----");
        for (int i = 0; i < contador; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("-----------------------------------");
    }
}
