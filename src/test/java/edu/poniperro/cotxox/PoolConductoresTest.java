package edu.poniperro.cotxox;
import static org.junit.Assert.*;

import edu.poniperro.cotox.conductores.Conductor;
import edu.poniperro.cotox.conductores.PoolConductores;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PoolConductoresTest {
    Conductor conductor1 = new Conductor("Juan");
    Conductor conductor2 = new Conductor("Luis");
    List<Conductor> listaDeConductores = new ArrayList<Conductor>();

    @Test
    public void setPoolConductoresTest(){
        listaDeConductores.add(conductor1); listaDeConductores.add(conductor2);
        PoolConductores nuestrosConductores = new PoolConductores(listaDeConductores);
        assertEquals(listaDeConductores ,nuestrosConductores.getPoolConductores());
    }
    @Test
    public void setPoolConductoresTest2(){
        listaDeConductores.add(conductor1); listaDeConductores.add(conductor2);
        List<Conductor> soloUno = new ArrayList<Conductor>(); soloUno.add(conductor1);
        PoolConductores soloDos = new PoolConductores(soloUno);
        assertNotEquals(listaDeConductores ,soloDos.getPoolConductores());
    }
}
