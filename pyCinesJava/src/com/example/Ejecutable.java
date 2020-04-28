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
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //Máxima capacidad de las salas del complejo
        final int MAX_SALA = 112;
        final int PRECIO_DESC = 50;
        final int PRECIO_SIN_DESC = 75;
        //variables: DATOS DE ENTRADA + RESULTADOS
        int cantEsp, total;
        char descuento;
        total = 0;

        System.out.println("Ingrese la cantidad de espectadores: ");
        cantEsp = sca.nextInt();
        while (cantEsp > 0) {

            System.out.println("Ingrese Si tiene descuento [S/N]: ");
            descuento = sca.next().charAt(0);

            if (descuento == 'S' || descuento == 's') {
                total += cantEsp * PRECIO_DESC;
            } else {
                total += cantEsp * PRECIO_SIN_DESC;
            }

            System.out.println("Ingrese la cantidad de espectadores: ");
            cantEsp = sca.nextInt();
        }

        System.out.println("RECAUDACIÓN $: " + total);
    }
}
