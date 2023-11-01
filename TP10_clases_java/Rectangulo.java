public class Rectangulo {
    private double ancho;
    private double alto;


    public Rectangulo(double ancho, double alto) {
        this.alto  =  alto;
        this.ancho = ancho;
    }


    public double areaRectangulo() {
        double area;
        area = alto*ancho;
        area = Math.round(area * Math.pow(10,2)) / Math.pow(10,2);
        return area;
    }
    public double PerimetroRectangulo() {
        double perimetro;
        perimetro = alto*2 + ancho*2;
        perimetro = Math.round(perimetro * Math.pow(10,2)) / Math.pow(10,2);
        return perimetro;
    }


    public static void main(String args[]) {
        Rectangulo rc = new Rectangulo(3.44,2.75);

        System.out.println();
        System.out.println("El ancho del rectangulo vale: "+ rc.ancho);
        System.out.println("El alto del rectangulo vale: "+ rc.alto);
        System.out.println("El area del rectangulo vale: "+ rc.areaRectangulo());
        System.out.println("El perimetro del rectangulo vale: "+ rc.PerimetroRectangulo());
    }
}
