import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio4 {
    public static void main(String[] args) {
        // objetos
        ArrayList<Double> arrlist = new ArrayList<>();
        Scanner sc = new Scanner (System.in);

        // variables
        double  mayor=0,
                menor=0,
                rango;

        // INGRESAR VALORES
        System.out.println("Ingresa numeros decimales: ");
        for (int i = 0; i < 20; i++) {
            double num = sc.nextDouble();
            arrlist.add(num);
        }

        // OBTENER EL VALOR MAYOR Y MENOR
        menor = arrlist.get(0);
        for (int i=0; i<20; i++) {
            if (arrlist.get(i) > mayor) {
                mayor = arrlist.get(i);
            }
            if (arrlist.get(i) < menor) {
                menor = arrlist.get(i);
            }
        }
        System.out.println("El valor mayor es: "+mayor);
        System.out.println("El valor menor es: "+menor);

        // CALCULAR EL RANGO DEL ARRAYLIST
        rango = mayor - menor;
        System.out.println("El rango del arraylist es: "+rango);
    }
}
