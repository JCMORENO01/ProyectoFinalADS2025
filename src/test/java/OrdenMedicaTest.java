
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ordenes.OrdenMedica;

public class OrdenMedicaTest {

    @Test
    public void testAceptarOrden() {
        OrdenMedica orden = new OrdenMedica("Medicamento", "Paracetamol 500mg cada 8 horas");
        assertEquals("En trámite", orden.getEstado());

        orden.aceptarOrden();
        assertEquals("Aceptado", orden.getEstado());
    }
}
