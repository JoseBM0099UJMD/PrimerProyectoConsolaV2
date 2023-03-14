/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsolaprimerparcial;

import java.util.Scanner;

/**
 *
 * @author Alejandro Bautista
 */
public class Menu {

    public void menu() {
        Accesologin acceso = new Accesologin();

        Scanner leer = new Scanner(System.in);
        int opcion;

        if (acceso.login() == true) {

            System.out.println("Menu de Opciones");
            System.out.println("1. Venta nueva");
            System.out.println("2.Consultar inventarios");
            System.out.println("3.Cambiar contrasena");
            System.out.println("4.Salir del sistema");
            System.out.println("Digite una opcion \n");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1: ///Realizar venta
                    Venta venta = new Venta();
                    venta.ventas();
                    break;

                case 2: ///Consultar inventario
                    Catalogo catalogo = new Catalogo();
                    catalogo.Catalogo();
                    break;
                case 3:
                    ModificarClave clave = new ModificarClave();
                    clave.modificarClave();
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
            }
        }

    }

}
