import java.time.Year;

public class MainAutomovil {
    public static void main(String[] args) {
        System.out.println("--- 5. Automóvil (Uso) ---");
        int anioActual = Year.now().getValue();
        Automovil auto = new Automovil("Toyota", 2018, 220.0);

        System.out.println("Marca: " + auto.getMarca());

        // Ejecución de Comportamiento 1
        System.out.println(auto.encenderVehiculo());

        // Ejecución de Comportamiento 2
        int antiguedad = auto.calcularAntiguedad();
        System.out.println("Antigüedad: " + antiguedad + " años (al año " + anioActual + ")");
    }
}