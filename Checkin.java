
package Hotel;


public class Checkin {
    //Eddie
    
    String nombre;
    String apellido;
    String correo;
    int numRes;

   
    
    void info(){
        System.out.println("Informacion sobre su Check-in:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Numero de Reservacion: " + numRes);
    }
    
    void Bienvenida(){
        System.out.println("El check-in se ha iniciado de forma exitosa con su numero de reservacion: "+numRes);
    }
    
}
