public class MainTemperatura {
    public static void main(String[] args) {
        System.out.println("--- 8. Registro de Temperatura (Uso) ---");
        RegistroTemperatura tempC = new RegistroTemperatura(35.0, "C", "04/12");

        System.out.println("Inicial: " + tempC.getValorTemperatura() + " " + tempC.getUnidadMedida());

        // Ejecución de Comportamiento 2
        System.out.println("¿Temperatura extrema (35°C)? " + tempC.esTemperaturaExtrema());

        // Ejecución de Comportamiento 1
        tempC.convertirTemperatura();
        System.out.println("Final: " + tempC.getValorTemperatura() + " " + tempC.getUnidadMedida());
    }
}