import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class tp7java {
    public static void main(String args[]) {
        /*
        // PUNTO 1 (ordenar un arreglo de menor a mayor)
        int[] arr = {5,4,3,2,1};
        int aux;

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                aux = arr[i];
                if (aux<arr[j]){
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        System.out.println("");
        for (int i=0; i<5; i++) {
            System.out.print(" " + arr[i] + " ");
        }




        // PUNTO 2 (ordenar un arreglo de mayor a menor)
        int[] arr = {1,2,3,4,5};
        int aux;

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                aux = arr[i];
                if (aux>arr[j]){
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        System.out.println("");
        for (int i=0; i<5; i++) {
            System.out.print(" " +arr[i]+ " ");
        }




        // PUNTO 3 (ordenar un arreglo de flotantes de menor a mayor)
        double[] arr = {1,1.25,1.5,1.75,2,2.25,2.5,2.75,3};
        double aux;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                aux = arr[i];
                if (aux<arr[j]){
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        System.out.println("");
        for (int i=0; i<9; i++) {
            System.out.print(" " +arr[i]+ " ");
        }




        // PUNTO 4 (ordenar un arreglo de flotantes de mayor a menor)
        double[] arr = {3,2.75,2.5,2.25,2,1.75,1.5,1.25,1};
        double aux;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                aux = arr[i];
                if (aux>arr[j]){
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        System.out.println("");
        for (int i=0; i<9; i++) {
            System.out.print(" " +arr[i]+ " ");
        }




        // PUNTO 5 (ordenar un arreglo de palabras alfabeticamente)
        String [] palabras = {"roble","abedul","cipres","acacia","pino","cerezo","fresno","arce","nogal"};

        // Se usa la libreria arrays de java para ordenar alfabeticamente cada palabra de la lista
        Arrays.sort(palabras);

        for (int i=0; i<9; i++){
            System.out.print(" " +palabras[i]+ " ");
        }




        // PUNTO 6 (ordenar un array de palabras en orden alfabetico inverso)
        String[] arrayDePalabras = {"roble","abedul","cipres","acacia","pino","cerezo","fresno","arce","nogal"};

        // se usa "comparator.reverseOrder" de javaUtilComparator para invertir el orden alfabetico
        Arrays.sort(arrayDePalabras, Comparator.reverseOrder());

        System.out.println("");
        System.out.print("{");
        for (String palabra : arrayDePalabras) {
            System.out.print("[ "+palabra+" ]");
        }
        System.out.print("}");




        // PUNTO 9 (ordenar un array de enteros por el metodo burbuja)
        int[] enteros = {2, 453, 5, 1, 45, 345, 346, 51, 23, 12};
        int aux;

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                aux = enteros[i];
                if (aux<enteros[j]){
                    enteros[i] = enteros[j];
                    enteros[j] = aux;
                }
            }
        }
        System.out.println("");
        for (int i=0; i<10; i++) {
            System.out.print(" " + enteros[i] + " ");
        }




        // PUNTO 10 (ordenar un array por el metodo de seleccion)
        int array[] = {4,32,7,11,2,45};


        int         i,
                    j,
                menor,  // El valor menor es donde se guarda el numero menor del arreglo
                  aux,  // La variable "aux" sera para guardar un numero que luego se guardara en otro lado
                  pos;  // La variable "pos" indica la posicion de larreglo donde se encontro el valor menor


        // este bucle representa el indice "i" donde iniciara cada ciclo
        // tambien marca la posicion donde se guardara el valor menor del array
        for (i=0; i<array.length; i++) {
            menor = array[i];
            pos = i;
            // este bucle tiene como fin, encontrar el numreo menor del arreglo
            for (j=i+1; j<array.length; j++) {
                if (array[j] < menor) {
                    menor = array[j];
                    pos = j;
                }
            }

            // este if, puede realiza el cambio de lugares del valor menor con el que esta en el lugar "i"
            // Si la posicion donde se encontro el menor es igual a "i" no se realiza cambio de lugares
            if (pos!=i) {
                aux = array[i];
                array[i] = array[pos];
                array[pos] = aux;
            }
        }


        // Por ultimo se muestra el array ya ordenado
        for (i=0; i<array.length; i++) {
            System.out.print("["+array[i]+"]");
        }




        // PUNTO 11 ( ordenar un array por el metodo de insercion )
        int insercion[] = {33,16,25,9,6,70};

        int     i,
                j,
                aux;  // "Aux" tedra el valor donde inicia cada ciclo

        // Este primer ciclo marca donde inicia cada cilo y tambien marca el valor que tendra "aux"
        for (i=1 ; i<insercion.length ; i++) {
            aux = insercion[i];
            // El segundo ciclo inicia un lugar antes del primero
            // y cambia el valor en i con el valor en j cuando se cumple la condicion inicial del ciclo
            // el indice "j" va disminuyendo su valor cuando el valor en j cuando se da el intercambio
            for (j=i-1 ; j>=0 && insercion[j]>aux ; j--) {
                insercion[j+1]=insercion[j];
                insercion[j]=aux;
            }
        }

        System.out.println("");
        for (i=0 ; i<insercion.length ; i++) {
            System.out.print("["+insercion[i]+"]");
        }




        int[] lista = {3, 6, 22, 7, 35, 1, 11};

        System.out.println("");
        System.out.println("Arreglo original:");
        printArray(lista);

        mergeSort(lista);

        System.out.println("");
        System.out.println("Arreglo ordenado:");
        printArray(lista);
    }

    public static void mergeSort(int[] lista) {
        // la condicion de salida sera cuando lista sea nulo o cuando la lista tenga un elemento
        if (lista == null || lista.length <= 1) {
            return;
        }

        int piv = lista.length / 2;
        int[] izq = new int[piv];
        int[] der = new int[lista.length - piv];

        // system.arraycopy se copian las parte izq y der de la lista a sus arreglos respectivos
        System.arraycopy(lista, 0, izq, 0, piv);
        System.arraycopy(lista, piv, der, 0, lista.length - piv);

        // en la primer llamada a mergesort se ordena la parte izquierda de la lista
        mergeSort(izq);
        // y en la segunda se ordena la parte derecha de la lista
        mergeSort(der);

        // una vez ordenadas las dos mitades se juntan las dos mitades ordenadas en la lista completa
        merge(izq, der, lista);
    }

    // FUNCION mezclar que se usa para juntar las dos listas ya ordenadas en lista
    public static void merge(int[] izq, int[] der, int[] lista) {
        int leftLength = izq.length;
        int rightLength = der.length;
        int i = 0, j = 0, k = 0;


        while (i < leftLength && j < rightLength) {
            if (izq[i] <= der[j]) {
                lista[k++] = izq[i++];
            } else {
                lista[k++] = der[j++];
            }
        }

        while (i < leftLength) {
            lista[k++] = izq[i++];
        }

        while (j < rightLength) {
            lista[k++] = der[j++];
        }
    }

    public static void printArray(int[] lista) {
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();






        Scanner sc = new Scanner(System.in);
        int[] array_a = new int[20];
        int selec_orden, selec_metodo, i, aux = 0, j = 0, pos=0, menor=0, mayor=0;

        System.out.println("Ingresa los valores de un array: ");
        for (i = 0; i < 20; i++) {
            array_a[i] = sc.nextInt();
        }


        System.out.println();
        System.out.println("1. para orden ascendente");
        System.out.println("2. para orden descendente");
        System.out.println();
        selec_orden = sc.nextInt();

        System.out.println();
        System.out.println("1. para metodo burbuja");
        System.out.println("2. para metodo seleccion");
        System.out.println("3. para metodo insercion");
        System.out.println();
        selec_metodo = sc.nextInt();
        System.out.println();

        if (selec_orden == 1) {
            if (selec_metodo == 1) {
                metodo_burbuja(array_a,aux);
            } else if (selec_metodo == 2) {
                metodo_Seleccion(array_a, i, j, pos, menor, aux);

            } else if (selec_metodo == 3) {
                metodo_insercion(array_a, aux, i, j);
            } else {
                System.out.println("El numero elegido no corresponde a ninguna opcion");
            }
        } else if (selec_orden == 2) {
            if (selec_metodo == 1) {
                metodo_burbuja_inverso(array_a,aux);
            } else if (selec_metodo == 2) {
                metodo_seleccion_inverso(array_a, i, j, pos, mayor, aux);

            } else if (selec_metodo == 3) {
                metodo_insercion_inverso(array_a, aux, i, j);
            } else {
                System.out.println("El numero elegido no corresponde a ninguna opcion");
            }
        } else {
            System.out.println("El numero elegido no corresponde a ninguna opcion");
        }


        mostrar_arreglo(array_a, i);
    }




    // funcionBurbuja
    public static void metodo_burbuja(int[] enteros, int aux){
        for (int i=0; i<enteros.length; i++) {
            for (int j=0; j<enteros.length; j++) {
                aux = enteros[i];
                if (aux<enteros[j]){
                    enteros[i] = enteros[j];
                    enteros[j] = aux;
                }
            }
        }
    }


    // funcionSeleccion
    public static void metodo_Seleccion(int[] array, int i, int j, int pos, int menor, int aux) {
        for (i=0; i<array.length; i++) {
            menor = array[i];
            pos = i;
            // este bucle tiene como fin, encontrar el numreo menor del arreglo
            for (j=i+1; j<array.length; j++) {
                if (array[j] < menor) {
                    menor = array[j];
                    pos = j;
                }
            }

            // este if, puede realiza el cambio de lugares del valor menor con el que esta en el lugar "i"
            // Si la posicion donde se encontro el menor es igual a "i" no se realiza cambio de lugares
            if (pos!=i) {
                aux = array[i];
                array[i] = array[pos];
                array[pos] = aux;
            }
        }
    }


    // funcionInsercion
    public static void metodo_insercion(int[] nums, int aux, int i, int j){
        for (i=1; i<nums.length; i++) {
            aux = nums[i];
            for (j=i-1 ; j>=0 && nums[j]>aux ; j--) {
                nums[j+1]=nums[j];
                nums[j]=aux;
            }
        }
    }


    // funcionBurbujaDescendente
    public static void metodo_burbuja_inverso(int[] enteros, int aux){
        for (int i=0; i<enteros.length; i++) {
            for (int j=0; j<enteros.length; j++) {
                aux = enteros[i];
                if (aux>enteros[j]){
                    enteros[i] = enteros[j];
                    enteros[j] = aux;
                }
            }
        }
    }


    // funcionSeleccionDescendente
    public static void metodo_seleccion_inverso(int[] array, int i, int j, int pos, int mayor, int aux){
        for (i=0; i<array.length; i++) {
            mayor = array[i];
            pos = i;
            for (j=i+1; j<array.length; j++) {
                if (array[j] > mayor) {
                    mayor = array[j];
                    pos = j;
                }
            }

            // este if, puede realiza el cambio de lugares del valor menor con el que esta en el lugar "i"
            // Si la posicion donde se encontro el menor es igual a "i" no se realiza cambio de lugares
            if (pos!=i) {
                aux = array[i];
                array[i] = array[pos];
                array[pos] = aux;
            }
        }
    }


    // funcionInsersionDescendente
    public static void metodo_insercion_inverso(int[] nums, int aux, int i, int j){
        for (i=1 ; i<nums.length ; i++) {
            aux = nums[i];
            for (j=i-1 ; j>=0 && nums[j]<aux ; j--) {
                nums[j+1]=nums[j];
                nums[j]=aux;
            }
        }
    }

    // funcion mostrar arreglo
    public static void mostrar_arreglo(int[] array_a, int i) {
        System.out.println();
        for (i = 0; i < array_a.length; i++) {
            System.out.print(" " + array_a[i] + " ");
        }

        */
    }
}
