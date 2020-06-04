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
    private int valor;
    public static int count = 0;

    public Ejecutable() {
        
        getVal();
        count++; //count permite contar la cantidad de objetos creados 
                 //a partir de Ejecutable
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejecutable aux = new Ejecutable();
        System.out.println("El valor es: " + aux.getValor());
        System.out.println("Cantidad de objetos: " + Ejecutable.count);
        Ejecutable aux2 = new Ejecutable();
        System.out.println("Cantidad de objetos: " + Ejecutable.count);
    }
    
    
    public int getValor(){
        return valor;
    }
    
    
    private void getVal(){
        valor  = (int)(Math.random()*100);
    }
    
}
