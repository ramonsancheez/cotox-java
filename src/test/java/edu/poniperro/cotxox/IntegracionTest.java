package edu.poniperro.cotxox;

import edu.poniperro.cotox.carrera.Carrera;
import edu.poniperro.cotox.conductores.Conductor;
import edu.poniperro.cotox.conductores.PoolConductores;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class IntegracionTest {
    Conductor taxista1 = new Conductor("Juan");
    Conductor taxista2 = new Conductor("Luis");
    Conductor taxista3 = new Conductor("Arturo");
    Carrera llamada = new Carrera("ugcethbv453");
    List<Conductor> listaConductores = new ArrayList<Conductor>();

    @Test
    public void asignarConductorCentral(){
        listaConductores.add(taxista1); listaConductores.add(taxista2); listaConductores.add(taxista3);
        PoolConductores central = new PoolConductores(listaConductores);
        boolean isOcupado = true;
        llamada.asignarConductor(central);
        assertEquals(isOcupado, llamada.getConductor().isOcupado());
        llamada.liberarConductor();
        assertNotEquals(isOcupado, llamada.getConductor().isOcupado());
        // CASO DE USO
        // La central recibe la llamada del cliente para pedir un taxi. La central asigna un taxi. El taxista le da a ocupado.
        // Cobra, y al acabar le vuelve a dar al boton para estar en libre.
    }

    @Test
    public void asignarConductorDirectamente() {
        boolean isOcupado = true;
        assertNotEquals(isOcupado, taxista1.isOcupado());
        llamada.setConductor(taxista1);
        assertEquals(isOcupado, llamada.getConductor().isOcupado());
        // CASO DE USO
        // Paran al taxista directamente en la calle, le da al botón de ocupado.
        // Realiza el trayecto y vuelve a ponerse en libre
    }
}
