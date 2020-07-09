/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class Signo implements IGanador {

    private String nombre;
    private String ganaA;

    public Signo(String nombre, String ganaA) {
        this.nombre = nombre;
        this.ganaA = ganaA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreImagen() {
        return "/com/example/resources/" + nombre + ".png";
    }

    public String getGanaA() {
        return ganaA;
    }

    @Override
    public int ganarA(Signo s) {
        int aux = -1;
        if (s != null) {
            if (nombre.equals(s.nombre)) {
                aux = 0;
            } else if (ganaA.equals(s.nombre)) {
                aux = 1;
            } else {
                aux = -1;
            }
        }
        return aux;
    }
}
