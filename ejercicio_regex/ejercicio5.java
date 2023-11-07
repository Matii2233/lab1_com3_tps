import java.util.Scanner;
import java.util.regex.*;

public class ejercicio5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nombre:");
        String nombre = sc.nextLine();
        boolean isValid = nombre.matches("^[a-zA-Z]{7,10}$");

        if (isValid) {
            System.out.println("El nombre es valido");
        } else {
            System.out.println("El nombre es invalido");
        }
    }
}
