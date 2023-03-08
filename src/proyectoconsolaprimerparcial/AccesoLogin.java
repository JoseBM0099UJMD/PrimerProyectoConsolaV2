package proyectoconsolaprimerparcial;

import java.util.Scanner;

public class AccesoLogin {

    public static void main(String[] args) {
        
        LeerFichero leer = new LeerFichero();
        String[] usuario = leer.LeerArchivo();

        Scanner teclado = new Scanner(System.in);
        String usuarios = "";
        String contrasena = "";
        int acceso = 0;

        System.out.print("Ingrese usuario :");
        usuarios = teclado.nextLine();

        System.out.print("Ingrese contraseña :");
        contrasena = teclado.nextLine();

        for (int j = 0; j < usuario.length; j++) {
            if (usuario[j].equals(usuarios)) {
                acceso++;
            }
            if (usuario[j].equals(contrasena)) {
                acceso++;
            }
        }

        if (acceso == 2) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Usuario y contraseña NO validas");
        }

    }
}
