/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Password;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Password pass = new Password();
        pass.setLongitud(30);
        
        System.out.println("Pass: " + pass.getValor());
        if (pass.esFuerte()) {
            System.out.println("Pass es fuerte");
        } else {
            System.out.println("Pass no es fuerte...!");
        }

    }   
}
