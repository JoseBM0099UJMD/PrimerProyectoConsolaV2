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
public class Inventario {
    public void inventarioporID() {
        Catalogo catalogo = new Catalogo();
        String[] productos = catalogo.Productos();

        Scanner teclado = new Scanner(System.in);
        String codigo = "";

        try {

            System.out.print("Ingrese el ID del producto ");
            String id = teclado.nextLine();
            

            boolean encontrado = false;
            for (int j = 0; j < productos.length; j++) {
                
               if (productos[0].equals(id)) {
                        
                    
                    String nombre = productos[1];
                    String cantidad = productos[3];
                                        
                    System.out.println("Producto :" + "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[4].equals(id)) {
                        
                    
                    String nombre = productos[5];
                    String cantidad = productos[7];
                                        
                    System.out.println("Producto :" + "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[8].equals(id)) {
                        
                    
                    String nombre = productos[9];
                    String cantidad = productos[11];
                                        
                    System.out.println("Producto :"+ "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[12].equals(id)) {
                        
                    
                    String nombre = productos[13];
                    String cantidad = productos[15];
                                        
                    System.out.println("Producto :"+ "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[16].equals(id)) {
                        
                    
                    String nombre = productos[17];
                    String cantidad = productos[19];
                                        
                    System.out.println("Producto :"+ "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[20].equals(id)) {
                        
                    
                    String nombre = productos[21];
                    String cantidad = productos[23];
                                        
                    System.out.println("Producto :"+ "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[24].equals(id)) {
                        
                    
                    String nombre = productos[25];
                    String cantidad = productos[27];
                                        
                    System.out.println("Producto :"+ "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[28].equals(id)) {
                        
                    
                    String nombre = productos[29];
                    String cantidad = productos[31];
                                        
                    System.out.println("Producto :"+ "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[32].equals(id)) {
                        
                    
                    String nombre = productos[33];
                    String cantidad = productos[35];
                                        
                    System.out.println("Producto :"+ "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
               if (productos[36].equals(id)) {
                        
                    
                    String nombre = productos[37];
                    String cantidad = productos[39];
                                        
                    System.out.println("Producto :"+ "     "+ "Cantidad :");
                    System.out.println(id + nombre + "      "+ cantidad);
                    encontrado = true;
                    break;

                }
               
            }
            if (!encontrado) {
                System.out.println("El producto no encontrado.");
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }
    }

    
    public void InventarioTodos(){
        Catalogo catalogo = new Catalogo();
        catalogo.Catalogo();
    }
    
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.inventarioporID();
        
     
    }

}
