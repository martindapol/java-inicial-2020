/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.domain.Historico;
import com.example.domain.ObraArte;
import com.example.domain.Sala;
import com.example.utils.PersistFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTIN
 */
public class TestMuseoFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Sala> salas = new ArrayList<>();

        //Recuperar los objetos de mi modelo persistente(por ahora solo modo prueba):
        //A modo de prueba:
        Sala s1 = new Sala();
        Sala s2 = new Sala();

        s1.setNombre("Sala A");
        s1.setAla("Sur");
        s1.agregarObjeto(new Historico("Central", "Africa", 1, "leon viejo", -300));

        s2.setNombre("Sala D");
        s2.agregarObjeto(new ObraArte("Van Gogh", "Holanda", 2, "Los girasoles", 1890));

        salas.add(s1);
        salas.add(s2);
        
        try {
            PersistFile.save(salas, "museo.dat");
        } catch (IOException ex) {
            System.out.println("No se pudo crear el archivo!");
        }
        
    }

}
