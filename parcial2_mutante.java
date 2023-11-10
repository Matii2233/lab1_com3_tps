import java.util.Scanner;

public class parcial2_mutante {
    public static void main (String[] args) {
        String[] adn = new String[6];
        llenar_secuencia_adn(adn); //llamado a la funcion llenar secuencia adn//

        /*//prueba mutante
        String[] adn = {
                "atgggg",
                "acattt",
                "agcaac",
                "aagcac",
                "tccgct",
                "ttacta"
        };*/

        /*//prueba humano
        String[] adn = {
                "atacaa",
                "gcattt",
                "tctaac",
                "caggac",
                "tcctat",
                "ttacta"
        };
        */

        // mostrar la secuencia
        for (int i=0; i<adn.length; i++) {
            System.out.println(" "+adn[i]);
        }

        // llamar a la funcion es mutante
        boolean mutante = esMutante(adn);

        // if para la resolucion final
        System.out.println();
        if (mutante) {
            System.out.println("El adn es de un mutante");
        } else {
            System.out.println("El adn es de un humano");
        }
    }




    // Funcion booleana devuelve true si el adn es de mutante y false si es de humano
    public static boolean esMutante (String[] adn) {
        // la variable nos auyudara a contar los patrones uno por uno
        int patrones = 0;

        // se convierte la el array a una matriz para mayor comodidad
        char[][] dna = convertir_a_matriz(adn);

        // llamado a las funciones que cuntan los patrones existentes
        patrones = detectar_patrones_horizontales(dna, patrones);
        patrones = detectar_patrones_verticales(dna, patrones);
        patrones = detectar_patrones_diagonales(dna, patrones);

        if (patrones >= 2) {
            return true;
        } else {
            return false;
        }
    }



    // FUNCION detectar patrones horizontales
    public static int detectar_patrones_horizontales (char[][] dna, int patrones) {
        char letra;
        for (int i=0; i<6; i++) {  //se recorre cada fila hasta la posicion 2 para contar patrones horizontales//
            for (int j=0; j<3; j++) {
                letra = dna[i][j];
                if (letra == dna[i][j+1]) {
                    if (letra == dna[i][j+2]) {
                        if (letra == dna[i][j+3]) {
                            patrones += 1;
                            break;
                        }
                    }
                }
            }
        }
        return patrones;
    }



    // FUNCION detectar patrones verticales
    public static int detectar_patrones_verticales (char[][] dna, int patrones) {
        char letra;
        for (int j=0; j<6; j++) {  //para los verticales se recorren las columnas hasta la posicion 2
            for (int i=0; i<3; i++) {
                letra = dna[i][j];
                if (letra == dna[i+1][j]) {
                    if (letra == dna[i+2][j]) {
                        if (letra == dna[i+3][j]) {
                            patrones += 1;
                            break;
                        }
                    }
                }
            }
        }
        return patrones;
    }



    // FUNCION detectar patrones diagonales
    public static int detectar_patrones_diagonales(char[][] dna, int patrones) {
        char letra;
        // se crea una lista para guardar las posiciones donde hay un patron diagonal
        int[] pos = new int[8];
        // y una variable booleana para comprobar que los valores de los indices no estan en la lista "pos"
        boolean noEsta = true;

        // busqueda de diagonales de arriba a abajo e izquierda a derecha
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<8; k++) {  //si la posicion actual esta en "pos" se pasa a la siguiente posicion
                    if (i!=0 && j!=0) {
                        if (i==pos[k] && j==pos[k]) {
                            noEsta=false;
                        }
                    }
                }
                if (noEsta) { //si la posicio nactual no esta en pos, se procede a encontrar un patron
                    letra = dna[i][j];
                    if (letra == dna[i+1][j+1]) {
                        if (letra == dna[i+2][j+2]) {
                            if (letra == dna[i+3][j+3]) {
                                patrones += 1; // cuando se encuentra, se guarda las posiciones del patron en "pos"
                                pos[0]=i; pos[1]=j; pos[2]=i+1; pos[3]=j+1;
                                pos[4]=i+2; pos[5]=j+2; pos[6]=i+3; pos[7]=j+3;
                            }
                        }
                    }
                }
            }
        }

        // busqueda de diagonales de abajo a arriba e izquierda a derecha
        for (int i=5; i>2; i--) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<8; k++) {
                    if (i!=0 && j!=0) {
                        if (i==pos[k] && j==pos[k]) {
                            noEsta=false;
                        }
                    }
                }
                if (noEsta) {
                    letra = dna[i][j];
                    if (letra == dna[i-1][j+1]) {
                        if (letra == dna[i-2][j+2]) {
                            if (letra == dna[i-3][j+3]) {
                                patrones += 1;
                                pos[0]=i; pos[1]=j; pos[2]=i-1; pos[3]=j+1;
                                pos[4]=i-2; pos[5]=j+2; pos[6]=i-3; pos[7]=j+3;
                            }
                        }
                    }
                }
            }
        }
        return patrones;
    }




    // Convierte el array de strings a una matriz de caracteres. Donde cada caracter es una letra
    public static char[][] convertir_a_matriz(String[] adn) {
        char[][] dna = new char[6][6];

        for (int i = 0; i<6; i++) {
            dna[i] = adn[i].toCharArray();
        }
        return dna;
    }




    // FUNCION llenar una secuencia de adn
    public static void llenar_secuencia_adn (String[] adn) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Ingrese lineas de 6 letras ('A', 'C', 'G' o 'T') para completar la secuencia de adn:");
        System.out.println();

        for (int i=0; i<adn.length; i++) {
            boolean exit=false;
            while (exit==false) {  // por cada linea a ingresar, se entra en un while que se repita hasta que sea correcta
                System.out.print(" Linea "+(i+1)+": ");
                palabra = sc.nextLine();
                if (palabra.length() == 6) { // si la linea es de 6, se continua
                    exit = letraEsCorrecta(palabra, exit); // se ingresa a la funcion. Devuelve true si la palabra es correcta
                    if (exit) {
                        adn[i] = palabra;
                        break;
                    } else { // si no es correcta se reinicia el bucle while
                        System.out.println("Palabra incorrecta intentalo denuevo");
                    }
                } else {
                    System.out.println("La linea de la secuencia debe contar con 6 letras");
                }
            }
        }
    }




    // FUNCION determinar si la palabra ingresada es correcta
    public static boolean letraEsCorrecta(String palabra, boolean exit) {
        // este algoritmo busca letras distintas de las indicadas en cada linea que fue ingresada antes
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (!(letra=='a' || letra=='c' || letra=='g' || letra=='t' || letra=='A' || letra=='C' || letra=='G' || letra=='T')) {
                return false;
            }
        }
        // si no encuentra letras incorrectas devuelve true
        return true;
    }
}