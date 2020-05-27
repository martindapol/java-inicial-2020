/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.util.Random;

/**
 *
 * @author MARTIN
 * @
 */
public class Robot {

    private float x, y;

    public Robot() {
        x = primerUbicacion();
        y = primerUbicacion();
    }

    /**
     * Constructor con parámetros
     *
     * @param x Valor inicial de coordenada X
     * @param y Valor inicial de coordenada Y
     * @see 
     */
    public Robot(float x, float y) {
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

    public void avanzarArriba() {
        this.y += 10;
    }

    public void avanzarAbajo() {
        this.y -= 20;
    }

    public void avanzarDerecha() {
        this.x += 10;
    }

    public void avanzarIzquierda() {
        this.x -= 20;
    }

    /**
     * Permite obtener un valor aleatorio de coordenada
     * @return Devuelve un valor flotante obtenido a partir de Math.random()
     */
    private float primerUbicacion() {
        return (float) (Math.random() * 100);
    }
}
