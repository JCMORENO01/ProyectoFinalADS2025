package ordenes;

public class OrdenMedica {
    private String tipo;        // Medicamento, Examen, Procedimiento, Incapacidad
    private String descripcion; // Detalles de la orden
    private String estado;      // En trámite, Aceptado

    public OrdenMedica(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = "En trámite"; // Estado inicial
    }

    public void aceptarOrden() {
        this.estado = "Aceptado";
    }

    @Override
    public String toString() {
        return tipo + ": " + descripcion + " [" + estado + "]";
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
}
