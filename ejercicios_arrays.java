import java.util.Scanner;
import java.util.Arrays;

/*
// * * * * * * DECLARACION E INICIALIZACION PUNTOS 1,2,3 y 4 * * * * * *

public class ejercicios_arrays {
    public static void main(String args[]) {
        int
                tamaño     = 10,
                filas      = 10,
                columnas   = 10,
                alto       =  3,
                ancho      =  3,
                prof       =  3,
                incremento =  1;


        double [] reales = {1,2,3,5,7,11,13,17,19,23};
        int [] naturales = {1,2,3,4,5,6,7,8,9,10};
        int [][] enteros = new int[filas][columnas];
        int [][][] cubo  = new int[ancho][alto][prof];
    }
}


// * * * * * * LECTIRA Y ESCRITURA PUNTOS 1 y 2  * * * * * *

public class ejercicios_arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int[] enteros = new int[10];
        double[] reales = new double[10];


        System.out.println("ingresa 10 numeros enteros");
        for (int i=0; i<10; i++) {
            System.out.println("> ");
            enteros[i] = sc.nextInt();
        }


        System.out.println("ingresa 10 numeros reales");
        for (int i=0; i<10; i++) {
            System.out.println("> ");
            reales[i] = sc.nextDouble();
        }


        // * * * * * * PUNTOS 3 y 4  * * * * * *
        char[] caracteres = new char[5];

        System.out.println("Ingresa caracteres:");
        for (int i=0; i<5; i++) {
            System.out.println("> ");
            caracteres[i] = sc.next().charAt(0);
        }

        for (int i=0; i<5; i++) {
            System.out.print(" " +caracteres[i]+ " ");
        }


        
        System.out.println("");
        boolean[] val_de_verdad = new boolean[5];

        System.out.println("Ingresa valores booleanos");
        for (int i=0; i<5; i++) {
            val_de_verdad [i] = sc.nextBoolean();
        }

        for (int i=0; i<5; i++) {
            System.out.print(" " +val_de_verdad[i]+ " ");
        }

        System.out.print("");
    }
}




// * * * * * * OPERACIONES ARITMETICAS * * * * * *

public class ejercicios_arrays {
    public static void main(String args[]) {

        // * * * * * * PUNTO 1 suma de enteros * * * * * *
        int [] nums = {10,9,8,7,6,5,4,3,2,1};
        int     suma = 0,
                mult = 0;

        for (int i=0; i<10; i++) {
            suma = suma + nums[i];
        }
        System.out.println(suma);

        // * * * * * * PUNTO 2 multiplicacion de enteros * * * * * *
        for (int i=0; i<10; i++) {
            mult = mult*nums[i];
        }
        System.out.println(mult);

        // * * * * * * PUNTO 3 ordenar de menor a mayor * * * * * *
        int aux = 0;

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                aux = nums[i];
                if (aux<nums[j]){
                    nums[i] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        for (int i=0; i<10; i++) {
            System.out.print(" " +nums[i]+ " ");
        }

        // * * * * * *PUNTO 4 ordenar alfabeticamente * * * * * *
        String [] palabras = {"libro","pluma","flor","copa","basto","espada","oro","corona","reloj","mate"};

        Arrays.sort(palabras);

        for (int i=0; i<10; i++){
            System.out.print(" " +palabras[i]+ " ");
        }
    }
}




// * * * * * * OPERACIONES ARITMETICAS * * * * * *

public class pruebas {
    public static void main(String args[]) {

        //   PUNTO 1  contar los numeros pares de un arreglo con un metodo
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("La cantidad de numeros pares es: " +contar_pares(nums));


        //   PUNTO 2 metodo que cuente la cantidad de elementos mayores que 10 de un array
        double[] conjunto1 = {1.5,3,4.5,6,7.5,9,10.5,12,13.5,15};
        System.out.println("La cantidad de numeros mayores que 10 en la lista es: " +mayores_que_diez(conjunto1));


        //   PUNTO 3 metodo que sume los elementos multiplos de 3 de una lista
        int[] conjunto2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("La suma de los numeros multiplos de 3 de la lista es: " +sumar_multiplos(conjunto2));


        //   PUNTO 4 metodo que retorne el numero mayor de una lista de enteros
        System.out.println("El numero mayor de la lista es: " +maximo_num(nums));


        //   PUNTO 5 metodo que obtenga la palabra mas corta de una lista de palabras
        String [] palabras = {"libro","pluma","flor","copa","basto","espada","oro","corona","reloj","mate"};
        System.out.println("la palabra mas corta de la lista es: " +obtener_palabra_mas_corta(palabras));


        //   PUNTO 6 metodo que copie un array de enteros en otro array
        int[] copia_nums = new int[10];
        copiar_nums(nums,copia_nums);
    }


    //FUNCION PUNTO 1 (obtener la cantidad de numeros pares de un arreglo int)
    public static int contar_pares(int[] nums){
        int pares = 0;
        for (int i=0; i<10; i++) {
            if (nums[i]%2==0) {
                pares++;
            }
        }
        return pares;
    }


    //FUNCION PUNTO 2 (obtener los numeros mayores que 10 de una lista de numeros reales)
    public static double mayores_que_diez(double[] conjunto1){
        double mayores = 0;

        for (int i=0; i<10; i++) {
            if (conjunto1[i]>10) {
                mayores ++;
            }
        }
        return mayores;
    }


    // FUNCION PUNTO 3 (obtener la suma de los elementos multiplos de 3 de un array int)
    public static int sumar_multiplos(int[] conjunto2){
        int resultado = 0;

        for (int i=0; i<20; i++) {
            if (conjunto2[i]%3==0) {
                resultado += conjunto2[i];
            }
        }
        return resultado;
    }


    //FUNCION PUNTO 4 (encontrar el numero mayor de un array de enteros)
    public static int maximo_num(int[] nums){
        int mayor = 0;

        for (int i=0; i<10; i++) {
            if (nums[i]>mayor) {
                mayor = nums[i];
            }
        }
        return mayor;
    }



    //FUNCION PUNTO 5 (obtener la palabra mas corta de una lista de cadenas)
    public static String obtener_palabra_mas_corta(String[] palabras){
        String palabra;
        String palabra_mas_corta = palabras[0];

        for (int i=0; i<10; i++) {
            palabra = palabras[i];
            if (palabra.length() < palabra_mas_corta.length()) {
                palabra_mas_corta = palabra;
            }
        }
        return palabra_mas_corta;
    }



    //FUNCION PUNTO 6 (copiar un array de enteros en otro array)
    public static void copiar_nums(int[]nums, int[]copia_nums) {
        //copiar arreglo
        for (int i=0; i<10; i++) {
            copia_nums[i] = nums[i];
        }
        System.out.println("Array 1:");
        //escribir el arreglo original
        for (int i=0; i<10; i++) {
            System.out.print(" " +copia_nums[i]+ " ");
        }
        System.out.println(" ");
        System.out.println("Array 2:");
        //escribir el arreglo copia
        for (int i=0; i<10; i++) {
            System.out.print(" " +copia_nums[i]+ " ");
        }
    }
}
*/
