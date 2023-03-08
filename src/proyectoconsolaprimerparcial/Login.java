package proyectoconsolaprimerparcial;

import java.util.Scanner;

public class Login {

    Scanner leer = new Scanner(System.in);
    String sysUsuario = "admin";
    String sysContrasena = "123";
    Boolean autenticador = false; //CREACION BOOL AUTENTICADOR, iniciado en falso para que solo sea true cuando las credenciales sean las correctas

    public void iniciarSesion() {
        
        System.out.print("Bienvenido al sistema ComputadorasDiego\n");
        System.out.print("Favor ingresar credenciales\n\n");
        
        System.out.print("Digite su usuario: ");
        String Usuario = leer.next();
        System.out.print("Digite su contrasena: ");
        String Contrasena = leer.next();

        if (sysUsuario.equals(Usuario)) {
            if (sysContrasena.equals(Contrasena)) {
            System.out.println("Inicio de sesion exitoso\n");
            autenticador = true; //se marca true cuando se es exitoso
        } else{
            System.out.println("Contrasena invalida");
            
            }
        }else{
            System.out.println("Usuario invalido");
        }   
        
    }
}
