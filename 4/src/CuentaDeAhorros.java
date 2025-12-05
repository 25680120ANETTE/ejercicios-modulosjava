public class CuentaDeAhorros {
    // Atributos Privados
    private String numeroCuenta;
    private String nombreTitular;
    private double saldoActual;

    // Constructor
    public CuentaDeAhorros(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldoActual = Math.max(0.0, saldoInicial);
    }

    // --- Métodos Accesores (Getters) ---
    public double getSaldoActual() {
        return this.saldoActual;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Realiza un Depósito
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldoActual += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + this.saldoActual);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }

    // Comportamiento 2: Simula un Retiro (con validación de saldo)
    public boolean retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= this.saldoActual) {
                this.saldoActual -= cantidad;
                System.out.println("Retiro exitoso. Saldo actual: " + this.saldoActual);
                return true;
            } else {
                System.out.println("Error: Saldo insuficiente. Saldo disponible: " + this.saldoActual);
                return false;
            }
        } else {
            return false;
        }
    }
}