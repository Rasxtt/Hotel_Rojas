/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import Paquete.Habitacion;
import Paquete.Huesped;
import Paquete.GestionHabitaciones;

/**
 *
 * @author Renzo
 */
public class Reservacion extends GestionHabitaciones{
    private int cod,d,m,a,df,mf,af;
    private String tipHabi;
    private Huesped ref;
    private Habitacion ref2;
    

    public Reservacion(int cod, int d, int m, int a, int df, int mf, int af, String tipHabi, Huesped ref, Habitacion ref2) {
        this.cod = cod;
        this.d = d;
        this.m = m;
        this.a = a;
        this.df = df;
        this.mf = mf;
        this.af = af;
        this.tipHabi = tipHabi;
        this.ref = ref;
        this.ref2 = ref2;
        ref2.setDispo("Ocupada");
    }

    public void setEstadoOcupado(int inicio, int fin) {
        ref2.setEstadoOcupado(inicio, fin);
    }

    public String FechIn(){
        return d+"/"+m+"/"+a;
    }
    public String FechOut(){
        return d+"/"+m+"/"+a;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getDf() {
        return df;
    }

    public void setDf(int df) {
        this.df = df;
    }

    public int getMf() {
        return mf;
    }

    public void setMf(int mf) {
        this.mf = mf;
    }

    public int getAf() {
        return af;
    }

    public void setAf(int af) {
        this.af = af;
    }

    

    public String getTipHabi() {
        return tipHabi;
    }

    public void setTipHabi(String tipHabi) {
        this.tipHabi = tipHabi;
    }

    public Huesped getRef() {
        return ref;
    }

    public void setRef(Huesped ref) {
        this.ref = ref;
    }

    public Habitacion getRef2() {
        return ref2;
    }

    public void setRef2(Habitacion ref2) {
        this.ref2 = ref2;
    }
    public void ValidadDisponibilidad(int d,int m,int a, String tip,int df, int mf, int af){
    int aux=0;
    int total=d+(m-1)*30+(a-2025)*360;
    int totalf=df+(mf-1)*30+(af-2025)*360;
    for(int i=0;i<360;i++){
            if(ref2.getDiasOcupados()[i][1]==1){
                System.out.println("Esta disponible en el dia: "+(i+1));
            }
        }
    }
}

//if (arreglo[i].getD()==d&&arreglo[i].getM()==m&&arreglo[i].getA()==a&&arreglo[i].getTip().equalsIgnoreCase(tip)) {
        //        System.out.println("La habitacion Nro "+i+" se encuentra disponible y cumple con los requisitos");
       //         System.out.println("Tipo de habitacion: "+arreglo[i].getTip());
        //        System.out.println("Cantidad maxima de personas: "+arreglo[i].getMax());
        //        System.out.println("Precio por noche: "+arreglo[i].getPreNo());