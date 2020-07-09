/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gui;

import com.example.model.Signo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MARTIN
 */
public class JFJuego extends javax.swing.JFrame {

    private Figura figuras[];
    private Figura figuraUsuario, figuraPc;
    private JLabel jlResultado;
    private JPanel pnlCentro;

    /**
     * Creates new form JFJuego
     */
    public JFJuego() {
        //initComponents();
        iniciarFiguras();
        iniciarComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void iniciarFiguras() {
        figuras = new Figura[3];
        figuras[0] = new Figura(new Signo("piedra", "tijera"));
        figuras[1] = new Figura(new Signo("papel", "piedra"));
        figuras[2] = new Figura(new Signo("tijera", "papel"));
        for (Figura x : figuras) {
            x.addActionListener(new EscuchaFigura());
        }
    }

    private void iniciarComponentes() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Piedra, Papel, Tijera...");

        //panel Superior: Etiqueta + 3 figuras
        JPanel pnlSuperior = new JPanel();
        pnlSuperior.setLayout(new BoxLayout(pnlSuperior, BoxLayout.Y_AXIS));
        pnlSuperior.add(new JLabel("Elija una figura:"));
        pnlSuperior.setAlignmentX(LEFT_ALIGNMENT);
        JPanel pnlFiguras = new JPanel(new FlowLayout());

        pnlFiguras.add(figuras[0]);
        pnlFiguras.add(figuras[1]);
        pnlFiguras.add(figuras[2]);
        pnlSuperior.add(pnlFiguras);

        //panel centro: figura elegida + figura randomizada por la maquina
        pnlCentro = new JPanel(new GridLayout(1, 2, 8, 8));
        figuraUsuario = new Figura();
        figuraUsuario.setEnabled(false);
        figuraPc = new Figura();
        figuraPc.setEnabled(false);
        pnlCentro.add(figuraUsuario);
        pnlCentro.add(figuraPc);

        //panel Inferior:
        JPanel pnlInferior = new JPanel(new FlowLayout());
        jlResultado = new JLabel("Usted: ");
        jlResultado.setForeground(Color.BLUE);
        pnlInferior.add(jlResultado);

        //Panel principal:
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());
        panel.add(pnlSuperior, BorderLayout.NORTH);
        panel.add(pnlCentro, BorderLayout.CENTER);
        panel.add(pnlInferior, BorderLayout.SOUTH);

        pack();
    }

    class EscuchaFigura implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            figuraUsuario.actualizar((Figura) ae.getSource());
            //elegir aleatororiamente una figura
            int i = (int) (Math.random() * 3);
            figuraPc.actualizar(figuras[i]);

            int r = figuraUsuario.ganarA(figuraPc);
            if (r == 0) {
                jlResultado.setText("Usted: EMPATA");
            } else if (r > 0) {
                jlResultado.setText("Usted: GANA");
            } else {
                jlResultado.setText("Usted: PIERDE");
            }
        }

    }
}