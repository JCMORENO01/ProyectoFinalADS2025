package facade;

import java.util.ArrayList;
import java.util.List;

import historia.HistoriaClinica;
import laboratorio.SistemaLaboratorio;
import medicos.AsignadorMedicoPaciente;
import medicos.Medico;
import notificaciones.NotificadorSignosVitales;
import ordenes.OrdenMedica;
import pacientes.Paciente;
import pacientes.PacienteBuilder;
import recursos.Camilla;
import recursos.EquipoMedico;
import signos.SignosVitales;
import signos.Triaje;

public class HospitalFacade {
    private List<Medico> medicos;
    private NotificadorSignosVitales notificador;
    private SistemaLaboratorio laboratorio;
    private List<Camilla> camillas;
    private List<EquipoMedico> equipos;

    public HospitalFacade() {
        this.medicos = new ArrayList<>();
        this.notificador = new NotificadorSignosVitales();
        this.laboratorio = new SistemaLaboratorio();
        this.camillas = new ArrayList<>();
        this.equipos = new ArrayList<>();
        inicializarCamillasYEquipos();
    }

    private void inicializarCamillasYEquipos() {
        // Simulamos tener 5 camillas y 5 equipos
        for (int i = 1; i <= 5; i++) {
            camillas.add(new Camilla(i));
            equipos.add(new EquipoMedico(i));
        }
    }

    public void registrarMedico(Medico medico) {
        medicos.add(medico);
        notificador.registrar(medico);
    }

    public Paciente registrarPaciente(String nombre, String identificacion, int edad,
                                       String direccion, String contactoEmergencia,
                                       String alergias, String medicamentos,
                                       String seguroMedico, String historialVacunacion) {
        return new PacienteBuilder()
                .setNombre(nombre)
                .setIdentificacion(identificacion)
                .setEdad(edad)
                .setDireccion(direccion)
                .setContactoEmergencia(contactoEmergencia)
                .setAlergias(alergias)
                .setMedicamentos(medicamentos)
                .setSeguroMedico(seguroMedico)
                .setHistorialVacunacion(historialVacunacion)
                .build();
    }

    public void registrarSignosVitales(Paciente paciente, SignosVitales signos) {
        paciente.getHistoriaClinica().agregarSignosVitales(signos);

        if (signos.esCritico()) {
            notificador.notificar("¡Alerta crítica para paciente " + paciente.getNombre() + "!");
        }

        String prioridad = Triaje.calcularPrioridad(signos);
        System.out.println("Prioridad asignada: " + prioridad);
    }

    public void asignarPacienteAMedico(Paciente paciente) {
        Medico medico = AsignadorMedicoPaciente.asignarMedico(medicos);
        if (medico != null) {
            System.out.println("Paciente " + paciente.getNombre() + " asignado a " + ((medicos.MedicoConcreto) medico).getNombre());
        } else {
            System.out.println("No hay médicos disponibles en este momento.");
        }
    }

    public void generarOrdenMedica(Paciente paciente, String tipo, String descripcion) {
        OrdenMedica orden = new OrdenMedica(tipo, descripcion);
        paciente.getHistoriaClinica().agregarOrdenMedica(orden);
        System.out.println("Orden médica creada para paciente " + paciente.getNombre() + ": " + tipo + " - " + descripcion);
    }

    public void cargarResultadoLaboratorio(Paciente paciente, String examen, double resultado) {
        laboratorio.cargarResultado(paciente, examen, resultado);
    }

    public void consultarHistoriaClinica(Paciente paciente) {
        HistoriaClinica historia = paciente.getHistoriaClinica();
        System.out.println("Historia clínica de " + paciente.getNombre() + ":");
        historia.mostrarHistoria();
    }

    public void actualizarEstadoCamilla(int id, String estado) {
        for (Camilla camilla : camillas) {
            if (camilla.getId() == id) {
                camilla.setEstado(estado);
                System.out.println("Estado de camilla " + id + " actualizado a: " + estado);
                return;
            }
        }
        System.out.println("Camilla no encontrada.");
    }

    public void actualizarEstadoEquipo(int id, String estado) {
        for (EquipoMedico equipo : equipos) {
            if (equipo.getId() == id) {
                equipo.setEstado(estado);
                System.out.println("Estado de equipo " + id + " actualizado a: " + estado);
                return;
            }
        }
        System.out.println("Equipo médico no encontrado.");
    }

public void mostrarCamillas() {
    System.out.println("Estado de camillas:");
    for (Camilla camilla : camillas) {
        System.out.println(camilla);
    }
}

// Mostrar todos los equipos médicos con su estado
public void mostrarEquipos() {
    System.out.println("Estado de equipos médicos:");
    for (EquipoMedico equipo : equipos) {
        System.out.println(equipo);
    }
}
}
