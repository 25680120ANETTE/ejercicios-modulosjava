public class MainCadena {
    public static void main(String[] args) {
        System.out.println("--- 10. Cadena de Caracteres (Uso) ---");
        CadenaDeCaracteres texto = new CadenaDeCaracteres("Esta es la cadena principal", "TXT", 50);

        System.out.println("Cadena actual: \"" + texto.getCadenaTextoActual() + "\"");

        // Ejecución de Comportamiento 2
        int espacios = texto.contarEspaciosEnBlanco();
        System.out.println("Cantidad de espacios: " + espacios);

        // Ejecución de Comportamiento 1
        String conPrefijo = texto.anadirPrefijo("IMPORTANTE: ");
        System.out.println("Cadena con prefijo: \"" + conPrefijo + "\"");
    }
}