/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String[]  ingles = new String[5];
      String[]  español = new String[5];
        int   opcion; 
        Scanner entrada = new Scanner(System.in); 
       
        do{
            System.out.println(("*Menu*"
                              +"\n Digite 1 para ingresar palabras al Diccionario"
                              +"\n Digite 2 para traducir de español a Ingles"
                              +"\n Digite 3 para mostrar las palabras ingresadas"
                              +"\n Digite 4 para salir"));
            opcion= entrada.nextInt();
            System.out.println(" " );
            System.out.println("_______________________________________________________");
            System.out.println(" " );
             switch(opcion){
                 
                 case 1: 
                    System.out.println("Digite palabras en español: ");
                    for (int i=0; i<5;i++){
                        español[i] = entrada.nextLine();
                     }
                      System.out.println("________________________________________________________________________");
                                        
                    break;
                 case 2:    
                      for(int e=0; e<5;e++){
                      System.out.println("Digite en ingles la palabra " + español[e]);
                      ingles[e] = entrada.nextLine();
                        }
                     System.out.println("_______________________________________________________");
                     System.out.println(" " );
                     break;
                 case 3: 
                    
                     System.out.println("Las palabras ingresadas son las siguientes");
                      System.out.println("_______________________________________________________");
                      System.out.println(Arrays.toString(español));
                      System.out.println(Arrays.toString(ingles));
                     
                     
                     
                     
                     break;
                                 
                 case 4: 
                     System.out.println("Saliendo...............");
                     break;

             }             
        }while(opcion != 4);
    }
    }
    
