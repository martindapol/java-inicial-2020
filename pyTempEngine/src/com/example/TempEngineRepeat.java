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
public class TempEngineRepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        float t, mayTemp, sum, prom;
        int contador = 1;
        sum = 0;
        mayTemp = -99;

        while (contador <= 100) {
            System.out.println("Ingresar t1: ");
            t = sca.nextFloat();
            //acumilar temperatura
            sum = sum + t; // sum +=t

            if (contador == 1) {
                mayTemp = t;
            } else if (t > mayTemp) {
                mayTemp = t;
            }
            //calcular promedio:
            prom = sum / contador;

            if (t > prom) {
                System.out.println("Temperatura superior al promedio");
            }
            
            contador++;

        }
        System.out.println("Mayor Temp: " + mayTemp);
    }
}
