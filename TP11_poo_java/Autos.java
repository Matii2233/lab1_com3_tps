import java.util.ArrayList;
import java.util.Scanner;

public class Autos {
    public static void main(String args[]) {
        ArrayList<String> marcasAutos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String marca = "";
        int salida = 1;

        do {
            System.out.println("Ingresa una marca de auto (no ingresar nada para salir)");
            marca = sc.nextLine();
            marcasAutos.add(marca);
            System.out.println();
        } while (marca != "");

        System.out.println("La lista de marcas es: ");
        for (String marcas : marcasAutos) {
            System.out.print(" "+marcas+" ");
        }
    }
}
