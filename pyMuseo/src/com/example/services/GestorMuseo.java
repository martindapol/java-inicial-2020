/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.domain.Historico;
import com.example.domain.ObjetoExp;
import com.example.domain.ObraArte;
import com.example.domain.Sala;
import com.example.utils.PersistFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class GestorMuseo {
   private List<Sala> salas;

    public GestorMuseo() {
        salas = PersistFile.read("museo.dat");
    }

    public Object[] getSalas() {
        if(salas != null)
            return salas.toArray();
        
       return null;
    }
   
    public List consultarObjetosSala(String sala){
        List aux = new ArrayList();
            for (Sala x : salas) {
                if(x.getNombre().equals(sala)){
                    aux = x.getObjetos();
                    break;
                }
        }
        
        return aux;
    }
    
     public void agregarObjeto(ObjetoExp obj, String s) throws IOException{
        for (Sala sala : salas) {
            if(sala.getNombre().equals(s)){
                sala.addObjeto(obj);
                PersistFile.save(salas, "museo.dat");
                break;
            }
        }
    }
   
   
   
   
}
