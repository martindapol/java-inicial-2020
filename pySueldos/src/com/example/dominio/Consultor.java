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
public class Consultor extends Trabajador {

    private int cantHs, valorHs;

    public Consultor(int cantHs, int valorHs,int legajo, String nombre, String fechaDeC, String puesto) {
        super(legajo, nombre, fechaDeC, puesto);

        this.cantHs = cantHs;
        this.valorHs = valorHs;
    }

    public Consultor() {
        cantHs = 0;
        valorHs = 0;
    }

    public int getCantHs() {
        return cantHs;
    }

    public void setCantHs(int cantHs) {
        this.cantHs = cantHs;
    }

    public int getValorHs() {
        return valorHs;
    }

    public void setValorHs(int valorHs) {
        this.valorHs = valorHs;
    }

    @Override
    public int calcularPaga() {
        return valorHs * cantHs;
    }

    @Override
    public String toString() {
        return super.toString() + " Hs totales del mes "+ cantHs+ " Sueldo final del mes $"+ calcularPaga(); 
    }

}
