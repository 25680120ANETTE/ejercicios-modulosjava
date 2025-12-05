public class MainVuelo {
    public static void main(String[] args) {
        System.out.println("--- 9. Vuelo (Uso) ---");
        Vuelo vuelo = new Vuelo("Q01", 3, 2); // Capacidad 3, Reservados 2

        System.out.println("Asientos disponibles: " + (vuelo.getCapacidadMaximaAsientos() - vuelo.getNumeroAsientosReservados()));

        // Ejecución de Comportamiento 1 (Éxito)
        vuelo.realizarReserva();

        // Ejecución de Comportamiento 1 (Fallo, vuelo lleno)
        vuelo.realizarReserva();

        // Ejecución de Comportamiento 2
        double ocupacion = vuelo.calcularPorcentajeOcupacion();
        System.out.println("Porcentaje de Ocupación: " + ocupacion + "%");
    }
}