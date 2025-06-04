package recursos;

public class Camilla {
    private int id;
    private String estado; // Libre, Ocupada, Fuera de servicio

    public Camilla(int id) {
        this.id = id;
        this.estado = "Libre"; // Estado inicial
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
        return "Camilla " + id + ": " + estado;
    }
}
