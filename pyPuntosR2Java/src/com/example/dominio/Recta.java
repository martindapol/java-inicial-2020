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
public class Recta {
    private float pendiente;
    private Punto punto;

    public Recta() {
        pendiente = 1;
        punto =  new Punto(0,0);
    }

    public Recta(float pendiente, Punto punto) {
        this.pendiente = pendiente;
        this.punto = punto;
    }

    public float getPendiente() {
        return pendiente;
    }

    public void setPendiente(float pendiente) {
        this.pendiente = pendiente;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }
    
    public float calcularOrdenada(){
        //Y-Yo = m (X-X0)
        //Si X=0, entonces:
        //Y-Yo = m (0-X0)
        //Y = m (-X0) + Yo
        
        float ordenada = (-1) * pendiente * punto.getX() + punto.getY();
        return ordenada;
    }
    
    public String mostrarEcuacion(){
        //Y = m(pendiente)X + b(Ordenada al Origen)
        float m = this.calcularOrdenada();
        StringBuilder aux = new StringBuilder("Y = ");
        aux.append(pendiente);
        
        if(m>0){
            aux.append("X + ");
        }else{
            aux.append("X ");
        }
        
        aux.append(m);           
        return aux.toString();
    }
    
    
    
    
    
}
