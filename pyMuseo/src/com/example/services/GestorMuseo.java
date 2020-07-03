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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class GestorMuseo {
   private List<Sala> salas;

    public GestorMuseo() {
        salas = new ArrayList<>();
        
        //Recuperar los objetos de mi modelo persistente(por ahora solo modo prueba):
        //A modo de prueba:
        Sala s1 = new Sala();
        Sala s2 = new Sala();
        
        s1.setNombre("Sala A");
        s1.setAla("Sur");
        s1.agregarObjeto(new Historico("Central", "Africa", 1, "leon viejo", -300));
        
        s2.setNombre("Sala D");
        s2.agregarObjeto(new ObraArte("Van Gogh", "Holanda",2,"Los girasoles", 1890));
    
        salas.add(s1);
        salas.add(s2);
    }

    public Object[] getSalas() {
       return salas.toArray();
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
    
     public void agregarObjeto(ObjetoExp obj, String s){
        for (Sala sala : salas) {
            if(sala.getNombre().equals(s)){
                sala.addObjeto(obj);
                break;
            }
        }
    }
   
   
   
   
}
