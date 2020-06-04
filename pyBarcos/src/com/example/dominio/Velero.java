/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

/**
 *
 * @author MARTIN
 */
public class Velero extends Barco {
    private float costoServicios;
 
    public Velero() {
        super();
        costoServicios = 0;
    }

    public Velero(float costoServicios, String nombre, String patente) {
        super(nombre, patente);
        this.costoServicios = costoServicios;
        
    }

    public Velero(String nombre, String patente) {
        super(nombre, patente);
        costoServicios = 0;
    }

    public float getCostoServicios() {
        return costoServicios;
    }

    public void setCostoServicios(float costoServicios) {
        this.costoServicios = costoServicios;
    }

    @Override
    public float calcularCuota() {
        //Refinando el comportamiento heredado
        return 100*30 + costoServicios;
    }

    @Override
    public String toString() {
        //especializando el comportamiento heredado
        
        return super.toString() + " |Costo de servicios $ " + costoServicios; 
    }
}
