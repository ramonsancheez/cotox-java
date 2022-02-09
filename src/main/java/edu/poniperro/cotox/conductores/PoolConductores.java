package edu.poniperro.cotox.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores {
    private List<Conductor> poolConductores = new ArrayList<Conductor>();

    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }
    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }

    public Conductor asignarConductor() {
        Conductor conductor = new Conductor();
        Random aleatorio = new Random();
        boolean asignado = false;
        while (!asignado) {
            int index = aleatorio.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(index);
            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                asignado = true;
            }
        }
        return conductor;
        }
    }

