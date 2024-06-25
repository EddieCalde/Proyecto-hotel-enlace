package Hotel;

import java.util.Scanner;

public class Pago {
    private double precioHabitacionSimple = 50.0;
    private double precioHabitacionSuite = 100.0;
    private double precioHabitacionGrande = 75.0;
    private int tiempoEstadia;
    private int habitacionesReservadas = 0;
    private String[] habitacionesReservadasList = new String[10];
    private double pagoTotal = 0.0;

    public void generarFactura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipos de habitaciones disponibles:");
        System.out.println("  - Habitaci�n simple (m�ximo 1 persona): " + precioHabitacionSimple + " por d�a");
        System.out.println("  - Habitaci�n suite (m�ximo 6 personas): " + precioHabitacionSuite + " por d�a");
        System.out.println("  - Habitaci�n grande (m�ximo 3 personas): " + precioHabitacionGrande + " por d�a");
        System.out.println("  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Ingrese el tipo de habitaci�n (simple, suite, grande): ");
        String tipoHabitacion = scanner.nextLine();
        System.out.print("Ingrese el n�mero de d�as de estad�a: ");
        tiempoEstadia = scanner.nextInt();

        double precioTotal;
        switch (tipoHabitacion.toLowerCase()) {
            case "simple":
                precioTotal = precioHabitacionSimple * tiempoEstadia;
                break;
            case "suite":
                precioTotal = precioHabitacionSuite * tiempoEstadia;
                break;
            case "grande":
                precioTotal = precioHabitacionGrande * tiempoEstadia;
                break;
            default:
                System.out.println("Tipo de habitaci�n inv�lido.");
                return;
        }

        pagoTotal += precioTotal;
        habitacionesReservadas++;
        habitacionesReservadasList[habitacionesReservadas - 1] = tipoHabitacion + " (tiempo de estadia: " + tiempoEstadia + ")";

        System.out.println("�Desea reservar otra habitaci�n? (s/n)");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("s")) {
            generarFactura();
        } else {
            mostrarFactura();
        }
    }

    private void mostrarFactura() {
        System.out.println("----------------------");
        System.out.println("Factura:");
        for (int i = 0; i < habitacionesReservadas; i++) {
            System.out.println(habitacionesReservadasList[i]);
        }
        System.out.println("Tiempo de estad�a: " + tiempoEstadia + " d�as");
        System.out.printf("Precio total: $%.2f\n", pagoTotal);
        System.out.println("----------------------");
    }
}
