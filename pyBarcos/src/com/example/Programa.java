/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Barco;
import com.example.dominio.Club;
import com.example.dominio.Lancha;
import com.example.dominio.Velero;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Club c = new Club("Fiat", 30);

        int opcion;
        do {
            System.out.println("1-Registrar un Velero");
            System.out.println("2-Registrar una Lancha");
            System.out.println("3-Mostrar cantidad de Veleros");
            System.out.println("4-Mostrar valor cuota promedio");
            System.out.println("5-Mostrar Velero mayor paga");
            System.out.println("6-Salir");

            System.out.println("Ingrese opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese nombre del velero: ");
                    String nombre = entrada2.next();
                    System.out.println("Ingrese patente del velero: ");
                    String pat = entrada2.next();
                    System.out.println("Ingrese costo de servicios: ");
                    float servicios = entrada.nextFloat();
                    c.agregarBarco(new Velero(servicios, nombre, pat));
                    break;
                }
                case 2: {
                    System.out.println("Ingrese nombre de la lancha: ");
                    String nombre = entrada2.next();
                    System.out.println("Ingrese patente de la lancha: ");
                    String pat = entrada2.next();
                    c.agregarBarco(new Lancha(nombre, pat));
                    break;
                }
                case 3:
                    System.out.println("Total de veleros: " + c.contarVeleros());
                    break;

                case 4:
                    System.out.println("Cuota promedio: $" + c.calcularCuotaPromedio());
                    break;

                case 5:
                    Barco mayor = c.obtenerVeleroMayorCuota();
                    if(mayor != null)
                        System.out.println("Velero con mayor cuota mensual: " + mayor);
                    else
                        System.out.println("No hay veleros cargados!");
                    break;

                case 6:
                    System.out.println("Hasta otro momento!");
                    break;
                default:
                    System.out.print("Error. Opción incorrecta!");
            }
        } while (opcion != 6);
    }
}