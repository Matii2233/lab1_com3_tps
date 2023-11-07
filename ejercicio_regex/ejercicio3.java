import java.util.Scanner;
import java.util.regex.*;

public class ejercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un correo:");
        String correo = sc.nextLine();
        boolean isValid = correo.matches("^[a-zA-Z0-9._]+@[a-z]+\\.[a-z]{2,3}$");

        if (isValid) {
            System.out.println("El correo es valido");
        } else {
            System.out.println("El correo es invalido");
        }
    }
}