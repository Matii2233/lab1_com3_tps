public class Coche {
    private String marca;
    private String modelo;
    private int añoSalida;


    public Coche(String marca, String modelo, int añoSalida) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoSalida = añoSalida;
    }


    public void acelerar(){
        System.out.println("*acelera a toda velocidad*");
    }
    public void frenar() {
        System.out.println("*frena bruscamente*");
    }


    public static void main(String args[]) {
        Coche co = new Coche("Ford", "mustang", 1964);

        System.out.println();
        System.out.println("El auto es marca "+ co.marca +", modelo "+ co.modelo);
        System.out.println("El auto salio en el 14 de abril del año "+ co.añoSalida);
        System.out.println();

        co.acelerar();
        co.frenar();
    }
}
