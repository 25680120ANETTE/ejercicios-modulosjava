public class Rectangulo {
    // Atributos Privados
    private double base;
    private double altura;
    private String etiquetaIdentificacion;

    // Constructor
    public Rectangulo(double base, double altura, String etiquetaIdentificacion) {
        this.base = Math.max(0, base);
        this.altura = Math.max(0, altura);
        this.etiquetaIdentificacion = etiquetaIdentificacion;
    }

    // --- Métodos Accesores (Getters y Setters) ---
    public double getBase() {
        return this.base;
    }
    public double getAltura() {
        return this.altura;
    }
    // Setter con validación
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Calcula el Área
    public double calcularArea() {
        return this.base * this.altura;
    }

    // Comportamiento 2: Calcula el Perímetro
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}