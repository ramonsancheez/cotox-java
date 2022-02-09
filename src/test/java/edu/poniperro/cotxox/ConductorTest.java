package edu.poniperro.cotxox;

import edu.poniperro.cotox.conductores.Conductor;
import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.*;

public class ConductorTest {

    @Test
    public void valoracionMediaTest(){
        double delta = 0.01;
        Conductor taxista = new Conductor("David");
        Byte nota = 0;
        double notaMedia1 = 0;
        taxista.setValoracion(nota);
        assertEquals(notaMedia1, taxista.getValoracion(), delta);
        nota = 8;
        double notaMedia2 = 4;
        taxista.setValoracion(nota);
        assertEquals(notaMedia2, taxista.getValoracion(), delta);
         //CASO DE USO
        //Se valora al taxista y cambia su nota media

    }
}
