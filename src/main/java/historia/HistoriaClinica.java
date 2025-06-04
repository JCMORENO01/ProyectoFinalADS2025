package historia;

import java.util.ArrayList;
import java.util.List;

import ordenes.OrdenMedica;
import signos.SignosVitales;

public class HistoriaClinica {

    private String alergias;
    private String medicamentos;
    private List<SignosVitales> historialSignosVitales;
    private List<OrdenMedica> ordenesMedicas;

    public HistoriaClinica(String alergias, String medicamentos) {
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.historialSignosVitales = new ArrayList<>();
        this.ordenesMedicas = new ArrayList<>();
    }

    public void agregarSignosVitales(SignosVitales signos) {
        historialSignosVitales.add(signos);
    }

    public void agregarOrdenMedica(OrdenMedica orden) {
        ordenesMedicas.add(orden);
    }

    public void mostrarHistoria() {
        System.out.println("Alergias: " + alergias);
        System.out.println("Medicamentos: " + medicamentos);
        System.out.println("Signos Vitales:");
        for (SignosVitales sv : historialSignosVitales) {
            System.out.println("- " + sv);
        }
        System.out.println("Órdenes Médicas:");
        for (OrdenMedica om : ordenesMedicas) {
            System.out.println("- " + om);
        }
    }

    // ✅ Getters correctos
    public String getAlergias() {
        return alergias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public List<SignosVitales> getHistorialSignosVitales() {
        return historialSignosVitales;
    }

    public List<OrdenMedica> getOrdenesMedicas() {
        return ordenesMedicas;
    }


}
