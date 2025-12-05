public class MainInventario {
    public static void main(String[] args) {
        System.out.println("--- 2. Producto Almacén (Uso) ---");
        ProductoAlmacen producto = new ProductoAlmacen("LAP-20", 500, 2.50);

        System.out.println("Stock inicial: " + producto.getCantidadActualStock());

        // Ejecución de Comportamiento 1
        producto.incrementarStock(150); // Stock: 650

        // Ejecución de Comportamiento 2
        double valorTotal = producto.calcularValorTotalStock();
        System.out.println("Valor total del stock: $" + valorTotal);
    }
}