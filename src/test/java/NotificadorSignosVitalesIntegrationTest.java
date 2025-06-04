package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import medicos.MedicoConcreto;
import notificaciones.NotificadorSignosVitales;

public class NotificadorSignosVitalesIntegrationTest {

    @Test
    public void testNotificacionMedicos() {
        NotificadorSignosVitales notificador = new NotificadorSignosVitales();
        MedicoConcreto medico1 = new MedicoConcreto("Dra. Lina Vásquez");
        MedicoConcreto medico2 = new MedicoConcreto("Dr. Pablo Ruiz");

        notificador.registrar(medico1);
        notificador.registrar(medico2);

        assertEquals(2, notificador.getMedicos().size());

        // Simula una notificación
        notificador.notificar("Paciente en estado crítico");
    }
}