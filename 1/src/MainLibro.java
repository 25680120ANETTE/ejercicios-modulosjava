public class MainLibro {
    public static void main(String[] args) {
        System.out.println("--- 1. Articulo Bibliográfico (Uso) ---");
        ArticuloBibliografico libro = new ArticuloBibliografico("ISBN-456", "Desconocido", false);

        System.out.println("Estado inicial (Prestado): " + libro.isEstadoPrestamo());

        // Ejecución de Comportamiento 1
        libro.reservarLibro();
        System.out.println("Estado después de reservar: " + libro.isEstadoPrestamo());

        // Ejecución de Comportamiento 2
        boolean apto = libro.esAptoParaPrestamo(2021);
        System.out.println("¿Es apto para préstamo (publicado en 2021)? " + apto);
    }
}