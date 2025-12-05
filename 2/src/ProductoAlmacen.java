public class ProductoAlmacen {
    // Atributos Privados
    private String referenciaAlmacen;
    private int cantidadActualStock;
    private double precioUnitarioVenta;

    // Constructor
    public ProductoAlmacen(String referenciaAlmacen, int cantidadActualStock, double precioUnitarioVenta) {
        this.referenciaAlmacen = referenciaAlmacen;
        this.cantidadActualStock = Math.max(0, cantidadActualStock);
        this.precioUnitarioVenta = Math.max(0.0, precioUnitarioVenta);
    }

    // --- Métodos Accesores (Getters) ---
    public int getCantidadActualStock() {
        return this.cantidadActualStock;
    }
    public double getPrecioUnitarioVenta() {
        return this.precioUnitarioVenta;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Incrementa el stock
    public void incrementarStock(int cantidadEntrada) {
        if (cantidadEntrada > 0) {
            this.cantidadActualStock += cantidadEntrada;
            System.out.println("Stock actualizado. Nuevo stock: " + this.cantidadActualStock);
        }
    }

    // Comportamiento 2: Calcula el Valor Total del stock
    public double calcularValorTotalStock() {
        return this.cantidadActualStock * this.precioUnitarioVenta;
    }
}