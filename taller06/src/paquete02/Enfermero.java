/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author josed
 */
public class Enfermero {
    private String[] nombre;
    private String[] tipo;
    private double[] sueldoMensual;

    public Enfermero(String[] a, String[] b, double[] c) {
        nombre = a;
        tipo = b;
        sueldoMensual = c;
    }

    public void establecerNombreEn(String[] a) {
        nombre = a;
    }

    public void establecerTipoCon(String[] a) {
        tipo = a;
    }

    public void establecerSueldoMensual(double[] a) {
        sueldoMensual = a;
    }

    public String[] obtenerNombreEn() {
        return nombre;
    }

    public String[] obtenerTipoCon() {
        return tipo;
    }

    public double[] obtenerSueldoMensual() {
        return sueldoMensual;
    }
    
}
