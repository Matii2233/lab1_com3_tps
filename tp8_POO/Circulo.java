public class Circulo {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double areaCirculo(){
        double area;
        area = Math.PI * radio*radio;
        area = Math.round(area * Math.pow(10,2)) / Math.pow(10,2);
        return area;
    }
    public double circunferencia(){
        double cir;
        cir = Math.PI * radio * 2;
        cir = Math.round(cir * Math.pow(10,2)) / Math.pow(10,2);
        return cir;
    }



    public static void main(String args[]){
        Circulo c = new Circulo(3.2);

        System.out.println("El area del circulo es:");
        System.out.println(c.areaCirculo());
        System.out.println();
        System.out.println("La circunferencia es:");
        System.out.println(c.circunferencia());
    }
}
