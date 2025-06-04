package laboratorio;

import pacientes.Paciente;

public class SistemaLaboratorio {

    public void cargarResultado(Paciente paciente, String examen, double valor) {
        System.out.println("Resultado registrado para paciente " + paciente.getNombre() +
                ": Examen - " + examen + ", Valor - " + valor);

        if (esCritico(examen, valor)) {
            System.out.println("¡Resultado crítico detectado para " + paciente.getNombre() + "! Notificar inmediatamente.");
        }
    }

    private boolean esCritico(String examen, double valor) {
        // Solo ejemplos basados en los requerimientos:
        switch (examen.toLowerCase()) {
            case "troponina":
                return valor > 0.1;
            case "potasio":
                return valor > 6.0;
            case "glucosa":
                return valor < 60 || valor > 400;
            default:
                return false;
        }
    }
}
