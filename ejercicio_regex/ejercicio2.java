import java.util.Scanner;
import java.util.regex.*;

public class ejercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su numero de CUIL:");
        String cuil = sc.nextLine();
        boolean isValid = cuil.matches("^[0-9]{11}$");

        if (isValid) {
            System.out.println("El cuil es valido");
        } else {
            System.out.println("El cuil es invalido");
        }
    }
}
