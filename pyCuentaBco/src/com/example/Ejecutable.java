/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.CuentaBancaria;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria c1, c2; // solo referencias: una variables capaz de guardar la 
        //dirección de memoria de otra.
        
        c1 = new CuentaBancaria();
        c2 = new CuentaBancaria(9999, "Elsa Lamme");
        
        c1.setTitular("Hugo"); // setTitular("Un titular!")
        c1.depositar(1000);
        c1.extraer(-300);
        
        c2.depositar(-500);
        
        if(c1.getSaldo()>c2.getSaldo())
            System.out.println("Mayor cuenta es la de: " + c1.getTitular());
        else
            System.out.println("Mayor cuenta es la de: " + c2.getTitular());
        
    }
   
}
