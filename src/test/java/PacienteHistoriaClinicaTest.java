package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ordenes.OrdenMedica;
import pacientes.Paciente;
import pacientes.PacienteBuilder;
import signos.SignosVitales;

public class PacienteHistoriaClinicaTest {

    @Test
    public void testHistoriaClinicaRegistro() {
        Paciente paciente = new PacienteBuilder()
                .setNombre("Laura González")
                .setIdentificacion("1122334455")
                .setEdad(35)
                .setDireccion("Calle 50")
                .setContactoEmergencia("María")
                .setAlergias("Aspirina")
                .setMedicamentos("Paracetamol")
                .setSeguroMedico("Nueva EPS")
                .setHistorialVacunacion("Covid-19")
                .build();

        SignosVitales signos = new SignosVitales(37.5, 80, 120, 80, 98);
        paciente.getHistoriaClinica().agregarSignosVitales(signos);

        assertEquals(1, paciente.getHistoriaClinica().getHistorialSignosVitales().size());

        OrdenMedica orden = new OrdenMedica("Medicamento", "Ibuprofeno 400mg");
        paciente.getHistoriaClinica().agregarOrdenMedica(orden);

        assertEquals(1, paciente.getHistoriaClinica().getOrdenesMedicas().size());
    }
}