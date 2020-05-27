/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Punto;
import com.example.dominio.Recta;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] argumentos) {
        System.out.println("Construyendo un punto....System.out.println(\"Construyendo una recta....\");");
        Scanner sca = new Scanner(System.in);
        Punto p1 = new Punto();
        System.out.println("Ingrese coordena x:");
        p1.setX(sca.nextFloat());
        System.out.println("Ingrese coordena y:");
        p1.setY(sca.nextFloat());

        Punto pOrigen = new Punto();
        Punto pVal = new Punto(7,7);
        
        Punto[] puntos = new Punto[3];
        puntos[0] = p1;
        puntos[1] = pOrigen;
        puntos[2] = pVal;
        
        //mostrar todos los puntos:
        for (Punto punto : puntos) {
            System.out.println(punto.mostrarEstado());
        }
        
        
        System.out.println(p1.mostrarEstado());
        System.out.println("Ubicado en: " + p1.mostrarCuadrante());
        System.out.println("A una distancia del (0;0) de: " + String.valueOf(p1.calcularDistancia()));
        
        System.out.println("Construyendo una recta....\n");
        System.out.println("Ingrese un valor de pendiente: ");
        float m = sca.nextFloat();
        Recta r1 = new Recta(m, p1);
        
        System.out.println("Recta r1 es: " + r1.mostrarEcuacion());
        
    }

}
