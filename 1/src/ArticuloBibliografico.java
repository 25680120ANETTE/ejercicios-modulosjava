public class ArticuloBibliografico {
    // Atributos Privados (Encapsulamiento)
    private String identificadorUnico;
    private String nombreAutor;
    private boolean estadoPrestamo; // true = prestado, false = disponible

    // Constructor
    public ArticuloBibliografico(String identificadorUnico, String nombreAutor, boolean estadoPrestamo) {
        this.identificadorUnico = identificadorUnico;
        this.nombreAutor = nombreAutor;
        this.estadoPrestamo = estadoPrestamo;
    }

    // --- Métodos Accesores (Getters) ---
    public String getNombreAutor() {
        return this.nombreAutor;
    }
    public boolean isEstadoPrestamo() {
        return this.estadoPrestamo;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Simula la reserva
    public void reservarLibro() {
        if (!this.estadoPrestamo) {
            this.estadoPrestamo = true;
            System.out.println("Libro reservado: " + this.identificadorUnico);
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    // Comportamiento 2: Determina si es apto para préstamo
    public boolean esAptoParaPrestamo(int anioPublicacion) {
        int anioActual = 2025;
        int antiguedad = anioActual - anioPublicacion;
        // Apto si se publicó hace 5 años o menos
        return antiguedad <= 5;
    }
}