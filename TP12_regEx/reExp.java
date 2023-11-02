import java.util.regex.*;
import java.util.ArrayList;

public class reExp {
    public static void main(String[] args){


        // arraylist para correos, contraseñas, telefonos y cod postales
        ArrayList<String> datosValidos = new ArrayList<>();




        // conjunto de datos variados
        String[] registros = {
                "lavallecelulares@gmail.com",
                "mati%%1122@utn.frm.edu.ar",
                "pinturasmuebles@outlook.com",
                "celulares.2219",
                "444_UtnFrm_21",
                "TecnO_1121212",
                "+54-421-236-668",
                "+54-261-720-2245",
                "+56-134-4423-7865",
                "5500",
                "5501",
                "5250"
        };




        // validar DIRECCIONES DE CORREO (admite un solo punto en el dominio)
        Pattern emails = Pattern.compile("^[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]{2,}$");
        Matcher validar = emails.matcher(registros[1]);
        //Matcher validar = emails.matcher(registros[2]);

        if (validar.find()) {
            System.out.println("El correo '"+registros[1]/*registros[2]*/+"' es correcto");
        } else {
            System.out.println("El correo '"+registros[1]/*registros[2]*/+"' es incorrecto");
        }




        // validar CONTRASEÑAS
        Pattern passwords = Pattern.compile("(?=.*[A-Z])(?=.*[._-])[a-zA-Z0-9._-]{8,}");
        validar = passwords.matcher(registros[3]);
        //validar = passwords.matcher(registros[4]);

        if (validar.find()) {
            System.out.println("La contraseña '"+registros[3]/*registros[4]*/+"' es correcto");
        }else{
            System.out.println("La contraseña '"+registros[3]/*registros[4]*/+"' es incorrecto");
        }




        // validar TELEFONOS (celulares y fijos)
        Pattern phones = Pattern.compile("^[0-9]{3}-[0-9]{2,3}-[0-9]{2,4}$");
        validar = phones.matcher(registros[7]);
        //validar = phones.matcher(registros[6]);

        if (validar.find()) {
            System.out.println("El telefono '"+registros[7]/*registros[6]*/+"' es correcto");
        }else{
            System.out.println("El telefono '"+registros[7]/*registros[6]*/+"' es incorrecto");
        }




        // validar CODIGOS POSTALES
        Pattern posCodes = Pattern.compile("^55[0-9]{2}$");
        validar = posCodes.matcher(registros[11]);
        //validar = posCodes.matcher(registros[10]);

        if (validar.find()) {
            System.out.println("El codigo postal '"+registros[11]/*registros[10]*/+"' es correcto");
        }else{
            System.out.println("El codigo postal '"+registros[11]/*registros[10]*/+"' es incorrecto");
        }




        // VALIDAR ENTRADA A UN ARRAYLIST
        for (int i=0; i< registros.length; i++) {
            validar = emails.matcher(registros[i]);
            if (validar.find()){
                datosValidos.add(registros[i]);
                continue;
            }
            validar = passwords.matcher(registros[i]);
            if (validar.find()){
                datosValidos.add(registros[i]);
                continue;
            }
            validar = phones.matcher(registros[i]);
            if (validar.find()){
                datosValidos.add(registros[i]);
                continue;
            }
            validar = posCodes.matcher(registros[i]);
            if (validar.find()){
                datosValidos.add(registros[i]);
            }
        }




        // MOSTRAR ARRAYLIST
        System.out.println();
        System.out.println("Lista elementos validos:");
        System.out.println();
        for (int i=0; i<datosValidos.size(); i++) {
            System.out.println(" "+datosValidos.get(i));
        }
    }
}