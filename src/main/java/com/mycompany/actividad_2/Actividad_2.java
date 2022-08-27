/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.actividad_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author L03514531
 */
public class Actividad_2 {

    public static void main(String[] args) {
        System.out.println("Actividad 2");
        
        // Creación del nodo.
        Node myNode = new Node("Julio");
        
        // Creación de la lista con el nodo.
        List myList = new List(myNode);
        
        System.out.println("Mi lista - primera vez");
        myList.show();
        
        System.out.println("Agregando nodo en la primera posición con data: Santaman");
        myList.insertAtFirstPosition("Santaman");
        System.out.println("Mi lista - segunda vez");
        myList.show();
       
        Node result = myList.find("Santaman");
        
        System.out.println("Información del nodo encontrado es: " + result.data);
        
        System.out.println("Eliminando el nodo 2 que tiene como data: otro dato");
        try {
            myList.delete(2);
        } catch (Exception ex) {
            System.err.println("Hay una excepción: " + ex.getMessage());
        }
        
        System.out.println("Volviendo a imprimir los nodos:");
        myList.show();
    }
    
    
}
