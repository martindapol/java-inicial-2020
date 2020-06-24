/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lautaro
 */
public class Empresa {
    private String cuit, razonSocial;
    private List<Trabajador> empleados;

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>(30);
    }

    public Empresa() {
        cuit = "23-48644943-3";
        razonSocial = "ChoriSoft-Entreprise-TeneHoraAmego";
        this.empleados = new ArrayList<>(30);
    }

    public boolean agregarEmpleado(Trabajador empleado) {
        return empleados.add(empleado);
    }

    public int totalEmpleados() {
        return empleados.size();
    }

    public boolean incrementarSueldo(int porc, String nombre) {
        return false;
    }

    public int presupustoMensual() {
        int presupuesto = 0;

        for (Trabajador empleado : empleados) {
            presupuesto += empleado.calcularPaga();
        }

        return presupuesto;
    }

    public String mostrarNomina(int criterio) {
        StringBuilder nomina = new StringBuilder("");

        if(criterio != 1)
            Collections.sort(empleados, new CriterioPuestoComparator());
        else
            Collections.sort(empleados);
       /* for (int i = 0; i < empleados.size() - 1; i++) {
            for (int j = i + 1; j < empleados.size(); j++) {
                if (empleados.get(i).getNombre().compareTo(empleados.get(j).getNombre()) > 0) {
                    Trabajador aux = empleados.get(i);
                    empleados.set(i, empleados.get(j));
                    empleados.set(j, aux);
                }
            }
        }
        */
        
        for (Trabajador empleado : empleados) {
            nomina.append(empleado.toString() + "\n");
        }

        return nomina.toString();
    }
}
