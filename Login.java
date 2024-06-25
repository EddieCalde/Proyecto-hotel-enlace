package Hotel;

import java.util.Scanner;

public class Login {
    private String usuario = "usuario";
    private String contra = "contra";

    public void verificarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el usuario: ");
        String usuarioIngresado = scanner.nextLine();
        System.out.print("Ingrese la contrase�a: ");
        String contraIngresada = scanner.nextLine();

        while (!usuarioIngresado.equals(usuario) || !contraIngresada.equals(contra)) {
            System.out.println("Usuario o contrase�a incorrectos. Intente de nuevo.");
            System.out.print("Ingrese el usuario: ");
            usuarioIngresado = scanner.nextLine();
            System.out.print("Ingrese la contrase�a: ");
            contraIngresada = scanner.nextLine();
        }

        System.out.println("Inicio de sesi�n exitoso.");
    }
}