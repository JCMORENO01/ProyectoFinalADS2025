package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import facade.HospitalFacade;
import medicos.MedicoConcreto;
import pacientes.Paciente;
import signos.SignosVitales;

public class HospitalFacadeIntegrationTest {

    private HospitalFacade hospital;

    @BeforeEach
    public void setUp() {
        hospital = new HospitalFacade();
        hospital.registrarMedico(new MedicoConcreto("Dr. Juan Pérez"));
    }

    @Test
    public void testFlujoCompleto() {
        Paciente paciente = hospital.registrarPaciente(
                "Ana María", "123456789", 28, "Calle 10", 
                "Carlos", "Ninguna", "Ninguno", 
                "EPS Salud", "Covid-19, Hepatitis B"
        );

        assertNotNull(paciente);
        assertEquals("Ana María", paciente.getNombre());

        SignosVitales signos = new SignosVitales(39.0, 100, 150, 90, 85);
        hospital.registrarSignosVitales(paciente, signos);

        assertFalse(paciente.getHistoriaClinica().getHistorialSignosVitales().isEmpty());

        hospital.generarOrdenMedica(paciente, "Examen", "Rayos X");


    }
}