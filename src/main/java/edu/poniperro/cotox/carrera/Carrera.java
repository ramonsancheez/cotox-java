package edu.poniperro.cotox.carrera;

import edu.poniperro.cotox.conductor.Conductor;

public class Carrera {
    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;
    private double distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private int propina = 0;
    private Conductor conductor = null;

    public Carrera (String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getOrigen() {
        return this.origen;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getDestino() {return this.destino;}
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getDistancia() {
        return this.distancia = distancia;
    }
    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }
    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }
    public int getTiempoCarrera() {
        return tiempoCarrera;
    }
    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }
    public Conductor getConductor() {
        return conductor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}

