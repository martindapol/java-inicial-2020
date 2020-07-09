/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTIN
 */
public class PersistFile {

    public static void save(Object o, String fileName) throws IOException{
            //Cargar lista desde el archivo:
            List lst = read(fileName);
            if(lst == null)
                lst = new ArrayList<>();
            
            lst.add(o);
            //Abrir archivo y grabar lista de objetos:
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lst);
            
            //cerrar flujos:
            oos.close();
            fos.close();
    }
 
    public static List read(String fileName) {
        
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            List lst; 
            lst = (List) ois.readObject();
            return (List)lst.get(0);
        } catch (ClassNotFoundException | IOException ex) {
            return null;
        }
    }
}
