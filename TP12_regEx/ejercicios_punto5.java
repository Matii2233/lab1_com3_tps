import java.util.regex.*;
import java.util.ArrayList;

public class ejercicios_punto5 {
    public static void main(String[] args){
        String cadena = "carrera";
        //cadena = "carrer5";
        //cadena = "2arrera";
        //cadena = "2arrer5";


        boolean termine = cadena.matches("^(?![\\s\\S]*\\d$).*$");
        System.out.println(termine);

        boolean empiece = cadena.matches("^(?![0-9]).*");
        System.out.println(empiece);

        //cadena = "Carrera";
        //cadena = "carrera";
        //cadena = "Carr";
        boolean validar = cadena.matches("[a-zA-Z]{5,10}");
        System.out.println(validar);

        //cadena = "44-444-444";
        //cadena = "44-444-44";
        //cadena = "44-44-444";
        //cadena = "444-444-444";
        boolean validarDni = cadena.matches("^[0-9]{2}-[0-9]{3}-[0-9]{3}$");
        System.out.println(validarDni);

        //cadena = "abcdario";
        //cadena = "bcdario";
        //cadena = "abc";
        boolean encontrarABC = cadena.matches(".*abc.*");
        System.out.println(encontrarABC);

        ArrayList<String> correos = new ArrayList<>();
        //cadena = "msnicolas@gmail.com";
        boolean validarMail = cadena.matches("^[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]{2,}$");
        if (validarMail) {
            correos.add(cadena);
        }

        //cadena = "nico%salinas@gmail.com";
         validarMail = cadena.matches("^[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]{2,}$");
        if (validarMail) {
            correos.add(cadena);
        }

        //cadena = "mati.2233@utn.frm.edu.ar";
         validarMail = cadena.matches("^[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]{2,}$");
        if (validarMail) {
            correos.add(cadena);
        }

        //cadena = "maatisalinas21@hotmail";
         validarMail = cadena.matches("^[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]{2,}$");
        if (validarMail) {
            correos.add(cadena);
        }
    }
}
