/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Password;
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
        Scanner sca2 = new Scanner(System.in);
        
        
        int cantidad, largo;

        do {
            System.out.println("Ingrese cantidad de contraseñas a generar: ");
            cantidad = sca.nextInt();
        } while (cantidad <= 0);
        
        do {
            System.out.println("Ingrese longitud de las contraseñas: [10-50]");
            largo = sca.nextInt();
        } while (largo < 10 || largo > 50);
        
        //tengo un vector de referencias a objetos
        Password array[] = new Password[cantidad];
        boolean array2[] = new boolean[cantidad];
                
        for (int i = 0; i < cantidad; i++) {
            array[i] = new Password((int)(Math.random()*largo));
            array2[i] = array[i].esFuerte();
        }
        //tengo un vector de objetos
        System.out.println("Password *******\tEs fuerte?\n");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(array[i].getValor());
            System.out.print("\t");
            System.out.println(array2[i]? "SI": "NO");
        }
        
        //buscar y mostrar el pass de mayor longitud
        Password passLargo = array[0];
        for (int i = 1; i < cantidad; i++) {
            if(array[i].getLongitud()> passLargo.getLongitud())
                passLargo = array[i];
        }
        
        System.out.println("El password más largo es: " + passLargo.getValor());
        System.out.println("Con " + passLargo.getLongitud() + " caracteres!");
        
        //Determinar si existe un pass ingresado por teclado:
        System.out.println("Ingrese pass a buscar: ");
        String pass = sca2.next();
        for (Password x : array) {
            if(x.getValor().equals(pass)){
                System.out.println("Pass Encontrada!");
                break;
            }    
        }
    }
}
