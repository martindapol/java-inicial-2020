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
public class Lancha extends Barco{

    public Lancha() {
    }

    public Lancha(String nombre, String patente) {
        super(nombre, patente);
    }

    @Override
    public float calcularCuota() {
       return 1800;
    }
     @Override
    public String toString() {
        
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
