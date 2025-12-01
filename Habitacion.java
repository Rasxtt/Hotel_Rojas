/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Renzo
 */
public class Habitacion {
    private int num,max,d,m,a,df,mf,af,total,totalf;
    private float preNo;
    private String tip, dispo;
    private int[][] diasOcupados = new int[360][2];  
    private String estado;
    
    public Habitacion(int num, int max, int d, int m, int a, int df, int mf, int af, float preNo, String tip, String dispo,String estado) {
        this.num = num;
        this.max = max;
        this.d = d;
        this.m = m;
        this.a = a;
        this.df = df;
        this.mf = mf;
        this.af = af;
        this.preNo = preNo;
        this.tip = tip;
        this.dispo = dispo;
        this.total =d+(m-1)*30+(a-2025)*360;
        this.totalf=df+(mf-1)*30+(af-2025)*360;
        for (int i = 0; i < 360; i++) {
            diasOcupados[i][0] = i + 1; // Día del año
            diasOcupados[i][1] = 0;     // Disponible
        }
        for (int i = total - 1; i < totalf; i++) {
                diasOcupados[i][1] = 1;
            }
        this.estado=estado;
    }

    public Habitacion(int num, int max, float preNo, String tip, String dispo, String estado) {
        this.num = num;
        this.max = max;
        this.preNo = preNo;
        this.tip = tip;
        this.dispo = dispo;
        this.estado = estado;
        // Inicializa los días como disponibles
        for (int i = 0; i < 360; i++) {
            diasOcupados[i][0] = i + 1;
            diasOcupados[i][1] = 0;
        }
    }

    public void setEstadoOcupado(int inicio, int fin) {
        for (int i = inicio; i < fin; i++) {
            diasOcupados[i][1] = 1; // Marca como ocupado
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int[][] getDiasOcupados() {
        return diasOcupados;
    }

    public void setDiasOcupados(int[][] diasOcupados) {
        this.diasOcupados = diasOcupados;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalf() {
        return totalf;
    }

    public void setTotalf(int totalf) {
        this.totalf = totalf;
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
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public float getPreNo() {
        return preNo;
    }

    public void setPreNo(float preNo) {
        this.preNo = preNo;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getDispo() {
        return dispo;
    }

    public void setDispo(String dispo) {
        this.dispo = dispo;
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

    public boolean validarDisponibilidad(int totalInicio, int totalFin){
        boolean disponible = true;
        for (int d = totalInicio; d < totalFin; d++) {
            if (this.diasOcupados[d][1] == 1) {
                disponible = false;
                break;
            }
        }
        return disponible;
            
    }

}
