/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author MARTIN
 */
public class Carta {

    private int numero;
    private char palo;

    public Carta(int numero, char palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getPalo() {
        return palo;
    }

    public void setPalo(char palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "[" + numero + "-" + mostrarPalo() + "]";
    }

    private String mostrarPalo() {
        String aux = null;
        switch (palo) {
            case 'b':
                aux = "Basto";
                break;
            case 'c':
                aux = "Copa";
                break;
            case 'o': 
                aux = "Oro";
                break;
            default:
                aux = "Espada";
        }
        return aux;
    }

}
