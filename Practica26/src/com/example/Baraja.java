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
public class Baraja {

    private Carta maso[];
    private int siguiente;

    public Baraja() {
        maso = new Carta[40];
        siguiente = 0;
        inicializarCartas();
    }

    public String mostrarBaraja() {
        String aux = "";
        for (Carta carta : maso) {
            aux += carta.toString() + "\n";
        }
        return aux;
    }

    private void inicializarCartas() {
        char[] palos = {'o', 'e', 'b', 'c'};
        //int k=0;
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < 10; j++) {
                int pos = i * 10 + j;

                if (j <= 6) {
                    maso[pos] = new Carta(j + 1, palos[i]);
                } else {
                    maso[pos] = new Carta(j + 3, palos[i]);
                }
                //k++;
            }

        }
    }

    public void barajar() {
        for (int i = 0; i < maso.length; i++) {
            int pos = (int) (Math.random() * 40);
            Carta aux = maso[i];
            maso[i] = maso[pos];
            maso[pos] = aux;

        }
    }

    public Carta siguienteCarta() {
        Carta c = null;
        if (siguiente <= 39) {
            c = maso[siguiente];
            siguiente++;
                    
        }

        return c;
    }

}
