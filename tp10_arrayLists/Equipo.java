import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private ArrayList<String> equipo;

    public Equipo(){
        equipo = new ArrayList<>();
    }

    public void añadirJugador(String jugador) {
        equipo.add(jugador);
    }

    public void eliminarJugador(String jugador) {
        equipo.remove(jugador);
    }

    public ArrayList<String> listadoJugadores () {
        return equipo;
    }


    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        Equipo jugadores = new Equipo ();

        // Se añaden jugadores a la plantilla
        jugadores.añadirJugador("Leandro");
        jugadores.añadirJugador("Thiago");
        jugadores.añadirJugador("Juanma");
        jugadores.añadirJugador("Mauro");
        System.out.println("Se añadio a Leandro, Thiago, Juanma y Mauro de la lista");
        System.out.println();

        // Se quitan jugadores de la misma
        jugadores.eliminarJugador("Thiago");
        System.out.println("Se quito a Thiago de la lista");
        System.out.println();

        // Listado de jugadores
        ArrayList<String> listaJugadores = jugadores.listadoJugadores();
        for (String jugador : listaJugadores) {
            System.out.println(jugador);
        }
    }
}