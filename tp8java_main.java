import java.util.Random;
import java.util.Scanner;

public class practica_arrays_main {

    // FUNCION mostrar un array
    public static void mostrar_arrays(double[] arr){
        for (int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println();
    }

    // FUNCION sumar dos arrays en un nuevo array
    public static void sumar_arrays(int[] arr_a, int[] arr_b, int[] arr_r) {
        for (int i=0; i<arr_r.length; i++) {
            arr_r[i] = arr_a[i] + arr_b[i];
        }
    }


    // FUNCION multiplicar dos arrays en un nuevo array
    public static void multiplicar_array(int[] arr_a, int[] arr_b, int[] arr_r) {
        for (int i=0; i<arr_r.length; i++) {
            arr_r[i] = arr_a[i] * arr_b[i];
        }
    }


    // FUNCION llenar matriz con numeros al azar
    public static void llenar_matriz(int[][] matriz, int filas, int columnas){
        int contador =1;
        for (int i=0; i<filas; i++) {
            for (int j=0; j<columnas; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }
    }


    // FUNCION mostrar matriz
    public static void mostrar_matriz (int[][] matriz, int filas, int columnas) {
        for (int i=0; i<filas; i++) {
            System.out.println();
            for (int j=0; j<columnas; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println();
    }

    // FUNCION realizar la transpuesta de una matriz
    public static void transposicionar_matriz(int[][] matriz, int[][] transpuesta, int filas, int columnas){
        for (int i=0; i<filas; i++) {
            for (int j=0; j<columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }

    // FUNCION verifivar simetria de matrices
    public static void verificar_simetria_matrices(int[][] matriz_a, int[][] matriz_b) {
        if (matriz_a.length == matriz_b.length && matriz_a[0].length == matriz_b[0].length) {
            System.out.println("Las matrices son simetricas");
        } else {
            System.out.println("Las matrices no son simetricas");
        }
    }


    // FUNCION verifivar simetria de matrices
    public static void calcular_numeroXvector(double[] arr, double num, double[] resultado) {
        for (int i=0; i<arr.length; i++) {
            resultado[i] = arr[i]*num;
        }
        mostrar_arrays(resultado);
    }


    // FUNCION contar pares o impares
    public static int contar_pares_impares(int conteo, int[][] matriz){
        if (conteo%2==0) {
            conteo = 0;

            for (int i=0; i<matriz.length; i++) {
                for (int j=0; j<matriz[0].length; j++) {
                    if (matriz[i][j]%2==0) {
                        conteo++;
                    }
                }
            }
        } else {
            conteo = 0;

            for (int i=0; i<matriz.length; i++) {
                for (int j=0; j<matriz[0].length; j++) {
                    if (matriz[i][j]%2!=0) {
                        conteo++;
                    }
                }
            }
        }

        return conteo;
    }


    // FUNCION rotar matriz 90 grados
    public static int[][] Matriz90Grados(int[][] matriz, int[][] matriz90) {

        // la matriz 90 grados comienza guardando en su ultima columna
        // los valores de la primer fila de la matriz original. hasta llegar a su primer columna
        for (int f = 0; f < matriz.length; f++) {
            System.out.println();
            for (int c = 0; c < matriz[0].length; c++) {
                matriz90[c][matriz.length-1 - f] = matriz[f][c];
            }
        }

        return matriz90;
    }


    // FUNCION contar la recurrencia de un numero especifico en una matriz
    public static int recurrenciaDeUnNumero (int[][] matriz, int numero) {
        int recurrencia = 0;
        for (int f=0; f<matriz.length; f++) {
            for (int c=0; c<matriz[0].length; c++) {
                if (numero==matriz[f][c]) {
                    recurrencia ++;
                }
            }
        }

        return recurrencia;
    }


    // FUNCION invertir filas de una matriz
    public static int[][] invertir_filas_matriz(int[][] matriz, int filas, int columnas) {
        int[][] nuevaMatriz = new int[filas][columnas];
        for (int f=0; f<filas; f++) {
            for (int c=0; c<columnas; c++) {
                nuevaMatriz[filas-1-f][c] = matriz[f][c];
            }
        }

        return nuevaMatriz;
    }


    // FUNCION sumar todas las diagonales de una matriz cuadrada
    public static int suma_diagonales(int[][] matriz, int filas, int columnas) {
        int suma = 0;

        // sumar valor de la primer diagonal
        for (int f=0; f<filas; f++) {
            suma = suma + matriz[f][f];
        }

        // sumar valor de la segunda diagonal
        for (int f=0; f<filas; f++) {
            suma = suma + matriz[f][filas-1-f];
        }
        return suma;
    }


    // FUNCION comprobar si una matriz es ortogonal o no
    public static void ortogonal_si_no(int[][] transp, int[][] inversa, boolean ortogonal, int filas, int columnas) {
        for (int f=0; f<filas; f++) {
            for (int c=0; c<columnas; c++) {
                if (transp [f][c] != inversa[f][c]) {
                    ortogonal = false;
                }
            }
        }
        if (ortogonal==true) {
            System.out.println("La matriz es ortogonal");
        } else {
            System.out.println("La matriz no es ortogonal");
        }
    }


    // FUNCION obtener la inversa de una matriz
    public static int[][] matriz_inversa (int[][] matriz,int[][] inversa,int filas ,int columnas) {
        for (int f=0; f<filas; f++) {
            for (int c=0; c<columnas; c++) {
                inversa [f][c] = matriz[filas-f-1][columnas-c-1];
            }
        }
        return inversa;
    }


    // Funcion obtener el valor minimo de cada fila de una matriz
    public static int[] minimoValorPorFila(int[][] mat, int[] arr, int filas, int columnas){
        int menor;

        for (int f=0; f<filas; f++) {
            menor = mat[f][0];
            for (int c=0; c<columnas; c++) {
                if (mat[f][c]<menor) {
                    menor = mat[f][c];
                }
            }
            arr[f] = menor;
        }

        return arr;
    }



    // FUNCION obtener el producto de dos matrices de distinto tamaño
    public static int[][] producto_matrices_desiguales(int[][] mat1, int[][] mat2, int[][] mat3, int filas, int columnas) {
        for (int f=0; f<filas; f++) {
            for (int c=0; c<columnas; c++) {
                if (f>mat1.length-1 || f>mat2.length-1 || c>mat1[0].length-1 || c>mat2[0].length-1) {
                    mat3[f][c] = 0;
                } else {
                    mat3[f][c] = mat1[f][c]*mat2[f][c];
                    System.out.println(mat3[f][c]);
                }
            }
        }

        return mat3;
    }




/*

//PUNTO 1 *************************************************************************************************************
    public static void main(String args[]){
        int tamaño = 10;
        int[] arr_a = {3,6,9,12,15,18,21,24,27,30};
        int[] arr_b = {5,10,15,20,25,30,35,40,45,50};
        int[] arr_r = new int[tamaño];

        System.out.println("Array a: ");
        mostrar_arrays(arr_a);

        System.out.println("Array b: ");
        mostrar_arrays(arr_b);

        sumar_arrays(arr_a, arr_b, arr_r);

        System.out.println("Suma de los arrays: ");
        mostrar_arrays(arr_r);
    }



//PUNTO 2 *************************************************************************************************************

    public static void main(String args[]){
        int tamaño = 10;
        int[] arr_a = {4,2,6,75,4,35,1,65,8,14,3};
        int[] arr_b = {6,12,17,5,13,28,19,2,15,3};
        int[] arr_r = new int[tamaño];

        System.out.println("Array a: ");
        mostrar_arrays(arr_a);

        System.out.println("Array b: ");
        mostrar_arrays(arr_b);

        multiplicar_array(arr_a, arr_b, arr_r);

        System.out.println("Producto de los arrays: ");
        mostrar_arrays(arr_r);
    }



//PUNTO 3 *************************************************************************************************************


    public static void main(String args[]){
        int filas = 3,  columnas = 4;
        int[][] matriz = new int [filas][columnas];
        int[][] transpuesta = new int [columnas][filas];

        llenar_matriz(matriz, filas, columnas);

        System.out.println("Matriz original:");
        mostrar_matriz(matriz, filas, columnas);

        transposicionar_matriz(matriz, transpuesta, filas, columnas);

        System.out.println("Matriz transpuesta:");
        mostrar_matriz(transpuesta, columnas, filas);
    }

//PUNTO 4 *************************************************************************************************************
    public static void main(String args[]){
        int filas, columnas;
        int[][] matriz1 = new int [2][3];
        int[][] matriz2 = new int [2][3];

        verificar_simetria_matrices(matriz1, matriz2);
    }


//PUNTO 5 *************************************************************************************************************
    public static void main(String args[]){
        double num = 2.5;
        double[] vector = {2,3,4,5,6};
        double[] resultado = new double[vector.length];

        System.out.println("El vector es: ");
        mostrar_arrays(vector);

        System.out.println("El numero es: ");
        System.out.println(" "+num);
        System.out.println();

        System.out.println("El producto escalar del vector y el numero es:");
        calcular_numeroXvector(vector, num, resultado);
    }


//PUNTO 6 *************************************************************************************************************
    public static void main (String args[]){
        double maximo = 0;
        double[] arr = {2.5, 1.2, 3.7, 6.1, 4.4, 1.8};

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }

        System.out.println("El numero mayor es: " +maximo);
    }


//PUNTO 8 *************************************************************************************************************
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int suma = 0, fila;
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Numero de fila a sumar:");
        fila = sc.nextInt();

        if (fila>3 && fila<1) {
            System.out.print("La fila debe ser menor que 4 y mayor que 0");
        } else {
            for (int i=0; i<matriz[fila-1].length; i++) {
                suma = suma + matriz[fila-1][i];
            }

            System.out.println("La suma de los valores de la fila elegida es: "+suma);
        }
    }

//PUNTO 9 *************************************************************************************************************
    public static void main (String args[]){
        int[][] matriz = {{1,0,0},{0,2,0},{0,0,3}};
        boolean esDiagonal = true;

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++) {
                if (i!=j) {
                    if (matriz[i][j] != 0) {
                        esDiagonal = false;
                    }
                }
            }
        }

        if (esDiagonal==true) {
            System.out.println("La matriz es diagonal");
        } else {
            System.out.println("La matriz no es diagonal");

        }
    }


//PUNTO 10 *************************************************************************************************************
    public static void main (String args[]){
        int[][] matriz = {{1,0,0},{0,1,0},{0,0,1}};
        boolean esUnitaria = true;

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++) {
                if (i!=j) {
                    if (matriz[i][j] != 0) {
                        esUnitaria = false;
                    }
                }
                if (i==j) {
                    if (matriz[i][j] != 1) {
                        esUnitaria = false;
                    }
                }
            }
        }

        if (esUnitaria==true) {
            System.out.println("La matriz es unitaria");
        } else {
            System.out.println("La matriz no es unitaria");
        }
    }


//PUNTO 11 *************************************************************************************************************
    public static void main (String args[]){
        int[][] matriz = {{3,6,11},{14,9,5},{2,16,21}};
        int pares = 2, impares = 1;

        System.out.println("La cantidad de pares es "+contar_pares_impares(pares, matriz));
        System.out.println("La cantidad de impares es "+contar_pares_impares(impares, matriz));
    }

//PUNTO 12 *************************************************************************************************************
    public static void main (String args[]) {
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz90 = new int[matriz[0].length][matriz.length];

        matriz90 = Matriz90Grados(matriz, matriz90);

        for (int f = 0; f < matriz90.length; f++) {
            System.out.println();
            for (int c = 0; c < matriz90[0].length; c++) {
                System.out.print(matriz90[f][c] + " ");
            }
        }
    }


//PUNTO 13 *************************************************************************************************************
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int recurrencia,numero;
        int[][] matriz = {{62,200,14},{62,11,133},{14,23,62}};

        System.out.println("Las listas de numeros son:");
        mostrar_matriz(matriz, matriz.length, matriz[0].length);

        System.out.println();
        System.out.println("Que numero desea buscar: ");
        System.out.print(" > ");
        numero = sc.nextInt();

        recurrencia = recurrenciaDeUnNumero(matriz, numero);
        System.out.println("El numero fue encontrado " +recurrencia+ " veces");
    }


//PUNTO 14 *************************************************************************************************************
    public static void main(String args[]){
        int[][] matriz = {
                {21, 15, 66},
                {53, 41, 59},
                {37, 22, 94},
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int nuevaMatriz = invertir_filas_matriz(matriz, filas, columnas);

        System.out.println("La matriz original es: ");
        mostrar_matriz(matriz, filas, columans);

        System.out.println("La matriz con sus filas invertidas es: ");
        mostrar_matriz(nuevaMatriz, filas, columans);

    }


//PUNTO 15 *************************************************************************************************************
    public static void main(String args[]){
        int[][] matriz = {
                {21, 83, 54,  3},
                {31, 75, 19,  2},
                {44, 92, 67, 22},
                {36,  5, 17,  1},
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int sumaDiagonales = suma_diagonales(matriz,filas,columnas);

        System.out.println("la matriz original es: ");
        mostrar_matriz(matriz, filas, columnas);
        System.out.println("La suma de las diagonales de la matriz es: "+sumaDiagonales);
    }


//PUNTO 16 *************************************************************************************************************
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3, 4},
                {6,  11, 16, 3},
                {7, 12,  11, 2},
                {8,  7,  6, 1}
        };

        int filas = matrix.length;
        int columnas = matrix[0].length;
        boolean ortogonal = true;

        int [][] inversa = new int [filas][columnas];
        int [][] transp  = new int [columnas][filas];

        // Se obtiene la inversa de la matriz
        inversa = matriz_inversa(matrix, inversa, filas, columnas);
        // Se obtiene la matriz transpuesta de la matriz original
        transposicionar_matriz(matrix, transp, filas, columnas);
        //  se comparan para saber si la matriz original es ortogonal
        ortogonal_si_no(transp, inversa, ortogonal, filas, columnas);
    }

//PUNTO 17 *************************************************************************************************************
    public static void main(String[] args) {
        int[][] mat  = {{16,2,7} , {9,44,28} , {36,29,50} , {11,25,61} , {7,1,6}};
        int filas    = mat.length;
        int columnas = mat[0].length;
        int[] arr    = new int [filas];

        // Se obtiene el arreglo con los valores minimos de cada fila de la matriz
        arr = minimoValorPorFila(mat, arr, filas, columnas);

        System.out.println();
        System.out.println("Arreglo con los valores menores de cada fila de la matriz: ");
        for (int i=0; i<filas; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }



//PUNTO 18 *************************************************************************************************************
    public static void main(String[] args) {
        int[][] mat1 = {{16, 2, 7}, {9, 44, 28}, {36, 29, 50}, {11, 25, 61}, {7, 1, 6}};
        int[][] mat2 = {{3,12,5,18},{22,4,14,1},{10,6,23,17},{18,29,20,9}};

        int f1=mat1.length, f2=mat2.length, c1=mat1[0].length, c2=mat2[0].length;
        int filas = 0,columnas = 0;

        // ifs para seleccionar el tamaño correcto de la matriz que contendra los productos
        if (f1>=f2) {
            filas=f1;
        }
        if (f2>=f1) {
            filas=f2;
        }
        if (c1>=c2) {
            columnas=c1;
        }
        if (c2>=c1) {
            columnas=c2;
        }

        int[][] mat3 = new int [filas][columnas];

        // obtenemos la matriz producto
        mat3 = producto_matrices_desiguales(mat1, mat2, mat3, filas, columnas);
        // se muestra la matriz producto
        mostrar_matriz(mat3, mat3.length, mat3[0].length);
    }
   */
}
