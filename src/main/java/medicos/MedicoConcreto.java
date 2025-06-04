package medicos;

public class MedicoConcreto implements Medico {
    private String nombre;
    private int cargaPacientes;

    public MedicoConcreto(String nombre) {
        this.nombre = nombre;
        this.cargaPacientes = 0;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Dr. " + nombre + " recibió alerta: " + mensaje);
    }

    @Override
    public int getCargaPacientes() {
        return cargaPacientes;
    }

    @Override
    public void asignarPaciente() {
        cargaPacientes++;
    }

    public String getNombre() {
        return nombre;
    }
}
