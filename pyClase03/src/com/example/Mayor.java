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
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Encontrar el mayor de 3 números enteros ingresados
         por teclado.
         */
        int n1, n2, n3, mayor ;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        n1 = entrada.nextInt();

        System.out.println("Ingrese un segundo número: ");
        n2 = entrada.nextInt();

        System.out.println("Ingrese un tercer número: ");
        n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        } else if (n2 > n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        
        System.out.println("El mayor es: " + mayor);
    }
}
