/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();
        System.out.println(baraja.mostrarBaraja());
        
        Carta c = baraja.siguienteCarta(); 
        if(c!=null)
            System.out.println("Siguiente: " + c);
        else
            System.out.println("No more!");
        
    }

}
