import java.util.Scanner;
import java.util.regex.*;

public class ejercicio1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero de telefono");
        String numero = sc.nextLine();
        boolean validarNumero = numero.matches("^\\+[0-9]{2}[0-9]{7,10}$");

        if (validarNumero) {
            System.out.println("El nuermo es correcto");
        } else {
            System.out.println("El numero es incorrecto");
        }
    }
}
