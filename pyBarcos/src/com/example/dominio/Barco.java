/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

/**
 *
 * @author MARTIN
 */
public abstract class Barco extends Object{

    private String nombre;
    private String patente;

    public Barco() {
        this.nombre = "S/n";
        this.patente = "S/p";
    }
    
    
   
    public Barco(String nombre, String patente) {
        this.nombre = nombre;
        this.patente = patente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public abstract float calcularCuota();

    @Override
    public String toString() {
        return "Patente: " + patente + "|Nombre: " + nombre;
    }
}
