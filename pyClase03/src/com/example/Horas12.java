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
public class Horas12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, minutos;
        Scanner entrada = new Scanner(System.in);
        String amPm = "AM";
        boolean band = false;

        //Entrada:
        System.out.println("Ingrese horas [HH]:");
        horas = entrada.nextInt();

        System.out.println("Ingrese minutos [MM]:");
        minutos = entrada.nextInt();

        //Proceso:
        if ((horas >= 0 && horas <= 24) && (minutos >= 0 && minutos <= 60)) {
            if (horas > 12) {
                horas -= 12;
                amPm = "PM";
            }
            band = true;
        }

        //Salida:
        if (band == true) {
            System.out.println("La hora en formato 12 es: " + horas + ":" + minutos + " " + amPm);
        } else {
            System.out.println("Hora incorrecta, PESCADO!");
        }
    }
}
