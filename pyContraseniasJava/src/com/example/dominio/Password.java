/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.util.Random;

/**
 *
 * @author MARTIN
 */
public class Password {

    private int longitud;
    private String valor;

    public Password() {
        longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public String getValor() {
        return valor;
    }

    public boolean esFuerte() {
        boolean aux;
        char letra;
        int ascii, cMay, cMin, cNum;
        cMay = cMin = cNum = 0;
        
        for (int i = 0; i < longitud; i++) {
            letra = valor.charAt(i);
            ascii = letra; // guarda el valor ascii de la letra en ascii

            if (ascii >= 48 && ascii <= 57) {
                cNum++;
            } else if (ascii >= 65 && ascii <= 90) {
                //mayúscula
                cMay++;
            } else if (ascii >= 97 && ascii <= 122) //minúscula
            {
                cMin++;
            }
        }
        aux = cNum>=5 && cMay >2 && cMin >1;
        //cuerpo del método
        return aux;
    }
    
    private void generarPassword(){
        String aux = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0987654321";
        valor = "";
        for(int i = 0; i< longitud; i++){
            int pos = (int)(Math.random()* aux.length());//[0;61]
            valor = valor + aux.charAt(pos);
        }
    }
    
}
