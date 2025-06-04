package notificaciones;

import java.util.ArrayList;
import java.util.List;

import medicos.Medico;

public class NotificadorSignosVitales {
    private List<Medico> medicos;

    public NotificadorSignosVitales() {
        this.medicos = new ArrayList<>();
    }

    public void registrar(Medico medico) {
        medicos.add(medico);
    }

    public void notificar(String mensaje) {
        for (Medico medico : medicos) {
            medico.actualizar(mensaje);
        }
    }
    public List<Medico> getMedicos() {
        return medicos;
    }
}
