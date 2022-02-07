package edu.poniperro.cotox.tarifa;

import edu.poniperro.cotox.carrera.Carrera;

public class Tarifa {
    final static double COSTE_MILLA = 1.35;
    final static double COSTE_MINUTO = 0.35;
    final static double COSTE_MINIMO = 5.0;
    final static byte COMISION = 20;

    public double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }
    public double getCosteTiempo(int minutos) {
        return minutos * COSTE_MINUTO;
    }
    public double getCosteTotalEsperado(Carrera carrera) {
        double costeTotal = getCosteDistancia() + getCosteTiempo(carrera.getTiempo())
    }
}
