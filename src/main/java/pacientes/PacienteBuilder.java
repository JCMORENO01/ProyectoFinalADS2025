package pacientes;

public class PacienteBuilder {
    // 👇 Aquí van los mismos atributos que en Paciente
    protected String nombre;
    protected String identificacion;
    protected int edad;
    protected String direccion;
    protected String contactoEmergencia;
    protected String alergias;
    protected String medicamentos;
    protected String seguroMedico;
    protected String historialVacunacion;

    // Métodos setter estilo Builder
    public PacienteBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PacienteBuilder setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
        return this;
    }

    public PacienteBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public PacienteBuilder setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public PacienteBuilder setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
        return this;
    }

    public PacienteBuilder setAlergias(String alergias) {
        this.alergias = alergias;
        return this;
    }

    public PacienteBuilder setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
        return this;
    }

    public PacienteBuilder setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
        return this;
    }

    public PacienteBuilder setHistorialVacunacion(String historialVacunacion) {
        this.historialVacunacion = historialVacunacion;
        return this;
    }

    public Paciente build() {
        return new Paciente(this);
    }
}
