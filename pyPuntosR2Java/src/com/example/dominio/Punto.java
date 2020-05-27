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
public class Punto {

    private float x, y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float calcularDistancia() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public String mostrarCuadrante() {
        String aux = "Sobre los ejes";

        if (x > 0 && y > 0) {
            aux = "Cuadrante I";
        }

        if (x < 0 && y < 0) {
            aux = "Cuadrante III";
        }

        if (x > 0 && y < 0) {
            aux = "Cuadrante IV";
        }

        if (x < 0 && y > 0) {
            aux = "Cuadrante II";
        }

        return aux;
    }
    
    public String mostrarEstado(){
        StringBuilder aux = new StringBuilder("(");
        aux.append(x);
        aux.append(";");
        aux.append(y);
        aux.append(")");
               
        return aux.toString();
    }
    

}
