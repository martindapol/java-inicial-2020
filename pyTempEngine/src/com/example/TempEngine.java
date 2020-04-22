/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class TempEngine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        float t1, t2, t3, t4, mayTemp;

        System.out.println("Ingresar t1: ");
        t1 = sca.nextFloat();
        System.out.println("Ingresar t2: ");
        t2 = sca.nextFloat();
        System.out.println("Ingresar t3: ");
        t3 = sca.nextFloat();
        System.out.println("Ingresar t4: ");
        t4 = sca.nextFloat();

        if (t1 > t2 && t1 > t3 && t1 > t4) {
            mayTemp = t1;
        } else if (t2 > t3 && t2 > t4) {
            mayTemp = t2;
        } else if (t3 > t4) {
            mayTemp = t3;
        } else {
            mayTemp = t4;
        }
        
        System.out.println("Mayor Temp: " + mayTemp);
        
    }

}
