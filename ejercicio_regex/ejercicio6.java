import java.util.Scanner;
import java.util.regex.*;

public class ejercicio6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese su telefono:");
        String telefono = sc.nextLine();
        System.out.println("Ingrese su cuil:");
        String cuil = sc.nextLine();
        System.out.println("Ingrese su correo:");
        String correo = sc.nextLine();


        boolean validarTelefono = telefono.matches("^[0-9]{7,10}$");
        boolean validarCuil = cuil.matches("^[0-9]{11}$");
        boolean validarCorreo = correo.matches("^[a-zA-Z0-9._]+@[a-z]+\\.[a-z]{2,3}$");


        if (validarTelefono) {
            System.out.println("El telefono es valido");
        } else {
            System.out.println("El telefono es invalido");
        }


        if (validarCuil) {
            System.out.println("El cuil es valido");
        } else {
            System.out.println("El cuil es invalido");
        }


        if (validarCorreo) {
            System.out.println("El correo es valido");
        } else {
            System.out.println("El correo es invalido");
        }
    }
}

