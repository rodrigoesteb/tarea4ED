/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Clase CCuenta representa una cuenta bancaria
 * @author rdrge
 * @version 06.03.2022
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
    * Constructor sin arumentos
    */
    public CCuenta()
    {
    }

    /**
    * Constructor de la clase
    * @param nom nombre del titular
    * @param cue IBAN bancario
    * @param sal saldo de la cuenta
    * @param tipo no se utiliza
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
    * Método que devuelve el saldo actual de la cuenta
    * @return saldo actual del objeto CCuenta
    */
    public double estado()
    {
        return getSaldo();
    }

    /**
    * Método que ingresa una cantidad dada por parámetro
    * @param cantidad cantidad a ingresar
    * @throws Exception una excepción en caso de intentar ingresar una cantidad negativa
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
    * Método que retira una cantidad dada por parámetro
    * @param cantidad cantidad a retirar
    * @throws Exception una excepción en caso de intentar retirar una cantidad negativa o superior al saldo disponible
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
