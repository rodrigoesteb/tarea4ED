/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Clase principal de la aplicación
 * @author rdrge
 * @version 06.03.2022
 */
public class Main {
    static protected CCuenta cuenta1;
    static protected double saldoActual;

    public static void main(String[] args) {
        operativa_cuenta("Antonio López", "1000-2365-85-1230456789", 2500 , 0, 0);
    }

    protected static void operativa_cuenta(String nombre, String cuenta, double saldo, double interes, float cantidad) {
        cuenta1 = new CCuenta(nombre, cuenta, saldo, interes);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}