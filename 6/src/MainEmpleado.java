public class MainEmpleado {
    public static void main(String[] args) {
        System.out.println("--- 6. Empleado (Uso) ---");
        Empleado emp = new Empleado("E-001", 4000.00, 0.15); // 15% retención

        System.out.println("Salario Mensual Bruto: $" + emp.getSalarioMensual());

        // Ejecución de Comportamiento 1
        double neto = emp.calcularSalarioNeto();
        System.out.println("Salario Neto inicial: $" + neto);

        // Ejecución de Comportamiento 2
        emp.aplicarAumento(0.10); // Aumento del 10%
        System.out.println("Nuevo Salario Neto: $" + emp.calcularSalarioNeto());
    }
}