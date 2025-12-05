public class MainRectangulo {
    public static void main(String[] args) {
        System.out.println("--- 3. Rectángulo (Uso) ---");
        Rectangulo rect = new Rectangulo(8.0, 4.5, "Caja");

        System.out.println("Base: " + rect.getBase() + ", Altura: " + rect.getAltura());

        // Ejecución de Comportamiento 1
        double area = rect.calcularArea();
        System.out.println("Área total: " + area);

        // Ejecución de Comportamiento 2
        double perimetro = rect.calcularPerimetro();
        System.out.println("Perímetro: " + perimetro);

        // Modificación y recalculo
        rect.setBase(12.0);
        System.out.println("Nueva Área con Base 12.0: " + rect.calcularArea());
    }
}