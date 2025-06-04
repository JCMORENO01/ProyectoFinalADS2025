package signos;

public class SignosVitales {
    private double temperatura;
    private int pulso;
    private int presionSistolica;
    private int presionDiastolica;
    private double oxigeno;

    public SignosVitales(double temperatura, int pulso, int presionSistolica, int presionDiastolica, double oxigeno) {
        this.temperatura = temperatura;
        this.pulso = pulso;
        this.presionSistolica = presionSistolica;
        this.presionDiastolica = presionDiastolica;
        this.oxigeno = oxigeno;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getPulso() {
        return pulso;
    }

    public int getPresionSistolica() {
        return presionSistolica;
    }

    public int getPresionDiastolica() {
        return presionDiastolica;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public boolean esCritico() {
        return temperatura > 39 || presionSistolica > 180 || presionDiastolica > 120 || oxigeno < 92;
    }

    @Override
    public String toString() {
        return "Temp: " + temperatura + "°C, Pulso: " + pulso + " bpm, PA: " +
               presionSistolica + "/" + presionDiastolica + " mmHg, Oxígeno: " + oxigeno + "%";
    }
}
