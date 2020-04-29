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
        //definir variables
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int nroTramite, tipo, mesa, op, contMP;
        float importe, total;
        String asunto;

        total = contMP = 0; //asignación múltiple
        op = 0;

        do {
            System.out.println("1-Cargar trámite: ");
            System.out.println("2-Mostar cantidad de trñemites de MESAS PARES: ");
            System.out.println("3-Mostrar total de recaudación: ");
            System.out.println("4-Salir: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese Nº Trémite: ");
                    nroTramite = input.nextInt();
                    System.out.println("Ingrese Asunto Trémite: ");
                    asunto = input2.nextLine();

                    do {
                        System.out.println("Ingrese Mesa Trémite: ");
                        mesa = input.nextInt();
                        if (mesa < 0 || mesa > 29) {
                            System.out.println("Error. Valor Incorrecto!");
                        }
                        
                    } while (mesa < 0 || mesa > 99); // lógica cantraria:

                    do {
                        System.out.println("Ingrese Tipo Trémite: ");
                        tipo = input.nextInt();

                        if (tipo < 0 || tipo > 29) {
                            System.out.println("Error. Valor Incorrecto!");
                        }

                    } while (tipo < 0 || tipo > 29);

                    System.out.println("Ingrese Importe Trémite: ");
                    importe = input.nextInt();

                    if (mesa % 2 == 0) {
                        contMP++;
                    }
                    total += importe;

                    break;
                case 2:
                    System.out.println("Total de trámites MESAS PARES: " + contMP);
                    break;
                case 3:
                    System.out.println("Total de RECAUDACIÓN $: " + total);
                    break;
                case 4:
                    System.out.println("Gracias por usar SUAC");
                    break;
                default:
                    System.out.println("Error. Opción no válida ");
            }

        } while (op != 4);
    }
}
