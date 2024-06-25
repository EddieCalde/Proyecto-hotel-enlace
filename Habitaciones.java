package Hotel;

public class Habitaciones {
    private int habitacionesSimples = 3;
    private int habitacionesSuite = 3;
    private int habitacionesGrandes = 4;

    public void mostrarHabitaciones() {
        System.out.println("Tipos de habitaciones disponibles:");
        System.out.println("- Habitaci�n simple (m�ximo 1 persona): " + habitacionesSimples + " disponibles");
        System.out.println("- Habitaci�n suite (m�ximo 6 personas): " + habitacionesSuite + " disponibles");
        System.out.println("- Habitaci�n grande (m�ximo 3 personas): " + habitacionesGrandes + " disponibles");
    }
}