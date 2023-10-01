/*PUNTO 1 ---------------------------------------------------
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = 10;
        int valor = 0;
        int cantidad_negativos = 0;
        int cantidad_positivos = 0;
        int promedio_negativos = 0;
        int promedio_positivos = 0;
        int[] numeros = new int[tamaño];
        int i;
        System.out.println("Ingrese 10 numeros enteros:");

        for (i=0;i<=tamaño-1;i++){
            valor=sc.nextInt();
            numeros[i]=valor;
            if (numeros[i]<0) {
                cantidad_negativos++;
            }
            if (numeros[i]>0) {
                cantidad_positivos++;
            }
        }

        for (i=0;i<=tamaño-1;i++) {
            if (numeros[i]<0) {
                promedio_negativos = promedio_negativos + numeros[i];
            }
            if (numeros[i]>0) {
                promedio_positivos = promedio_positivos + numeros[i];
            }
        }
        promedio_negativos=promedio_negativos/cantidad_negativos;
        promedio_positivos=promedio_positivos/cantidad_positivos;

        System.out.println("El promedio de positivos es: "+promedio_positivos);
        System.out.println("El promedio de negativos es: "+promedio_negativos);
    }
}

-----------------------------------------------------------
        PUNTO 2----------------------------------------------------

        import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = 10;
        int promedio_pares = 0;
        int[] numeros = new int[tamaño];

        System.out.println("ingresa 10 numers enteros");
        for (int i = 0; i<=tamaño-1; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i<=tamaño-1; i++) {
            if (numeros[i]%2==0) {
                promedio_pares = promedio_pares + numeros[i];
            }
        }

        System.out.println("el promedio de los numeros en las posiciones pares de la lista es: ");
        promedio_pares = promedio_pares/(tamaño/2);
        System.out.println(promedio_pares);
    }
}

-----------------------------------------------------------
        PUNTO 3----------------------------------------------------

        import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        double prom_notas, total_notas=0;
        System.out.println("Ingrese la cantidad de notas:");
        tamaño = sc.nextInt();
        double[] notas = new double[tamaño];

        System.out.println("Inrgese las notas de los alumnos: ");
        for (int i=0; i<=tamaño-1; i++) {
            notas[i] = sc.nextDouble();
        }

        for (int i=0; i<=tamaño-1; i++) {
            total_notas=total_notas+notas[i];
        }

        prom_notas = total_notas/tamaño;
        System.out.println("El promedio de notas es: " +prom_notas);

        System.out.println("Las notas superiores al promedio son: ");
        for (int i=0; i<=tamaño-1; i++) {
            if (notas[i]>prom_notas) {
                System.out.println(notas[i]);
            }
        }
    }
}

-----------------------------------------------------------
        PUNTO 4----------------------------------------------------

        import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = 20, nums, i=0;
        int[] num_pares = new int[tamaño];

        System.out.println("Inrgese numeros (ingrese 20 numeros pares para terminar)");
        while (i<tamaño) {
            nums = sc.nextInt();

            if (nums%2==0) {
                num_pares[i] = nums;
                i++;
            }
        }

        System.out.println("Los numeros pares guardados son:");
        for (i=0; i<=tamaño-1; i++) {
            System.out.println(num_pares[i]);
        }
    }
}

-----------------------------------------------------------
        PUNTO 5----------------------------------------------------

        import java.util.Scanner;

public class tp6java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tamaño=10,ceros=0,positivos=0,negativos=0;
        int[] numeros = new int[tamaño];

        System.out.println("Ingrese 10 numeros:");
        for (int i=0; i<=tamaño; i++) {
            numeros[i]=sc.nextInt();

            if (numeros[i]<0) {
                negativos = ++;
            }
            if (numeros[i]>0) {
                positivos ++;
            }
            if (numeros[i]==0) {
                ceros ++;
            }
        }

        System.out.println("hay" +positivos+ "numeros positivos");
        System.out.println("hay" +negativos+ "numeros negativos");
        System.out.println("hay" +ceros+ "ceros");
    }
}

----------------------------------------------------------------
PUNTO5----------------------------------------------------------


import java.util.Scanner;

public class tp6java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tamaño=10,ceros=0,positivos=0,negativos=0;
        int[] numeros = new int[tamaño];

        System.out.println("Ingrese 10 numeros:");
        for (int i=0; i<=tamaño-1; i++) {
            numeros[i]=sc.nextInt();

            if (numeros[i]<0) {
                negativos ++;
            }
            if (numeros[i]>0) {
                positivos ++;
            }
            if (numeros[i]==0) {
                ceros ++;
            }
        }

        System.out.println("hay " +positivos+ " numeros positivos");
        System.out.println("hay " +negativos+ " numeros negativos");
        System.out.println("hay " +ceros+ " ceros");
    }
}

----------------------------------------------------------------
PUNTO6----------------------------------------------------------

import java.util.Scanner;

public class tp6java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tamaño=10,cant_positivos=0,cant_negativos=0,total_positivos=0,total_negativos=0;
        double prom_positivos=0,prom_negativos=0;
        int[] numeros = new int[tamaño];

        System.out.println("Ingrese 10 numeros:");
        for (int i=0; i<=tamaño-1; i++) {
            numeros[i]=sc.nextInt();

            if (numeros[i]>0) {
                total_positivos=total_positivos+numeros[i];
                cant_positivos++;
            }
            if (numeros[i]<0) {
                total_negativos=total_negativos+numeros[i];
                cant_negativos++;
            }
        }

        System.out.println("el promedio de positivos es: " +total_positivos/cant_positivos);
        System.out.println("el promedio de negativos es: " +total_negativos/cant_negativos);
    }
}

----------------------------------------------------------------
PUNTO 7----------------------------------------------------------

import java.util.Scanner;

public class tp6java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, alturas_sup = 0, alturas_inf = 0;
        double prom_alturas, total_estaturas = 0;

        System.out.println("ingrese la cantidad de personas:");
        n = sc.nextInt();

        if (n % 1 == 0 && n > 0) {
            double[] alturas = new double[n];

            System.out.println("Ingrese las estaturas de las personas ( metros.centimetros ):");
            for (int i = 0; i <= n - 1; i++) {
                alturas[i] = sc.nextDouble();
                total_estaturas += alturas[i];
            }
            prom_alturas = total_estaturas / n;

            for (int i = 0; i <= n - 1; i++) {
                if (alturas[i] > prom_alturas) {
                    alturas_sup++;
                }
                if (alturas[i] < prom_alturas) {
                    alturas_inf++;
                }
            }

            System.out.println("hay " +alturas_sup+ " personas con una estatura superior al promedio");
            System.out.println("hay " +alturas_inf+ " personas con una estatura inferior al promedio");
        } else {
            System.out.print("Error, el numero de personas debe ser positivo y entero");
        }
    }
}

----------------------------------------------------------------
PUNTO 8 --------------------------------------------------------


import java.util.Scanner;

public class tp6java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = 20, posicion =0;
        double mayor=0;
        double[] sueldos;
        sueldos=new double[n];
        String[] nombres;
        nombres=new String[n];

        System.out.println("ingrese nombre y sueldo ganado de cada empleado:");
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Nombre:");
            nombres[i] = sc.nextLine();
            System.out.println("sueldo:");
            sueldos[i] = sc.nextDouble();

            if (sueldos[i]>mayor) {
                mayor=sueldos[i];
                posicion=i;
            }
        }

        System.out.println("El empleado que mas gana es " +nombres[posicion]+ " con una cantidad de: " +sueldos[posicion]);
    }
}

-----------------------------------------------------------------------
PUNTO 9----------------------------------------------------------------

import java.util.Random;
public class tp6java {
    public static void main(String args[]) {
        int n = 5, desde = 5, hasta = 25;

        llenar_y_mostrar(n,desde,hasta);
    }



    public static void llenar_y_mostrar(int tamaño, int desde, int hasta) {
        Random rand = new Random();
        int[] randomnums = new int[tamaño];

        for (int i=0; i<=tamaño-1; i++){
            randomnums[i] = rand.nextInt(desde-1,hasta+1);
        }

        System.out.println("los numeros random son: ");
        for (int i=0; i<=tamaño-1; i++) {
            System.out.println(randomnums[i]);
        }
    }
}

-----------------------------------------------------------------------------
PUNTO 10 A ------------------------------------------------------------------

import java.util.Scanner;
public class tp6java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;

        System.out.println("numero de filas: ");
        filas = sc.nextInt();
        System.out.println("numero de columnas: ");
        columnas = sc.nextInt();

        int[][] mat_a = new int[filas][columnas];
        int[][] mat_b = new int[filas][columnas];
        int[][] mat_c = new int[filas][columnas];

        System.out.println("Ingresa la numeros para completar las tablas: ");
        for (int f=0; f<=filas-1; f++) {
            for (int c=0; c<=columnas-1; c++) {
                System.out.println("tabla A. Posicion: " +f+ "." +c);
                mat_a[f][c] = sc.nextInt();
                System.out.println("tabla B. Posicion: " +f+ "." +c);
                mat_b[f][c] = sc.nextInt();
            }
        }

        System.out.println("La suma de las dos tablas da como resultado la tabla C: ");
        for (int f=0; f<=filas-1; f++) {
            for (int c=0; c<=columnas-1; c++) {
                mat_c[f][c] = mat_a[f][c] + mat_b[f][c];
                System.out.println(mat_c[f][c]);
            }
        }
    }
}

-----------------------------------------------------------------------------
PUNTO 10 B ------------------------------------------------------------------

import java.util.Scanner;
public class tp6java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, num = 0;

        System.out.println("numero de filas: ");
        filas = sc.nextInt();
        System.out.println("numero de columnas: ");
        columnas = sc.nextInt();

        int[][] mat_a = new int[filas][columnas];
        int[][] mat_b = new int[filas][columnas];
        int[][] mat_c = new int[filas][columnas];

        System.out.println("Ingrese los valores de la tabla 1: ");
        mat_a = llenar_mat_a(mat_a, filas, columnas);
        System.out.println("Ingrese los valores de la tabla 2: ");
        mat_b = llenar_mat_b(mat_b, filas, columnas);
        System.out.println("La tabla resultante de la suma de las dos tabla es: ");
        mat_c = llenar_mat_c(mat_a, mat_b, mat_c, filas, columnas);
    }

    public static int[][] llenar_mat_a (int mat_a[][], int filas, int columnas){
        Scanner sc = new Scanner(System.in);

        for (int f=0; f<=filas-1; f++) {
            for (int c=0; c<=columnas-1; c++) {
                System.out.println("tabla 1. Posicion: " +f+ "." +c);
                mat_a[f][c] = sc.nextInt();
            }
        }
        return mat_a;
    }

    public static int[][] llenar_mat_b (int mat_b[][], int filas, int columnas) {
        Scanner sc = new Scanner(System.in);

        for (int f=0; f<=filas-1; f++) {
            for (int c=0; c<=columnas-1; c++) {
                System.out.println("tabla 2. Posicion: " +f+ "." +c);
                mat_b[f][c] = sc.nextInt();
            }
        }
        return mat_b;
    }

    public static int[][] llenar_mat_c (int mat_a[][], int mat_b[][], int mat_c[][], int filas, int columnas) {
        for (int f=0; f<=filas-1; f++) {
            for (int c=0; c<=columnas-1; c++) {
                mat_c[f][c] = mat_a[f][c] + mat_b[f][c];
                System.out.println(mat_c[f][c]);
            }
        }

        return mat_c;
    }
}

-----------------------------------------------------------------------------
PUNTO 11 --------------------------------------------------------------------

import java.util.Scanner;
public class tp6java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int filas = 3, columnas = 2;

        int[][] mat = new int[filas][columnas];
        int[][] matb = new int [columnas][filas];

        System.out.println("Ingresa la numeros para completar la tabla: ");
        for (int f=0; f<filas; f++) {
            for (int c=0; c<columnas; c++) {
                System.out.println("tabla 1. Posicion: " +f+ "." +c);
                mat[f][c] = sc.nextInt();
            }
        }

        System.out.println("La tabla principal se compone de la siguiente manera: ");
        for (int f=0; f<filas; f++) {
            System.out.println("");
            for (int c=0; c<columnas; c++) {
                System.out.print(" " +mat[f][c]);
            }
        }

        for (int f=0; f<filas; f++) {
             for (int c=0; c<columnas; c++) {
                 matb[c][f] = mat[f][c];
            }
        }

        System.out.println("");
        System.out.println("La misma tabla transpuesta se ve asi: ");
        for (int c=0; c<columnas; c++) {
            System.out.println("");
            for (int f=0; f<filas; f++) {
                System.out.print(" " +matb[c][f]);
            }
        }
    }
}
 */