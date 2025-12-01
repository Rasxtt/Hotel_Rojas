/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Renzo
 */
public class Consumo {
    private ServicioAdicional servicio;
    private int cantidad;
    private float subtotal;

    public Consumo() {
        this.servicio = servicio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public ServicioAdicional getServicio() {
        return servicio;
    }

    public void setServicio(ServicioAdicional servicio) {
        this.servicio = servicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    public void registrarConsumo(Huesped hu,int cantidad, ServicioAdicional servicio) {
        hu.setGasAdi(hu.getGasAdi()+cantidad*servicio.getPrecio());
    }
}
