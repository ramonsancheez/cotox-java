package edu.poniperro.cotox.carrera;

import edu.poniperro.cotox.conductores.Conductor;
import edu.poniperro.cotox.conductores.PoolConductores;
import edu.poniperro.cotox.tarifa.Tarifa;

public class Carrera {
    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;
    private double distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0d;
    private int propina = 0;
    private Conductor conductor = null;

    public Carrera (String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public int getTiempoEsperado() {
        return tiempoEsperado;
    }
    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }
    public double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
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
        getConductor().setOcupado(true);
    }
    public void asignarConductor(PoolConductores poolConductores) {
        setConductor(poolConductores.asignarConductor());
    }
    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }
    public double getCosteTotal() {
        return costeTotal;
    }
    public void recibirPropina(int pago) {
        this.propina = pago;
    }
    public double getPropina() {
        return propina;
    }
    public void liberarConductor(){
        getConductor().setOcupado(false);
    }

}

