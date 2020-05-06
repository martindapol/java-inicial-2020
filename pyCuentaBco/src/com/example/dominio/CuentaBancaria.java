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
public class CuentaBancaria {

    //campos o atributos:

    private long codigo;
    private String titular;
    private float saldo;

    //métodos:
    public CuentaBancaria() {
        codigo = 0;
        titular = "S/D";
        saldo = 0;
    }

    public CuentaBancaria(long codigo, String titular) {
        this.codigo = codigo;
        this.titular = titular;
        saldo = 0;
    }

    //métodos de acceso y modificación de los atributos:
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    //propio de la clase: no visible desde fuera.
    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //métodos propios de las clases:   
    public void depositar(float monto) {
        saldo += monto;
    }

    public void extraer(float monto) {
        saldo -= monto;
    }

}
