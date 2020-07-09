/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class Sala implements Serializable{

    private String nombre;
    private String ala;
    private List<ObjetoExp> objetos;

    public Sala() {
        nombre = "Sala ";
        ala = "Norte";
        objetos = new ArrayList<>();

    }

    public Sala(String nombre, String ala) {
        this.nombre = nombre;
        this.ala = ala;
        objetos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public List<ObjetoExp> getObjetos() {
        return objetos;
    }
    
    public void agregarObjeto(ObjetoExp obj) {
        this.objetos.add(obj);
    }

    public int totalObjetos(){
        return this.objetos.size();
    }
    
    public String mostrarObjetos() {
        StringBuilder aux = new StringBuilder("");
        //Collections.sort(objetos);
        for (ObjetoExp x : objetos) {
            aux.append(x.toString()).append("\n");// este llamado es polimórfico...
        }

        return aux.toString();
    }

    public int cantidadObjetosMasAntiguos(int ant) {
        int total = 0;

        if (ant >= 0) {
            for (ObjetoExp x : objetos) {
                if (x.antiguedad() > ant) {
                    total++;
                }
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void addObjeto(ObjetoExp obj) {
        objetos.add(obj);
    }
    
    
    
}
