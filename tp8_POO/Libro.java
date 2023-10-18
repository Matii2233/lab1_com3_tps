public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;


    public Libro(String titulo, String autor, int añoPublicacion){
        this.autor          = autor;
        this.añoPublicacion = añoPublicacion;
        this.titulo         = titulo;
    }


    public String obtenerTitulo(){
        return titulo;
    }
    public String obtenerAutor(){
        return autor;
    }
    public int obtenerAño(){
        return añoPublicacion;
    }


    public static void main (String args[]) {
        Libro lb = new Libro("Las Mil y Una Noches", "Mario Vargas Llosa", 1940);

        System.out.println("El titulo del libro es  '" + lb.titulo+ "'");
        System.out.println("El autor del libro es  '" + lb.autor+ "'");
        System.out.println("El año de publicacion del libro es  " + lb.añoPublicacion);
    }
}
