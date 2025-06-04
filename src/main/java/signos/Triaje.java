package signos;

public class Triaje {
    public static String calcularPrioridad(SignosVitales signos) {
        if (signos.getTemperatura() > 39 || signos.getPresionSistolica() > 180) {
            return "1 - Rojo (Reanimación)";
        } else if (signos.getPresionSistolica() > 160) {
            return "2 - Naranja (Emergencia)";
        } else if (signos.getPulso() > 120 || signos.getOxigeno() < 95) {
            return "3 - Amarillo (Urgencia)";
        } else if (signos.getOxigeno() < 98) {
            return "4 - Verde (Urgencia menor)";
        } else {
            return "5 - Azul (Sin urgencia)";
        }
    }
}
