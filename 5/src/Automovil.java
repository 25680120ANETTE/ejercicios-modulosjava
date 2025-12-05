import java.time.Year;

public class Automovil {
    // Atributos Privados
    private String marca;
    private int anioFabricacion;
    private double velocidadMaxima;

    // Constructor
    public Automovil(String marca, int anioFabricacion, double velocidadMaxima) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = Math.max(0.0, velocidadMaxima);
    }

    // --- Métodos Accesores (Getters) ---
    public String getMarca() {
        return this.marca;
    }
    public int getAnioFabricacion() {
        return this.anioFabricacion;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Simula el Encendido
    public String encenderVehiculo() {
        if (this.anioFabricacion >= 1990) {
            return "Encendido exitoso. El " + this.marca + " ha arrancado.";
        } else {
            return "Encendido fallido. El vehículo es demasiado antiguo (" + this.anioFabricacion + ").";
        }
    }

    // Comportamiento 2: Calcula la antigüedad del vehículo
    public int calcularAntiguedad() {
        int anioActual = Year.now().getValue();
        return anioActual - this.anioFabricacion;
    }
}