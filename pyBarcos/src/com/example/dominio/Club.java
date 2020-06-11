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
public class Club {

    private String nombre;
    private int capacidad;
    private Barco barcos[];

    public Club(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        //Relación 0..*
        barcos = new Barco[capacidad];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Club " + nombre + "(" + capacidad + ")";
    }

    public boolean agregarBarco(Barco barco) {
        boolean flag = false;
        for (int i = 0; i < capacidad; i++) {
            if (barcos[i] == null) {
                barcos[i] = barco;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int contarVeleros() {
        int c = 0;
        for (int i = 0; i < capacidad && barcos[i] != null; i++) {
            if (barcos[i] instanceof Velero) {
                c++;
            }
        }
        return c;
    }

    public float calcularCuotaPromedio() {
        float acu = 0, prom = 0;
        int cont = 0;

        for (int i = 0; i < barcos.length; i++) {
            if (barcos[i] != null) {
                acu += barcos[i].calcularCuota();
                ++cont;
            }
        }
        if(cont >0)
            prom = acu / cont; 
        
        return prom;
    }
    
    public Barco obtenerVeleroMayorCuota(){
        Barco mayor = null;
        
        for (Barco barco : barcos) {
            if(barco instanceof Velero){
                if(mayor == null){
                    mayor = barco;
                }else if(barco.calcularCuota()> mayor.calcularCuota()){
                    mayor = barco;
                }    
            }
        }
        return mayor;
    }
    
    
}
