public class RegistroTemperatura {
    // Atributos Privados
    private double valorTemperatura;
    private String unidadMedida; // "C" o "F"
    private String fechaRegistro;

    // Constructor
    public RegistroTemperatura(double valorTemperatura, String unidadMedida, String fechaRegistro) {
        this.valorTemperatura = valorTemperatura;
        this.unidadMedida = unidadMedida.toUpperCase();
        this.fechaRegistro = fechaRegistro;
    }

    // --- Métodos Accesores (Getters) ---
    public double getValorTemperatura() {
        return this.valorTemperatura;
    }
    public String getUnidadMedida() {
        return this.unidadMedida;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Convierte la temperatura y actualiza el objeto
    public void convertirTemperatura() {
        if (this.unidadMedida.equals("C")) {
            // C a F: F = C * 9/5 + 32
            this.valorTemperatura = (this.valorTemperatura * 9.0/5.0) + 32.0;
            this.unidadMedida = "F";
            System.out.println("Convertido a Fahrenheit.");
        } else if (this.unidadMedida.equals("F")) {
            // F a C: C = (F - 32) * 5/9
            this.valorTemperatura = (this.valorTemperatura - 32.0) * 5.0/9.0;
            this.unidadMedida = "C";
            System.out.println("Convertido a Celsius.");
        }
    }

    // Comportamiento 2: Evalúa si la temperatura es Extrema (mayor a 40°C)
    public boolean esTemperaturaExtrema() {
        double tempEnCelsius;
        if (this.unidadMedida.equals("F")) {
            tempEnCelsius = (this.valorTemperatura - 32.0) * 5.0/9.0;
        } else {
            tempEnCelsius = this.valorTemperatura;
        }
        double limiteExtremo = 40.0;
        return tempEnCelsius > limiteExtremo;
    }
}