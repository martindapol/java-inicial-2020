/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.util.Comparator;

/**
 *
 * @author MARTIN
 */
public class CriterioPuestoComparator  implements Comparator<Trabajador>{

    @Override
    public int compare(Trabajador t, Trabajador t1) {
        return t.getPuesto().compareTo(t1.getPuesto());
    }
     
}
