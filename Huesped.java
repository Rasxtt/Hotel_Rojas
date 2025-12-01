/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Renzo
 */
public class Huesped {
    private int dni,noches;
    private String nom,ape,otrosDat;
    private Boolean esta;
    private float gasAdi;
    
    public Huesped(int dni, int noches, String nom, String ape, String otrosDat, Boolean esta) {
        this.dni = dni;
        this.noches = noches;
        this.nom = nom;
        this.ape = ape;
        this.otrosDat = otrosDat;
        this.esta = esta;
        this.gasAdi=gasAdi;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getOtrosDat() {
        return otrosDat;
    }

    public void setOtrosDat(String otrosDat) {
        this.otrosDat = otrosDat;
    }

    public Boolean getEsta() {
        return esta;
    }

    public void setEsta(Boolean esta) {
        this.esta = esta;
    }

    public float getGasAdi() {
        return gasAdi;
    }

    public void setGasAdi(float gasAdi) {
        this.gasAdi = gasAdi;
    }    

    
}
