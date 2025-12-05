public class Empleado {
    // Atributos Privados
    private String claveEmpleado;
    private double salarioMensual;
    private double porcentajeRetencionImpuestos; // Ejemplo: 0.10 para 10%

    // Constructor
    public Empleado(String claveEmpleado, double salarioMensual, double porcentajeRetencionImpuestos) {
        this.claveEmpleado = claveEmpleado;
        this.salarioMensual = Math.max(0.0, salarioMensual);
        this.porcentajeRetencionImpuestos = Math.max(0.0, Math.min(1.0, porcentajeRetencionImpuestos));
    }

    // --- Métodos Accesores (Getters) ---
    public double getSalarioMensual() {
        return this.salarioMensual;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Calcula el Salario Neto
    public double calcularSalarioNeto() {
        double retencion = this.salarioMensual * this.porcentajeRetencionImpuestos;
        return this.salarioMensual - retencion;
    }

    // Comportamiento 2: Aplica un Aumento de Salario
    public void aplicarAumento(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            this.salarioMensual *= (1 + porcentajeAumento);
            System.out.println("Aumento aplicado. Nuevo salario mensual: " + this.salarioMensual);
        }
    }
}