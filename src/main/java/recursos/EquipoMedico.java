package recursos;

public class EquipoMedico {
    private int id;
    private String estado; // Operativo, Mantenimiento, Fallando

    public EquipoMedico(int id) {
        this.id = id;
        this.estado = "Operativo"; // Estado inicial
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo Médico " + id + ": " + estado;
    }
}
