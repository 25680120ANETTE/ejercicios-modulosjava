public class Vuelo {
    // Atributos Privados
    private String codigoVuelo;
    private int capacidadMaximaAsientos;
    private int numeroAsientosReservados;

    // Constructor
    public Vuelo(String codigoVuelo, int capacidadMaximaAsientos, int numeroAsientosReservados) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadMaximaAsientos = Math.max(0, capacidadMaximaAsientos);
        this.numeroAsientosReservados = Math.min(capacidadMaximaAsientos, Math.max(0, numeroAsientosReservados));
    }

    // --- Métodos Accesores (Getters) ---
    public int getCapacidadMaximaAsientos() {
        return this.capacidadMaximaAsientos;
    }
    public int getNumeroAsientosReservados() {
        return this.numeroAsientosReservados;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Intenta realizar una Reserva
    public boolean realizarReserva() {
        if (this.numeroAsientosReservados < this.capacidadMaximaAsientos) {
            this.numeroAsientosReservados++;
            System.out.println("Reserva exitosa. Asientos reservados: " + this.numeroAsientosReservados);
            return true;
        } else {
            System.out.println("Error: Vuelo completo. No hay asientos disponibles.");
            return false;
        }
    }

    // Comportamiento 2: Calcula el Porcentaje de Ocupación
    public double calcularPorcentajeOcupacion() {
        if (this.capacidadMaximaAsientos > 0) {
            return ((double) this.numeroAsientosReservados / this.capacidadMaximaAsientos) * 100.0;
        }
        return 0.0;
    }
}