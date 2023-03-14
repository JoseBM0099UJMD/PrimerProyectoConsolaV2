/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsolaprimerparcial;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Alejandro Bautista
 */
public class Accesologin {
    

    public String[] LeerFichero() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String[] usuario = null;
        FileWriter fichero = null;
        PrintWriter pw = null;
        String CodProducto = "";
        String Cantidad = "";
        

        try {
           
            usuario = new String[8];
            
            String path = System.getProperty("user.dir"); // ruta relativa
            
            path = path + "\\archivo\\archivo.txt";
            
            System.out.println("path :" + path);
            archivo = new File(path);
            
            fr = new FileReader(archivo);
            
            br = new BufferedReader(fr);
            String linea;
            
            String lineatmp = "";
            
            int i = 0;
            
            while ((linea = br.readLine()) != null) {
                lineatmp = lineatmp + linea;

            }
            
            usuario = lineatmp.split(",");
            
            System.out.println(Arrays.asList(usuario));
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
        return usuario;
    }
        
        public boolean login(){
            
                boolean verificador = false;
                
                Accesologin leer = new Accesologin();
        String[] usuario = leer.LeerFichero();

            Scanner teclado = new Scanner(System.in);
        String usuarios = "";
        String contrasena = "";
        boolean acceso = false;
        boolean acceso1 = false;
        boolean acceso2 = false;
        
        while(verificador ==false){
            System.out.print("Ingrese usuario :");
        usuarios = teclado.nextLine();
                System.out.print("Ingrese contraseña :");
        contrasena = teclado.nextLine();
        for (int j = 0; j < usuario.length; j++) {
            if (usuario[j].equals(usuarios)) {
                ///acceso++;
                acceso1= true;
            }
            
            if (usuario[j].equals(contrasena)) {
                acceso2 = true;
            }
            
        }
        if(acceso1 == true && acceso2 == true){
            acceso = true;
        }
        if (acceso == true) {
            
            System.out.println("Bienvenido al sistema");
            verificador = true;
            
        } else {
            
            System.out.println("Usuario y contraseña NO validas");
            
            
        }
        ///}
        }
        return verificador;
        
        } 


        public static void main(String[] args) {
        
        ///Accesologin leer = new Accesologin();
        ///String[] usuario = leer.LeerFichero();
        /*Scanner teclado = new Scanner(System.in);
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
            Accesologin.verificador = true;
            
        } else {
            
            System.out.println("Usuario y contraseña NO validas");
            
            
        }
   */

    
}
    } 
