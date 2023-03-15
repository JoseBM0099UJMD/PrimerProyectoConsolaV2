/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsolaprimerparcial;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Date ; 


/**
 *
 * @author Alejandro Bautista
 */
public class Venta {

    private String nombre;
    private int cantidad;
    private String precio;
    
    
    ///private int id;

 /*   public void venta() {
        Catalogo catalogo = new Catalogo();
        catalogo.getCodigo();
        ///int[] id = catalogo.getCodigo();
        String[] nombre = catalogo.getNomProducto();
        int[] cantidad = catalogo.getCantidad();
        String[] precio = catalogo.getPrecio();
        Scanner teclado = new Scanner(System.in);

        String path = System.getProperty("user.dir");
        path = path + "\\Archivos\\Venta\\Factura.txt";

        FileWriter fichero = null;
        PrintWriter pw = null;

        Scanner scanner = new Scanner(path);
      

        try {

            System.out.print("Ingrese el ID del producto y la cantidad (separados por una coma): ");
            String compra = teclado.nextLine();
            
            

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
*/
    
    public void ventas(){
        Catalogo catalogo = new Catalogo();
        catalogo.Catalogo();
        String[] productos = catalogo.Productos();

        Scanner teclado = new Scanner(System.in);
        String codigo = "";

        String path = System.getProperty("user.dir");
        path = path + "\\Archivos\\Venta\\Factura.txt";

        FileWriter fichero = null;
        PrintWriter pw = null;
        
        Date fecha = new Date();

        Scanner scanner = new Scanner(path);
        int agregar = 0;
        
        
        
        
               
            try {
            double descuento = 0.03;
         

            System.out.print("Ingrese el ID del producto y la cantidad (separados por una coma): ");
            String compra = teclado.nextLine();
            
               String[] datosCompra = compra.split(",");
                String id = datosCompra[0];
                int cantidad = Integer.parseInt(datosCompra[1]);

           

            ///Encontrar el id en el archivo txt    
            boolean encontrado = false;
            for (int j = 0; j < productos.length; j++) {
                
               if (productos[0].equals(id)) {
                        
                    ///String[] detalles = productos[j].split(",");
                    
                    String nombre = productos[1];
                    double precio = Double.parseDouble(productos[2]);
                    int cantidaddisp = Integer.parseInt(productos[3]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    
                    
                    double total = cantidad * precio;
                    

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 


                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
                
            }
               if (productos[4].equals(id)) {
                   
                   String nombre = productos[5];
                    double precio = Double.parseDouble(productos[6]);
                    
                   int cantidaddisp = Integer.parseInt(productos[7]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    
                    double total = cantidad * precio;
                    

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
               
               if (productos[8].equals(id)) {
                   
                   String nombre = productos[9];
                    double precio = Double.parseDouble(productos[10]);
                    int cantidaddisp = Integer.parseInt(productos[11]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
               
               if (productos[12].equals(id)) {
                   
                   String nombre = productos[13];
                    double precio = Double.parseDouble(productos[14]);
                    int cantidaddisp = Integer.parseInt(productos[15]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
               
               if (productos[16].equals(id)) {
                   
                   String nombre = productos[17];
                    double precio = Double.parseDouble(productos[18]);
                    int cantidaddisp = Integer.parseInt(productos[19]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");    
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
               
               if (productos[20].equals(id)) {
                   
                   String nombre = productos[21];
                    double precio = Double.parseDouble(productos[22]);
                    int cantidaddisp = Integer.parseInt(productos[23]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
               if (productos[24].equals(id)) {
                   
                   String nombre = productos[25];
                    double precio = Double.parseDouble(productos[26]);
                    int cantidaddisp = Integer.parseInt(productos[27]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
               
               if (productos[28].equals(id)) {
                   
                   String nombre = productos[29];
                    double precio = Double.parseDouble(productos[30]);
                    int cantidaddisp = Integer.parseInt(productos[31]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
               
               if (productos[32].equals(id)) {
                   
                   String nombre = productos[33];
                    double precio = Double.parseDouble(productos[34]);
                    int cantidaddisp = Integer.parseInt(productos[35]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
               
               if (productos[36].equals(id)) {
                   
                   String nombre = productos[37];
                    double precio = Double.parseDouble(productos[38]);
                    int cantidaddisp = Integer.parseInt(productos[39]);
                    if(cantidad>cantidaddisp){
                        System.out.println("Lo sentimos, no esta disponible la cantidad solicitada, pero le contamos con : " + cantidaddisp);
                    cantidad = cantidaddisp;
                        double total = cantidad * precio;
                    }
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println("Factura de compra\n" + "Computadoras Diego\n ");
                    pw.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    pw.println(fecha); 

                    System.out.println("Factura de compra\n" + "Computadoras Diego\n ");
                    System.out.println(id + "-" + nombre + "      " + cantidad + "  x   " + "$" + precio + "    =   " + total);
                    encontrado = true;
                    break;
               
                   
               }
            if (!encontrado) {
                System.out.println("El producto no está disponible.");
            }
                }
                
        
            
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
            System.exit(0);

        
        
    }
    
    public static void main(String[] args) {
        
        ///Venta vent = new Venta();
        ///vent.ventas();

    }   
     
}
