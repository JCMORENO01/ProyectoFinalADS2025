package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ordenes.OrdenMedica;
import pacientes.Paciente;
import pacientes.PacienteBuilder;

public class OrdenMedicaIntegrationTest {

    @Test
    public void testOrdenMedicaEnHistoriaClinica() {
        Paciente paciente = new PacienteBuilder()
                .setNombre("Luis Ramírez")
                .setIdentificacion("99887766")
                .setEdad(40)
                .setDireccion("Calle 123")
                .setContactoEmergencia("Paula Díaz")
                .setAlergias("Ninguna")
                .setMedicamentos("Ninguno")
                .setSeguroMedico("Sura")
                .setHistorialVacunacion("Covid-19")
                .build();

        OrdenMedica orden = new OrdenMedica("Examen", "Resonancia magnética");

        paciente.getHistoriaClinica().agregarOrdenMedica(orden);

        assertEquals(1, paciente.getHistoriaClinica().getOrdenesMedicas().size());
        assertEquals("Examen", paciente.getHistoriaClinica().getOrdenesMedicas().get(0).getTipo());
        assertEquals("Resonancia magnética", paciente.getHistoriaClinica().getOrdenesMedicas().get(0).getDescripcion());

        paciente.getHistoriaClinica().getOrdenesMedicas().get(0).aceptarOrden();

        assertEquals("Aceptado", paciente.getHistoriaClinica().getOrdenesMedicas().get(0).getEstado());
    }
}