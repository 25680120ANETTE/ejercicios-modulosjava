public class TareaPendiente {
    // Atributos Privados
    private String descripcion;
    private String prioridadAsignada; // "Baja", "Media", "Alta"
    private boolean completada; // true = completada

    // Constructor
    public TareaPendiente(String descripcion, String prioridadAsignada) {
        this.descripcion = descripcion;
        this.prioridadAsignada = prioridadAsignada;
        this.completada = false; // Por defecto, pendiente
    }

    // --- Métodos Accesores (Getters) ---
    public String getDescripcion() {
        return this.descripcion;
    }
    public boolean isCompletada() {
        return this.completada;
    }

    // --- Métodos de Comportamiento ---

    // Comportamiento 1: Cambia el estado de la tarea a Completada
    public void marcarComoCompletada() {
        if (!this.completada) {
            this.completada = true;
            System.out.println("Tarea '" + this.descripcion + "' marcada como completada.");
        }
    }

    // Comportamiento 2: Determina si la tarea es Urgente
    public boolean esUrgente() {
        return this.prioridadAsignada.equalsIgnoreCase("Alta") && !this.completada;
    }
}