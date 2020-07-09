/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gui;

import com.example.model.Signo;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author MARTIN
 */
public class Figura extends JButton {

    private Signo signo;
    private static final String IMAGEN_DEF = "/com/example/resources/pregunta.png";

    public Figura() {
        super();
        this.signo = null;
        asignarIcono(null);
    }

    public Figura(Signo signo) {
        super();
        this.signo = signo;
        asignarIcono(signo.getNombreImagen());
    }

    public int ganarA(Figura fig) {
        return this.signo.ganarA(fig.signo);
    }
    
    public void actualizar(Figura figura) {
        if(figura != null){
            asignarIcono(figura.signo.getNombreImagen());
            this.signo = figura.signo;
        }
    }

    private void asignarIcono(String img) {
        if (img == null) {
            img = IMAGEN_DEF;
        }
        this.setIcon(new ImageIcon(getClass().getResource(img)));
    }

}
