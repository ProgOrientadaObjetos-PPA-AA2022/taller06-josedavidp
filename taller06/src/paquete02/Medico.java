/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author josed
 */
public class Medico {

    private String[] nombreDoctor;
    private String[] especialidadDoctor;
    private double[] sueldoMensual;

    public Medico(String[] a, String[] b, double[] c) {
        nombreDoctor = a;
        especialidadDoctor = b;
        sueldoMensual = c;
    }

    public void establecerNombreDoc(String[] a) {
        nombreDoctor = a;
    }

    public void establecerEspecialidadDoc(String[] a) {
        especialidadDoctor = a;
    }

    public void establecerSueldoMensual(double[] a) {
        sueldoMensual = a;
    }

    public String[] obtenerNombreDoc() {
        return nombreDoctor;
    }

    public String[] obtenerEspecialidadDoc() {
        return especialidadDoctor;
    }

    public double[] obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
