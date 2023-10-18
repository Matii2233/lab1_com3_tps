import java.util.Scanner;

public class Bancaria {
    private int nroCuenta;
    private int saldo;


    public Bancaria(int nroCuenta, int saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }


    public int obtenerNro(){
        return nroCuenta;
    }
    public int obtenerSaldo(){
        return saldo;
    }


    public int ingresar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad a ingresar:");
        System.out.print(" > ");
        saldo += sc.nextInt();

        return saldo;
    }
    public int retirar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad a retirar:");
        System.out.print(" > ");
        saldo -= sc.nextInt();

        return saldo;
    }


    public static void main(String args[]) {
        Bancaria bn = new Bancaria(42534, 20000);
        Scanner sc = new Scanner (System.in);
        int salida = 1;

        System.out.println("Su numero de cuenta es: "+ bn.nroCuenta);
        System.out.println("Su saldo es: "+ bn.saldo);

        while (salida != 0) {
            System.out.println();
            bn.ingresar();
            System.out.println("Su saldo es: "+ bn.saldo);
            System.out.println();
            bn.retirar();
            System.out.println("Su saldo es: "+ bn.saldo);

            System.out.println();
            System.out.println("Si desea salir pulse 0. Si desea continuar pulse 1");
            salida = sc.nextInt();
            while (salida>1 || salida<0) {
                System.out.println("Error. intentelo de nuevo");
                salida = sc.nextInt();
            }
        }
    }
}
