/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Robot;
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

        Scanner in = new Scanner(System.in);
        int op = 0;
        Robot tito = new Robot();

        do {
            System.out.println("Su robot se encuentra ahora en: " + tito.getX() + "," + tito.getY() + ")");
            
            System.out.println("1) Girar norte y avanzar 10 pasos");
            System.out.println("2) Girar al sur y avanzar  20 pasos");
            System.out.println("3) Girar al este y avanzar 10 pasos");
            System.out.println("4) Girar al oeste  y avanzar  20 pasos");
            System.out.println("5) Salir");
            op = in.nextInt();
            
            switch (op) {
                case 1:
                    tito.avanzarArriba();
                    break;
                case 2:
                    tito.avanzarAbajo();
                    break;
                case 3:
                    tito.avanzarDerecha();
                    break;
                case 4:
                    tito.avanzarIzquierda();
                    break;
                default:
                    System.out.println("La opcion ingresada n");
            }
            
        } while (op != 5);
    }

}
