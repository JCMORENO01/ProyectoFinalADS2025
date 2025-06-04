package medicos;

import java.util.List;

public class AsignadorMedicoPaciente {

    public static Medico asignarMedico(List<Medico> medicos) {
        Medico seleccionado = null;
        int menorCarga = Integer.MAX_VALUE;

        for (Medico m : medicos) {
            if (m.getCargaPacientes() < menorCarga) {
                menorCarga = m.getCargaPacientes();
                seleccionado = m;
            }
        }

        if (seleccionado != null) {
            seleccionado.asignarPaciente();
        }

        return seleccionado;
    }
}
