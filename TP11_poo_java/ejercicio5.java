import java.util.ArrayList;
import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        // objetos
        ArrayList<Integer> al = new ArrayList<>();
        Random rd = new Random();


        // variables
        int randomNum,
            promedio,
            sumaNums     = 0,
            cantidadNums = 0;


        // ingresar 20 valores random pares del 1 al 100 al arraylist
        for (int i=0; i<20; i++) {
            do {
                randomNum = rd.nextInt(1,100);
                if (randomNum%2 == 0) {
                    al.add(randomNum);
                }
            } while (randomNum%2 != 0);
        }


        // obtener promedio aritmetico de los valores
        for (int i=0; i<20; i++) {
            sumaNums     = sumaNums + al.get(i);
            cantidadNums = cantidadNums + 1;
        }
        for (int i=0; i<20; i++) {
            System.out.print(" "+al.get(i)+" ");
        }
        promedio = sumaNums/cantidadNums;
        System.out.println();
        System.out.println("El promedio es: "+promedio);


        // obtener los iguales al promedio
        for (int i=0; i<20; i++) {
            if (al.get(i) == promedio) {
                System.out.println("El numero "+al.get(i)+" en la posicion "+i+" es igual a "+promedio);
            }
        }


        // obtener los mayores al promedio
        System.out.println("Los mayores al promedio son: ");
        for (int i=0; i<20; i++) {
            if (al.get(i) > promedio) {
                System.out.print(" "+al.get(i));
            }
        }
        System.out.println();


        // obtener los mayores al promedio
        System.out.println("Los menores al promedio son: ");
        for (int i=0; i<20; i++) {
            if (al.get(i) < promedio) {
                System.out.print(" "+al.get(i));
            }
        }
    }
}
