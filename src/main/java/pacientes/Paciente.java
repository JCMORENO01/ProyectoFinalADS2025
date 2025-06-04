package pacientes;

import historia.HistoriaClinica;

public class Paciente {
    private String nombre;
    private String identificacion;
    private int edad;
    private String direccion;
    private String contactoEmergencia;
    private String alergias;
    private String medicamentos;
    private String seguroMedico;
    private String historialVacunacion;
    private HistoriaClinica historiaClinica;

    // Constructor público para Builder
    public Paciente(PacienteBuilder builder) {
        this.nombre = builder.nombre;
        this.identificacion = builder.identificacion;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
        this.contactoEmergencia = builder.contactoEmergencia;
        this.alergias = builder.alergias;
        this.medicamentos = builder.medicamentos;
        this.seguroMedico = builder.seguroMedico;
        this.historialVacunacion = builder.historialVacunacion;
        this.historiaClinica = new HistoriaClinica(this.alergias, this.medicamentos);
    }

    public static PacienteBuilder builder() {
        return new PacienteBuilder();
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public int getEdad() { return edad; }
    public String getDireccion() { return direccion; }
    public String getContactoEmergencia() { return contactoEmergencia; }
    public String getAlergias() { return alergias; }
    public String getMedicamentos() { return medicamentos; }
    public String getSeguroMedico() { return seguroMedico; }
    public String getHistorialVacunacion() { return historialVacunacion; }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
