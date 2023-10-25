import java.util.Scanner;

public class Factura {
    private int    nrofactura;
    private String fecha;
    private String cliente;
    private double puv;
    private int    cantidad;

    String articulo;
    double subtotal;
    double iva;
    double total;




    public Factura (
                    int    nrofactura,
                    String fecha,
                    String cliente,
                    double puv,
                    int    cantidad
                   )
    {

        this.nrofactura = nrofactura;
        this.fecha      = fecha;
        this.cliente    = cliente;
        this.puv        = puv;
        this.cantidad   = cantidad;
    }




    public void añadirArticulo (String art) {
        articulo = art;
    }
    public double calcularSubtotal () {
        subtotal = cantidad*puv;
        return subtotal;
    }
    public double calcularIva () {
        iva = 0.15*puv;
        return iva;
    }
    public double calcularTotal () {
        total = cantidad*(puv+calcularIva());
        return total;
    }




    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        Factura fc = new Factura(1003, "15/11/2022", "Axel", 220, 5);
        String art;


        System.out.println("Añade un articulo:");
        art = sc.nextLine();
        System.out.println();

        fc.añadirArticulo(art);
        System.out.println("El articulo añadido fue: '" +fc.articulo+ "'");
        System.out.println("El iva añadido a cada unidad de la compra es de: " +fc.calcularIva());
        System.out.println("El subtotal de la factura (total de compra, sin iva) es: " +fc.calcularSubtotal());
        System.out.println("El total de la factura (total de la compra con iva aplicado) es: " +fc.calcularTotal());
    }
}
