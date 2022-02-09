package edu.poniperro.cotox.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<Byte>();
    public Conductor() {
    }
    public Conductor(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getValoracion() {
        return valoracionMedia;
    }
    public void setValoracion(Byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }
    private double calcularValoracionMedia() {
        int sumaValoraciones = 0;
        for (byte valoracion : this.valoraciones) {
            sumaValoraciones += valoracion;
        }
        this.valoracionMedia = (double) sumaValoraciones / this.valoraciones.size();
        return this.valoracionMedia;
    }
    public boolean isOcupado() {
        return this.ocupado;
    }
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }
}
