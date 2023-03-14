package proyectoconsolaprimerparcial;

import java.util.Scanner;

public class Main {

    

    public static void main(String[] args) {
        Accesologin acceso = new Accesologin();
        Menu menu = new Menu();


        acceso.login();
        menu.menu();


    }
}
