import java.util.ArrayList;
import java.util.Random;

public class tp9_ejercicios {
    public static void main (String[] args) {
        //ejercicio 1 - agregar numeros a un arraylist de enteros
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(1);
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(5);
        enteros.add(8);
        enteros.add(13);


        //ejercicio 2 - crea un arraylist de nombres y agrega 3
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Luis");
        nombres.add("David");
        nombres.add("Maria");


        //ejercicio 3 - imprime todos los elementos de un arraylist de enteros
        System.out.println("-------- salida ejercicio 3 --------");
        System.out.println("Arraylist de enteros: ");
        System.out.println(" "+enteros);
        System.out.println();


        //ejercicio 4 - encuentra la longitud de un arraylist de caracteres
        // lista de caracteres
        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('c');
        caracteres.add('/');
        caracteres.add('t');
        caracteres.add('u');
        caracteres.add('x');

        //obtener el tamaño de la lista
        int longitud = caracteres.size();
        System.out.println("-------- salida ejercicio 4 --------");
        System.out.println("La longitud de la lista de caracteres es: "+longitud);
        System.out.println();


        //ejercicio 5 - eliminar un elemento especifico de un arraylist de cadenas
        System.out.println("-------- salida ejercicio 5 --------");
        System.out.println("Lista original:");
        System.out.println(" "+nombres);
        System.out.println("Lista sin 'David':");
        nombres.remove(1);
        System.out.println(" "+nombres);
        System.out.println();


        //ejercicio 6 - comprueba si un arraylist de numeros enteros esta vacio
        boolean vacio_bool = enteros.isEmpty();
        if (vacio_bool) {
            System.out.println("-------- salida ejercicio 6 --------");
            System.out.println("El array esta vacio");
            System.out.println();
        } else {
            System.out.println("-------- salida ejercicio 6 --------");
            System.out.println("El array tiene valores");
            System.out.println();
        }


        // ejercicio 7 - obten el numero mas grande de un arraylist de enteros
        System.out.println("-------- salida ejercicio 7 --------");
        int mayor = enteros.get(0);
        for (int i=0; i<enteros.size(); i++) {
            if (enteros.get(i) > mayor) {
                mayor = enteros.get(i);
            }
        }

        // mostramos los valores del arraylist y el numero mayor de entre estos
        System.out.println("El arraylist es:");
        System.out.println(" "+enteros);
        System.out.println("El numero mayor del arraylist es: "+mayor);
        System.out.println();


        // ejercicio 8 - copiar los elementos del arraylist a otro nuevo
        System.out.println("-------- salida ejercicio 8 --------");
        ArrayList<Integer> nuevosEnteros = new ArrayList<>();
        // metodo addAll para copiar los elementos de 'enteros' a 'nuevosEnteros'
        nuevosEnteros.addAll(enteros);

        // mostramos los dos arraylists
        System.out.println("Valores del primer arraylist:");
        System.out.println(" "+enteros);
        System.out.println("Nuevo arraylist:");
        System.out.println(" "+nuevosEnteros);
        System.out.println();



        // ejercicio 9 - Invertir el orden de un arraylist de enteros
        System.out.println("-------- salida ejercicio 9 --------");
        // mostrar arraylist
        System.out.println("Arraylist de enteros:");
        System.out.println(" "+enteros);

        // inversion de los valores del arraylist
        int aux = 0;
        int posOpuesta;
        for (int i=0; i<enteros.size()/2; i++) {
            posOpuesta = enteros.size() - i - 1;
            aux = enteros.get(i);
            enteros.set(i, enteros.get(posOpuesta));
            enteros.set(posOpuesta, aux);
        }

        // mostrar arrylist invertido
        System.out.println("Arraylist de enteros invertido:");
        System.out.println(" "+enteros);
        System.out.println();

        // desinvierto el array para usarlo en los proximos ejercicios
        for (int i=0; i<enteros.size()/2; i++) {
            posOpuesta = enteros.size() - i - 1;
            aux = enteros.get(i);
            enteros.set(i, enteros.get(posOpuesta));
            enteros.set(posOpuesta, aux);
        }


        // ejercicio 10 - combinar dos arraylist de enteros en uno solo
        System.out.println("-------- salida ejercicio 10 --------");
        // se crean 2 arreglos nuevos y un arreglo para almacenarlos a ambos
        ArrayList<Integer> alMelon  = new ArrayList<>();
        ArrayList<Double> alSandia = new ArrayList<>();
        ArrayList<Object> alFrutas = new ArrayList<>();

        // se llenan los dos arreglos nuevos
        alMelon.add(1);
        alMelon.add(2);
        alMelon.add(3);
        alMelon.add(4);
        alSandia.add(0.5);
        alSandia.add(1.5);
        alSandia.add(2.5);
        alSandia.add(3.5);

        // se adjuntan los dos arreglos al arreglo nuevo
        alFrutas.addAll(alMelon);
        alFrutas.addAll(alSandia);

        // mostramos los arreglos
        System.out.println("Arraylist Melon:");
        System.out.println(" "+alMelon);
        System.out.println("Arraylist Sandia:");
        System.out.println(" "+alSandia);
        System.out.println("Arraylist Frutas:");
        System.out.println(" "+alFrutas);
        System.out.println();


        // ejercicio 11 - eliminar los elementos pares de un arraylist de enteros
        System.out.println("-------- salida ejercicio 11 --------");
        System.out.println("arraylist: "+enteros);
        enteros.removeIf(numero -> numero%2 == 0);
        System.out.println("arraylist sin numeros pares: "+enteros);
        System.out.println();


        // ejercicio 12 - busca un elemento especifico en un arraylist de cadenas y devuelve su indice
        System.out.println("-------- salida ejercicio 12 --------");
        nombres.add("Alex");
        nombres.add("Alejandra");
        nombres.add("Damian");

        String elementoBuscado = "Luis";
        int posElemento;
        System.out.println("El arraylist de cadenas es: " +nombres);
        System.out.println("El elemento buscado es '"+elementoBuscado+"'");

        for (int i=0; i<nombres.size(); i++) {
            if (elementoBuscado == nombres.get(i)) {
                posElemento = i;
                System.out.println("La posicion del elemento es "+posElemento);
                System.out.println();
                break;
            }
        }


        // ejercicio 13 - comprueba si dos arraylist son iguales
        System.out.println("-------- salida ejercicio 13 --------");
        ArrayList<Integer> iguales = new ArrayList<>();
        //ArrayList<Integer> desiguales = new ArrayList<>();

        iguales.add(1);
        iguales.add(1);
        iguales.add(3);
        iguales.add(5);
        iguales.add(13);

        /*
        desiguales.add(1);
        desiguales.add(2);
        desiguales.add(3);
        desiguales.add(4);
        desiguales.add(5);
        */

        boolean sonIguales = false;
        // se condiciona el prograam a que los dos arreglos a comparar tengan el mismo tamaño
        if (enteros.size() == iguales.size() /*desiguales.size()*/) {
            // obtener el valor de verdad de 'sonIguales'
            for (int i=0; i<enteros.size(); i++) {
                if (enteros.get(i) == iguales.get(i) /*desiguales.size(i)*/) {
                    sonIguales = true;
                } else {
                    sonIguales = false;
                }
            }

            if (sonIguales){
                System.out.println("Los arraylists son iguales");
            } else {
                System.out.println("Los arraylists son distintos");
            }
        } else {
            System.out.println("Los arreglos deben tener tamaños iguales");
        }
        System.out.println();


        // ejercicio 14 - encuentra el elemento mas mequeño de un arraylist de numeros
        System.out.println("-------- salida ejercicio 14 --------");

        int menor = enteros.get(0);
        System.out.println("El arraylist es: "+enteros);

        // obtengo el numero menor del arraylist 'enteros'
        for (int i=0; i<enteros.size(); i++) {
            if (enteros.get(i) < menor) {
                menor = enteros.get(i);
            }
        }
        System.out.println("El numero menor del arraylist es " +menor);
        System.out.println();


        // ejercicio 15 - crea un arraylist de numero enteros y suma todos los elementos.
        System.out.println("-------- salida ejercicio 15 --------");
        System.out.println("Arraylist: "+enteros);
        int suma = 0;
        for (int i=0; i<enteros.size(); i++) {
            suma += enteros.get(i);
        }

        // mostrar el resultado de la suma
        System.out.println("La suma de sus elementos es: "+suma);
        System.out.println();


        // ejercicio 16 - crea un arraylist de cadenas y concatenalas todas en una sola
        System.out.println("-------- salida ejercicio 16 --------");
        System.out.println("El arraylist de cadenas es:");
        System.out.println(" "+nombres);

        String cadenaFinal = "";
        for (int i=0; i<nombres.size(); i++) {
            cadenaFinal += nombres.get(i) + " ";
        }

        // mostramos la cadena final
        System.out.println("la cadena final es:");
        System.out.println(" '"+cadenaFinal+"'");
        System.out.println();


        // ejercicio 17 - elimina todos los elementos duplicados de un arraylist de cadenas
        System.out.println("-------- salida ejercicio 17 --------");
        // se agregan algunos valores ya existentes en el arraylist nombres
        nombres.add("Damian");
        nombres.add("Alejandra");
        nombres.add("Luis");

        System.out.println("El arraylist de cadenas es:");
        System.out.println(" "+nombres);

        // removemos las cadenas que son iguales a otra ya guardada (uso de metodo remove())
        for (int i=0 ; i<nombres.size()-1 ; i++) {
            for (int j=i+1 ; j<nombres.size() ; j++) {
                if (nombres.get(i) == nombres.get(j)) {
                    nombres.remove(j);
                    break;
                }
            }
        }

        // mostramos el arraylist con los duplicados removidos
        System.out.println("El arraylist sin duplicados es:");
        System.out.println(" "+nombres);
        System.out.println();

        // ejercicio 18 - crea un arraylist de enteros y encuentra la suma de los elementos en indices pares
        System.out.println("-------- salida ejercicio 18 --------");
        System.out.println("Arraylist: "+enteros);

        // encontramos los indices pares con un if y sumamos los valores en ellos en una variable
        // *se da por hecho que '0' es par*
        suma = 0;
        for (int i=0 ; i<enteros.size() ; i++) {
            if (i==0) {
                suma += enteros.get(i);
            } else if (i%2 == 0) {
                suma += enteros.get(i);
            }
        }

        // se muestra la suma de los valores en indices pares
        System.out.println("Suma de valores en los indices pares del arraylist:");
        System.out.println(" "+suma);
        System.out.println();


        // ejercicio 19 - comprueba si un arraylist de enteros contiene un numero en especifico
        System.out.println("-------- salida ejercicio 19 --------");
        boolean elNumeroEsta = false;
        int numeroBuscado = 5;
        //int numeroBuscado = 30;

        System.out.println("Arraylist: "+enteros);
        System.out.println("Numero buscado: "+numeroBuscado);

        for (int i=0 ; i<enteros.size() ; i++) {
            if (numeroBuscado == enteros.get(i)) {
                elNumeroEsta = true;
                break;
            } else {
                elNumeroEsta = false;
            }
        }

        if (elNumeroEsta) {
            System.out.println("'El numero buscado si esta en el arraylist'");
        } else {
            System.out.println("'El numero buscado no esta en el arraylist'");
        }
        System.out.println();


        // ejercicio 20 - en un arraylist de cadenas, encuentra la de mayor longitud
        System.out.println("-------- salida ejercicio 20 --------");
        System.out.println("Arraylist: " +nombres);


        String cadenaMayor = nombres.get(0);
        for (int i=0 ; i<nombres.size() ; i++) {
            if (nombres.get(i).length() > cadenaMayor.length()) {
                cadenaMayor = nombres.get(i);
            }
        }

        System.out.println("La cadena de mayor longitud es: "+cadenaMayor);
        System.out.println();


        // ejercicio 21 - encuentra el promedio de los numeros de un arraylist de enteros
        System.out.println("-------- salida ejercicio 21 --------");
        System.out.println("Arraylist: "+enteros);
        suma = 0;
        for (int i=0; i<enteros.size(); i++) {
            suma += enteros.get(i);
        }

        // sacamos el promedio
        double promedio = (double)suma / (double)enteros.size();
        System.out.println("El promedio de los numeros del arraylist es: "+promedio);
        System.out.println();


        // ejercicio 22 - crea un arraylist de enteros y ordenalo de forma ascendente
        System.out.println("-------- salida ejercicio 22 --------");
        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        //llenamos el arraylist
        for (int i=0; i<20; i++) {
            numeros.add(random.nextInt(1,100));
        }

        // eliminamos los duplicados
        for (int i=0 ; i<numeros.size()-1 ; i++) {
            for (int j=i+1 ; j<numeros.size() ; j++) {
                if (numeros.get(i) == numeros.get(j)) {
                    numeros.remove(j);
                    break;
                }
            }
        }
        //mostramos el array que se uasra
        System.out.println("Arraylist: "+numeros);

        // ordenamos el array
        for (int i=0; i<numeros.size(); i++) {
            for (int j=0; j<numeros.size(); j++) {
                aux = numeros.get(i);
                if (aux<numeros.get(j)){
                    numeros.set(i , numeros.get(j));
                    numeros.set(j , aux);
                }
            }
        }

        // mostramos el array final
        System.out.println("El arraylist ordenado es: "+numeros);
        System.out.println();


        // ejercicio 23 - crea un arraylist de numeros enteros y elimina todos los valores mayores que cierto numero
        System.out.println("-------- salida ejercicio 23 --------");
        // agrego algunos valores mas a 'enteros'
        enteros.add(17);
        enteros.add(23);
        enteros.add(45);
        System.out.println("Arraylist: "+enteros);

        // se eliminan los valores meyores a 17 (metodo removeIf(numero -> 'condicion'))
        enteros.removeIf(numero -> numero>17);

        System.out.println("El nuevo arraylist es: "+enteros);
        System.out.println();


        // ejercicio 24 - obten la cantidad de apariciones de una cadena en un arraylist de cadenas
        System.out.println("-------- salida ejercicio 24 --------");
        // agrego mas nomrbes al arraylist
        nombres.add("Luis");
        nombres.add("Alex");
        nombres.add("Leo");
        nombres.add("Luis");
        System.out.println("Arraylist: "+nombres);

        // inicializo las variables necesarias
        int existencias = 0;
        String cadena = nombres.get(0);/*colocar una posicion del 0 al 8 incluidos 0 y 8*/
        //String cadena = nombres.get(2);/*colocar una posicion del 0 al 8 incluidos 0 y 8*/

        // comparamos la cadena con las cadenas del arraylist para encontrar sus existencias
        for (int i=0; i<nombres.size(); i++) {
            if (cadena == nombres.get(i)) {
                existencias +=1;
            }
        }

        // mostramos el resultado
        System.out.println("Las existencias de la cadena "+cadena+" es: "+existencias);

        // remuevo las ocurrencias apra trabajar el arreglo mas comodamente despues
        nombres.remove("Luis");
        nombres.remove("Alex");
        nombres.remove("Leo");
        nombres.remove("Luis");
        System.out.println();


        // ejercicio 25 - ordena un arraylist de cadenas alfabeticamente
        System.out.println("-------- salida ejercicio 25 --------");
        nombres.add("Agustina");
        nombres.add("Rodri");
        nombres.add("Alejo");
        nombres.add("Valentina");
        nombres.add("Nico");
        System.out.println("Arraylist: ");
        System.out.println(" "+nombres);

        String auxCadena;
        for (int i=0; i<nombres.size(); i++) {
            for (int j=0; j<nombres.size(); j++) {
                auxCadena = nombres.get(i);
                if (auxCadena.charAt(0)<nombres.get(j).charAt(0)){
                    nombres.set(i , nombres.get(j));
                    nombres.set(j , auxCadena);
                }
            }
        }

        // mostramos el array final
        System.out.println("El arraylist ordenado es: "+nombres);
        System.out.println();
    }
}
