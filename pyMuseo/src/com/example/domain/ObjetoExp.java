/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;
import java.util.Calendar;

/**
 *
 * @author MARTIN
 */
public abstract class ObjetoExp implements Comparable<ObjetoExp>{

    private int cod;
    private String nombre;
    private int anio;

    public ObjetoExp() {
    }

    public ObjetoExp(int cod, String nombre, int anio) {
        this.cod = cod;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    //Método: Mostrar datos...
    @Override
    public String toString() {
        return "Código: " + cod + "| Nombre: " + nombre + "| Año: " + anio;
    }
    
    public int antiguedad(){
        int anioActual, ant;   
        Calendar cal = Calendar.getInstance(); 
        //año actual
        anioActual =  cal.get(Calendar.YEAR);
        
        if(this.anio < 0)
            ant =  Math.abs(this.anio) + anioActual;
        else
            ant = anioActual - this.anio;
        
        return ant; 
    } 
    
    @Override
    public int compareTo(ObjetoExp t) {
        return this.antiguedad() - t.antiguedad();
    }   
}
