/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Barco;
import com.example.dominio.Lancha;
import com.example.dominio.Velero;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Programa {

    static int numero = 0;
    static int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        /*
         System.out.println("Ingrese cantidad de barcos a cargar: ");
         numero = entrada2.nextInt();

         Barco barco1 = new Barco();

         do {
         System.out.println("Ingrese el nombre del barco: ");
         barco1.setNombre(entrada.nextLine());

         System.out.println("El tipo de barco es 1- Lancha o 2- Velero?: ");
         barco1.setTipo(entrada.nextLine());

         System.out.println("El monto que paga es: ");
         barco1.setMonto(entrada2.nextInt());
         i = i + 1;
         } while (i < numero);

         barco1.mostrarDatos();
         barco1.mostrarResultados();
         */
        
        Velero v = new Velero();
        Lancha lan = new Lancha();
                
        

    }

}
