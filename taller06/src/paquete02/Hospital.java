/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author josed
 */
public class Hospital {
    private String nombreHosp;
    private Ciudad ciudadHosp;
    private int numeroEs;
    private Medico medico;
    private Enfermero enfermero;
    private double sueldos;

    public Hospital(String a, Ciudad b,
            Medico d, Enfermero e) {
        nombreHosp = a;
        ciudadHosp = b;
        medico = d;
        enfermero = e;

    }

    public void establecerNombreHosp(String a) {
        nombreHosp = a;
    }

    public void establecerCiudadHosp(Ciudad a) {
        ciudadHosp = a;
    }

    public void establecerNumeroEs(int a, int g) {
        numeroEs = a + g;
    }

    public void establecerMedico(Medico a) {
        medico = a;
    }

    public void establecerEnfermeros(Enfermero a) {
        enfermero = a;
    }

    public void establecerSueldos(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        sueldos = sum;
    }

    public String obtenerNombreHosp() {
        return nombreHosp;
    }

    public Ciudad obtenerCiudadHosp() {
        return ciudadHosp;
    }

    public int obtenerNumeroEs() {
        return numeroEs;
    }

    public Medico obtenerMedico() {
        return medico;
    }

    public Enfermero obtenerEnfermeros() {
        return enfermero;
    }

    public double obtenerSueldos() {
        return sueldos;
    }
    
    @Override
    public String toString() {
        
        String cadenaFinal1 = "";
        String cadenaFinal2 = "";
        String cadenaFinal3;

        for (int i = 0; i < obtenerMedico().obtenerSueldoMensual().length; i++) {
            cadenaFinal1 = String.format("%s\n- %s - Sueldo: %.2f - %s",cadenaFinal1,
                    obtenerMedico().obtenerNombreDoc()[i],
                    obtenerMedico().obtenerSueldoMensual()[i],
                    obtenerMedico().obtenerEspecialidadDoc()[i]);
        }
        
        for (int i = 0; i < obtenerEnfermeros().obtenerSueldoMensual().length; i++) {
            cadenaFinal2 = String.format("%s\n- %s - Sueldo: %.2f - %s",cadenaFinal2,
                    obtenerEnfermeros().obtenerNombreEn()[i],
                    obtenerEnfermeros().obtenerSueldoMensual()[i],
                    obtenerEnfermeros().obtenerTipoCon()[i]);
        }
        cadenaFinal3 = String.format("%s\nDireccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Numero de especialidades: %d\n"
                + "Listado de Médicos:%s\n"
                + "Listado de Enfermeros(as):%s\n"
                + "Total de sueldos a pagar por mes: $%.2f\n", obtenerNombreHosp(),
                obtenerCiudadHosp().obtenerDir(),
                obtenerCiudadHosp().obtenerCiudad(),
                obtenerCiudadHosp().obtenerProvincia(),
                obtenerNumeroEs(), cadenaFinal1, cadenaFinal2,
                obtenerSueldos());

        return cadenaFinal3;
    }
}
