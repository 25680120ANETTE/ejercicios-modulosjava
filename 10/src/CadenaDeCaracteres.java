public class CadenaDeCaracteres {
    // Atributos Privados
    private String cadenaTextoActual;
    private String identificadorModulo;
    private int longitudMaximaPermitida;

    // Constructor
    public CadenaDeCaracteres(String cadenaTextoActual, String identificadorModulo, int longitudMaximaPermitida) {
        this.cadenaTextoActual = cadenaTextoActual;
        this.identificadorModulo = identificadorModulo;
        this.longitudMaximaPermitida = longitudMaximaPermitida;
    }

    // --- Métodos Accesores (Getters) ---
    public String getCadenaTextoActual() {
        return this.cadenaTextoActual;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Añade un prefijo y devuelve la nueva cadena
    public String anadirPrefijo(String prefijo) {
        String resultado = prefijo + this.cadenaTextoActual;
        return resultado;
    }

    // Comportamiento 2: Cuenta los Espacios en Blanco
    public int contarEspaciosEnBlanco() {
        int contador = 0;
        for (char c : this.cadenaTextoActual.toCharArray()) {
            if (c == ' ') {
                contador++;
            }
        }
        return contador;
    }
}