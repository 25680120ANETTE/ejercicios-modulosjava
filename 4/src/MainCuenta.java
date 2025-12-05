public class MainCuenta {
    public static void main(String[] args) {
        System.out.println("--- 4. Cuenta de Ahorros (Uso) ---");
        CuentaDeAhorros cuenta = new CuentaDeAhorros("A10", "María", 2000.00);

        System.out.println("Saldo inicial: $" + cuenta.getSaldoActual());

        // Ejecución de Comportamiento 1
        cuenta.depositar(350.50);

        // Ejecución de Comportamiento 2 (exitoso)
        cuenta.retirar(100.50);

        // Ejecución de Comportamiento 2 (fallido, validación)
        cuenta.retirar(5000.00);

        System.out.println("Saldo final: $" + cuenta.getSaldoActual());
    }
}