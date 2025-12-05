public class MainTarea {
    public static void main(String[] args) {
        System.out.println("--- 7. Tarea Pendiente (Uso) ---");
        TareaPendiente tarea = new TareaPendiente("Preparar agenda para reunión", "Alta");

        System.out.println("Descripción: " + tarea.getDescripcion());

        // Ejecución de Comportamiento 2
        System.out.println("¿La tarea es Urgente (Inicial)? " + tarea.esUrgente());

        // Ejecución de Comportamiento 1
        tarea.marcarComoCompletada();

        // Verificación de Comportamiento 2
        System.out.println("¿Está Completada? " + tarea.isCompletada());
        System.out.println("¿La tarea sigue siendo Urgente? " + tarea.esUrgente());
    }
}