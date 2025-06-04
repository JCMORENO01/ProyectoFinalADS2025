
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import medicos.MedicoConcreto;

public class MedicoConcretoTest {

    @Test
    public void testAsignarPaciente() {
        MedicoConcreto medico = new MedicoConcreto("Dr. House");
        assertEquals(0, medico.getCargaPacientes());

        medico.asignarPaciente();
        assertEquals(1, medico.getCargaPacientes());
    }
}
