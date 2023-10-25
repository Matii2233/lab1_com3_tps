public class Perro {
    // declaracion de los atributos de la clase perro
    private String nombre;
    private String raza;
    private int edad;



    // Aqui se inicializaran los atributos
    public Perro (String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }



    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_raza(){
        return raza;
    }
    public int obtener_edad(){
        return edad;
    }



    // Se crea un metodo que imprime el ladrido en la consola
    public void ladrar(){
        System.out.println("Guauu!! Guauu!!");
    }



    // por ultimo llama a la funcion ladrad dentro del metodo "main"
    public static void main(String args[]){
        // inicializamos el objeto Perro con el nombre "doge" y le damos valores de nombre, raza y edad
        Perro doge = new Perro("Cali", "American Bully", 3);

        System.out.println();
        // Llamamos al metodo ladrar de la clase perro para ver el ladrido en la consola
        doge.ladrar();
        System.out.println();


        // llamamos a los metodos de la clase perro para obtener su nombre, raza y edad
        System.out.println("El nombre de mi perro es "+doge.nombre);
        System.out.println("La raza de "+doge.nombre+" es '"+doge.raza+"'");
        System.out.println("la edad de "+doge.nombre+" es de "+doge.edad+" años");
        System.out.println();
    }
}
