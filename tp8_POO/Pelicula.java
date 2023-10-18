public class Pelicula {
    private String titulo;
    private String director;
    private int duracionMinutos;


    public Pelicula (String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }


    public void mostrarAtributos(){
        Pelicula pl = new Pelicula(titulo,director,duracionMinutos);
        System.out.println();
        System.out.println("  Titulo:  "+ pl.titulo);
        System.out.println("Director:  "+ pl.director);
        System.out.println("Duracion:  "+ pl.duracionMinutos +" minutos");
        System.out.println();
    }


    public static void main(String args[]) {
        Pelicula pl = new Pelicula("Jurassic Park", "Steven Spilberg", 127);
        
        //metodo para obtener el valor de los atributos del objeto
        pl.mostrarAtributos();
    }
}
