import java.util.Scanner;
/*=============================================== PUNTO  1 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();


        if (num%2==0) {
            System.out.println("El numero que ingreso es par");
        } else {
            System.out.println("El numero qeu ingreso es impar");
        }
    }
}
/*=============================================== PUNTO  2 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        if (num%10==0){
            System.out.println("El numero ingresado es multiplo de 10");
        } else {
            System.out.println("El numero ingresado no es multiplo de 10");
        }
    }
}
/*=============================================== PUNTO  3 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        String caracter;
        caracter = sc.nextLine();

        if (Character.isUpperCase(caracter)){
            System.out.println("El o los caracteres estan en mayusculas");
        } else {
            System.out.println("El o los caracteres estan en minusculas")
        }
    }
}
/*=============================================== PUNTO  4 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int num_a, num_b;
        num_a = sc.nextInt();
        num_b = sc.nextInt();


        if (num_a%1==0 && num_b%1==0)
            if (num_b==num_B)){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son distintos")
        }
    }
}
/*=============================================== PUNTO  5 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int numa, numb;
        numa = sc.nextInt();
        numb = sc.nextInt();

        if (numa>numb) {
            System.out.println("El numero primer numero es mayor que el segundo");
        } else {
            System.out.println("El numero segundo numero es mayor que el primero");
        }
    }
}
/*=============================================== PUNTO  6 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int numa, numb;
        System.out.println("Numero a: ");
        numa = sc.nextInt();
        System.out.println("Numero b: ");
        numb = sc.nextInt();

        if (numa%10==numb%10)){
            System.out.println("La ultima cifra de los numeros es la misma");
        } else {
            System.out.println("La ultima cifra de los numeros es distinta")
        }
    }
}
/*=============================================== PUNTO  7 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("De un numero: ");
        num = sc.nextInt();

        if (num%1==0) {
            if (num>=5 && num%5==0 && num>=3 && num%3==0) {
                System.out.println("El numero es multiplo de 5 y de 3");
            }
        }
    }
}
/*=============================================== PUNTO  8 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner (System.in);
        int num;

        System.out.println("Escribe un numero entero:");
        num = sc.nextInt();

        if (num%2==num%3) {
            System.out.println("El numero es multiplo de 2 y de 3");
        } else if (num%2==0) {
            System.out.println("El numero es multiplo de 2");
        } else if (num%3==0) {
            System.out.println("El numero es multiplo de 3");
        }
    }
}
/*=============================================== PUNTO  9 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Escribe un caracter: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Escribe otro caracter: ");
        char ch2 = sc.next().charAt(0);

        if (ch1==ch2) {
            System.out.println("Los caracteres son identicos");
        }else{
            System.out.println("Los caracteres son distintos");
        }
    }
}
/*=============================================== PUNTO 10 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        char a,b;
        System.out.println("Introduce un caracter");
        a = sc.next().charAt(0);
        System.out.println("Introduce otro caracter");
        b = sc.next().charAt(0);

        if (Character.isLowerCase(a)) {
            System.out.println("El primer caracter esta en minusculas");
        } else {
            System.out.println("El primer caracter no esta en minusculas");
        }

        if (Character.isLowerCase(b)) {
            System.out.println("El segundo caracter esta en minusculas");
        } else {
            System.out.println("El segundo caracter no esta en minusculas");
        }
    }
}
/*=============================================== PUNTO 11 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        char a;
        System.out.println("Introduce un caracter");
        a = sc.next().charAt(0);

        if (a=='0' || a=='1' || a=='2' || a=='3' || a=='4' || a=='5' || a=='6' || a=='7' || a=='8' || a=='9') {
            System.out.println("El caracter es un digito numerico");
            System.out.println("El nuemro esta entre 0 y 9");
        } else {
            System.out.println("El caracter no es un numero entre 0 y 9");
        }
    }
}
/*=============================================== PUNTO 12 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int numa, numb, resultado;

        System.out.println("Dividendo: ");
        numa = sc.nextInt();
        System.out.println("Divisor (no puede ser cero): ");
        numb = sc.nextInt();

        if (numb == 0) {
            System.out.println("El divisor no puede ser cero");
        } else {
            resultado = numa/numb;
            System.out.println("El resultado es "+resultado);
        }
    }
}
/*=============================================== PUNTO 13 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int anio;

        System.out.println("Ingrese un año: ");
        anio = sc.nextInt();

        if (anio%4==0 && anio%100!=0 || anio%400==0) {
            System.out.println("El año es biciesto");
        } else {
            System.out.println("El año no es biciesto");
        }
    }
}
/*=============================================== PUNTO 14 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        if (num%10==num/100){
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }

    }
}
/*=============================================== PUNTO 15 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int h,m,s;

        System.out.println("Horas: ");
        h = sc.nextInt();
        System.out.println("Minutos: ");
        m = sc.nextInt();
        System.out.println("Segundos: ");
        s = sc.nextInt();

        if (h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60) {
            System.out.println("La hora es: " +h+ ":" +m+ ":" +s);
        } else{
            System.out.println("La hora ingresada no es correcta");
        }
    }
}
/*=============================================== PUNTO 16 ==============================================*/
/*puclic class Main{
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Introduzca un numero de mes:");
        mes = sc.nextInt();

        if (mes > 12 || mes < 1) {
            System.out.println("El numero introducido no corresponde a ningun mes");
        } else {
            if (mes == 1) {
                System.out.println("El mes febrero tiene 31 dias");
            }
            if (mes == 2) {
                System.out.println("El mes febrero tiene 28 dias");
            }
            if (mes == 3) {
                System.out.println("El mes marzo tiene 31 dias");
            }
            if (mes == 4) {
                System.out.println("El mes abril tiene 30 dias");
            }
            if (mes == 5) {
                System.out.println("El mes mayo tiene 31 dias");
            }
            if (mes == 6) {
                System.out.println("El mes junio tiene 30 dias");
            }
            if (mes == 7) {
                System.out.println("El mes julio tiene 31 dias");
            }
            if (mes == 8) {
                System.out.println("El mes agosto tiene 31 dias");
            }
            if (mes == 9) {
                System.out.println("El mes septiembre tiene 30 dias");
            }
            if (mes == 10) {
                System.out.println("El mes abril octubre 31 dias");
            }
            if (mes == 11) {
                System.out.println("El mes abril noviembre 30 dias");
            }
            if (mes == 12) {
                System.out.println("El mes diciembre tiene 31 dias");
            }
        }
    }
}
/*=============================================== PUNTO 17 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int quali;

        System.out.println("Ingrese una calificacion del 0 al 10:");
        System.out.print("> ");
        quali = sc.nextInt();

        if (quali>10 || quali<0) {
            System.out.println("La calificacion ingresada no esta dentro del rango de 0 a 10");
        } else if (quali<5){
            System.out.println("Nota insuficiente");
        } else if (quali>=5 && quali<6) {
            System.out.println("Nota suficiente");
        } else if (quali>=6 && quali<7) {
            System.out.println("Bien");
        } else if (quali>=7 && quali<9) {
            System.out.println("Notable");
        } else if (quali>=9 && quali<=10) {
            System.out.println("Sobresaliente");
        }
    }
}
/*=============================================== PUNTO 18 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        int num = 1;

        while (num<=100) {
            if (num<26) {
                if (num==25) {
                    System.out.println(num);
                } else {
                    if (num<10) {
                        System.out.print(" " + num + ", ");
                    } else {
                        System.out.print(num+", ");
                    }
                }
            } else if (num<51) {
                if (num==50) {
                    System.out.println(num);
                } else {
                    System.out.print(num+", ");
                }
            }else if (num<76) {

                if (num==75) {
                    System.out.println(num);
                } else {
                    System.out.print(num+", ");
                }
            }else if (num<101) {
                if (num==100) {
                    System.out.println(num);
                } else {
                    System.out.print(num+", ");
                }
            }
            num = num+1;
        }
    }
}
/*=============================================== PUNTO 19 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        int num = 1;

        do{
            if (num==100) {
                System.out.print(num);
            } else {
                System.out.print(num+", ");
            }
            num = num+1;
        } while (num<=100);
    }
}
/*=============================================== PUNTO 20 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        int i;
        for (i=1; i<=100; i++) {
            if (i == 100) {
                System.out.print(i);
            } else {
                System.out.print(i+", ");
            }
        }
    }
}
/*=============================================== PUNTO 21 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        int i;
        i=100;

        while (i>=1) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i+", ");
            }

            i--;
        }
    }
}
/*=============================================== PUNTO 22 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        int i;
        i = 100;

        do{
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i+", ");
            }

            i--;
        }while (i>=1);
    }
}
/*=============================================== PUNTO 23 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        int i;

        for (i=100; i>=1; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i+", ");
            }
        }
    }
}
/*=============================================== PUNTO 24 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int num,i;

        System.out.println("ingrese un numero:");
        num = sc.nextInt();

        if (num>1) {
            System.out.println("Bucle for:");
            for (i=1; i<=num; i++){
                System.out.print(i+" ");
            }
            System.out.println("");
            System.out.println("Bucle while:");
            i=1;
            while (i<=num) {
                System.out.print(i+" ");
                i++;
            }
            System.out.println("");
            System.out.println("Bucle do while:");
            i=1;
            do{
                System.out.print(i+" ");
                i++;
            } while (i<=num);
        } else {
            System.out.println("El numero debe ser mayor que 1");
        }
    }
}
/*=============================================== PUNTO 25 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int num,i,aux;

        System.out.println("ingrese un numero:");
        num = sc.nextInt();
        aux = num;

        if (num>1) {
            for (i=num; i>=1; i--){
                System.out.print(i+" ");
            }
            System.out.println("");
            while (num>=1) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println("");
            do{
                System.out.print(aux+" ");
                aux--;
            } while (aux>0);
        } else {
            System.out.println("El numero debe ser mayor que 1");
        }
    }
}
/*=============================================== PUNTO 26 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int nump,numt,aux,i;

        System.out.println("Introduzca dos numeros distintos enteros:");
        numt = sc.nextInt();
        nump = sc.nextInt();
        System.out.println("");

        if (nump == numt) {
            System.out.println("Los numeros son iguales.");
        } else if (numt>nump) {
            aux=numt;
            numt=nump;
            nump=aux;
            for (i=numt; i<=nump; i++) {
                System.out.print(i+". ");
            }
        } else {
            for (i=numt; i<=nump; i++) {
                System.out.print(i+". ");
            }
        }
    }
}
/*=============================================== PUNTO 27 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,i;

        a = 2;
        b = 1;

        while (a>=b) {
            System.out.println("Introduzca un numero menor y luego un numero mayor");
            a = sc.nextInt();
            b = sc.nextInt();
            if (a>b) {
                System.out.println("el numero A debe ser menor que B");
                continue;
            } else if (a==b) {
                System.out.println("A debe ser menor que B");
                continue;
            }
        }

        for (i=a; i<=b; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

    }
}
/*=============================================== PUNTO 28 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        int n, m, i;

        System.out.println("De un numero para saber sus multiplos");
        n = sc.nextInt();
        System.out.println("De un numero como limite para calcular los multiplos");
        m = sc.nextInt();
        System.out.println("");

        for (i=1; i<=m; i++) {
            if (i%n==0) {
                System.out.println(i);
            }
        }
    }
}
/*=============================================== PUNTO 29 ==============================================*/
/*puclic class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        double millas,km;

        System.out.println("De una cantidad de millas:");
        millas = sc.nextInt();
        System.out.println("");

        while (millas>0) {
            km=millas*1.6093;
            System.out.println("Las millas ingresadas equivalen a "+km+" Kilometros");
            System.out.println("Introduzca otra cantidad para continuar. O introduzca 0 para salir");
            millas = sc.nextInt();
            System.out.println("");
        }
    }
*/