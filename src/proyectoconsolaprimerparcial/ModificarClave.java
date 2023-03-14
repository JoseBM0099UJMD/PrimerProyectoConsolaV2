/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsolaprimerparcial;

import java.io.*;
import java.util.*;

/**
 *
 * @author Alejandro Bautista
 */
public class ModificarClave {
    public void modificarClave() {
    
        Scanner scanner = new Scanner(System.in);
        Map<String, String> usuarios = new HashMap<String, String>();
        String path = "archivo/archivo.txt";
        String[] usuario;

        try {
            File archivo = new File(path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                usuario = linea.split(",");
                usuarios.put(usuario[0], usuario[1]);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        System.out.print("Ingrese el usuario que desea modificar: ");
        String usuarioMod = scanner.nextLine();

        if (usuarios.containsKey(usuarioMod)) {
            System.out.print("Ingrese su contraseña actual: ");
            String passActual = scanner.nextLine();

            if (passActual.equals(usuarios.get(usuarioMod))) {
                System.out.print("Ingrese su nueva contraseña: ");
                String nuevaPass = scanner.nextLine();
                usuarios.put(usuarioMod, nuevaPass);

                try {
                    FileWriter fw = new FileWriter(path);
                    BufferedWriter bw = new BufferedWriter(fw);

                    for (Map.Entry<String, String> entry : usuarios.entrySet()) {
                        bw.write(entry.getKey() + "," + entry.getValue() + "," + "\n");
                    }

                    bw.close();
                    fw.close();
                    System.out.println("Contraseña modificada exitosamente.");
                    System.exit(0);
                } catch (IOException e) {
                    System.out.println("Error al escribir en el archivo: " + e.getMessage());
                }
            } else {
                System.out.println("Contraseña actual incorrecta.");
            }
        } else {
            System.out.println("El usuario ingresado no existe.");
        }
        //public static void main(String[] args){
    }
    
}
