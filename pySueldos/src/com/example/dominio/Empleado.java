/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

/**
 *
 * @author lautaro
 */
public class Empleado extends Trabajador {

    private int hsExtra, sueldo;
    private final int MAXIMO_HRS_EXTRA = 20;

    public Empleado(int legajo, int sueldo, int hsExtra, String nombre, String fechaDeC, String puesto) {
        super(legajo, nombre, fechaDeC, puesto);
        this.hsExtra = hsExtra;
        this.sueldo = sueldo;
    }

    public Empleado() {
        super();
        hsExtra = 0;
        sueldo = 0;
    }

    public int getHsExtra() {
        return hsExtra;
    }

    public void setHsExtra(int hsExtra) {
        if (hsExtra <= 20) {
            this.hsExtra = hsExtra;
        } else {
            this.hsExtra = MAXIMO_HRS_EXTRA;
        }
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int calcularPaga() {
       return sueldo + 300 * hsExtra;
    }

    @Override
    public String toString() {
        return super.toString() + " Hs extra totales del mes: " + hsExtra + " Sueldo final del mes: $" + calcularPaga();
    }
}
