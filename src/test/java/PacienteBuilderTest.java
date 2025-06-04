package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pacientes.Paciente;

public class PacienteBuilderTest {

    @Test
    public void testPacienteBuilder() {
        Paciente paciente = Paciente.builder()
                .setNombre("Juan Pérez")
                .setIdentificacion("123456789")
                .setEdad(30)
                .setDireccion("Calle 123")
                .setContactoEmergencia("María López")
                .setAlergias("Penicilina")
                .setMedicamentos("Ibuprofeno")
                .setSeguroMedico("SaludTotal")
                .setHistorialVacunacion("Covid-19")
                .build();

        assertEquals("Juan Pérez", paciente.getNombre());
        assertEquals("123456789", paciente.getIdentificacion());
        assertEquals(30, paciente.getEdad());
    }
}
