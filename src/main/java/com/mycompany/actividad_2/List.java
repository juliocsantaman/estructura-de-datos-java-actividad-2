/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_2;

/**
 *
 * @author L03514531
 */
public class List {

    Node<String> firstNode;
    Node<String> currentNode;

    /**
     *
     * Constructors
     *
     *
     *
     */
    public List() {
        this.firstNode = null;
    }

    public List(Node firstNode) {
        this.firstNode = firstNode;
    }

    /**
     * *
     * Setters y getters
     *
     * @return
     */
    public Node getFirstNode() {
        return firstNode;
    }

    /**
     *
     * Poner un valor en la posición inicial
     *
     * @param value to insert
     *
     */
    public void insertAtFirstPosition(String value) {

        Node nodeToInsert = new Node(value);

        //nodeToInsert.next = new Node("Otro dato");
        //nodeToInsert.next = null;
        firstNode = nodeToInsert;

    }

    /**
     *
     * Muestra toda la lista
     *
     */
    public void show() {

        //Nodo que recorre la lista
        currentNode = this.firstNode;

        //Mientras que el nodo no haya encontrado el final
        //muestra el valor del nodo actual
        while (currentNode != null) {

            System.out.print(currentNode.data + " ");

            currentNode = currentNode.next;

        }

        System.out.println("");

    }

    /**
     *
     * Poner un valor en la última posición
     *
     * @param value to insert
     *
     */
    public void insertAtLastPosition(String value) {

        Node nodeToInsert = new Node(value);//Nodo a insertar

        //nodeToInsert.next = firstNode;//Nodo que recorre la lista
        currentNode = firstNode;

        if (this.isEmpty()) { //si la lista está vacía

            this.insertAtFirstPosition(value);

            //insertamos en la primer pos
        } else {

            //recorreremos la lista hasta encontrar el último elemento
            while (currentNode.next != null) {

                currentNode = currentNode.next;

            }

            //En nodo último apuntara al nodo a insertar
            currentNode.next = nodeToInsert;

        }

    }

    /**
     *
     * Revisa si la lista está vacía
     *
     * @return
     *
     */
    public boolean isEmpty() {

        //Revisa si el primer nodo está vacío
        return (this.firstNode == null);

    }

    /**
     *
     * Encontrar un nodo con un valor específico
     *
     * @param value
     *
     * @return Nodo con la información
     *
     */
    public Node find(String value) {

        Node result = null; // Nodo a  regresar      

        currentNode = this.firstNode;//Nodo que recorre la lista

        boolean finded = false;

        //Mientras  no hayamos llegado al final
        //y el  resultado aún sea nulo
        while (currentNode != null && !finded) {

            if (currentNode.data.equals(value)) {

                finded = true;

                result = currentNode;

            }

            currentNode = currentNode.next;

        }

        return result;

    }

    /**
     *
     * Borrar un nodo de acuerdo a su posición
     *
     * @param position
     *
     * @throws Exception *
     */
    public void delete(int position) throws Exception {

        currentNode = null;//Nodo que recorre la lista

        if (this.isEmpty()) { //Si la lista está vacía lanza un error.

            throw new Exception("La lista está vacía");

        }

        if (position == 1) { //si la posición es 1 entonces reacomodamos el 

            //primer nodo de la lista
            firstNode = firstNode.next;

            //System.out.println("delete: " + firstNode.next.data);
            // para hacer que sea nulo.
        } else {

            currentNode = firstNode;

            //Nos movemos hasta la posición anterior al nodo a borrar
            position = position - 1;
            for (int i = 1; i < position; i++) {
                System.out.println("Valor de i: " + i);
                System.out.println("Valor de position: " + position);
                if (currentNode.next == null) {

                    throw new Exception("La posición es mayor al tamaño "
                            + "de la lista");

                }

                currentNode = currentNode.next;//avanzamos el nodo

            }

            //Igualaremos el next del nodo anterior al next del nodo a borrar
            currentNode.next = (currentNode.next).next; // para hacer que sea nulo.

        }

    }

    /**
     *
     *
     * Devuelve TRUE o FALSE si encuentra el valor establecido en la lista
     *
     * @param value
     *
     *
     */
    public boolean exist(String value) {
        Node result = null; // Nodo a  buscar      

        currentNode = this.firstNode;//Nodo que recorre la lista

        boolean finded = false;

        //Mientras  no hayamos llegado al final
        //y el  resultado aún sea nulo
        while (currentNode != null && !finded) {

            if (currentNode.data.equals(value)) {

                finded = true;

                result = currentNode;

            }

            currentNode = currentNode.next;

        }

        return finded;
    }

    /**
     *
     *
     * Devuelve el elemento que está en la posición dada.
     *
     * @param position
     *
     *
     */
    public String get(int position) throws Exception {

        if (position > getSize() || position == 0) {
            throw new Exception("La posición no existe en la lista.");
        }

        String value = "";

        currentNode = this.firstNode;//Nodo que recorre la lista

        //Mientras  no hayamos llegado al final
        for (int i = 1; i <= position; i++) {

            if (position == i) {
                value = currentNode.data;
            }

            currentNode = currentNode.next;
        }

        return value;
    }

    /**
     *
     *
     * Devuelve el número de nodos.
     *
     *
     *
     *
     */
    public int getSize() {
        int size = 0;
        currentNode = this.firstNode;//Nodo que recorre la lista

        //Mientras  no hayamos llegado al final
        //y el  resultado aún sea nulo
        while (currentNode != null) {
            size++; // Aumentamos en 1.
            currentNode = currentNode.next;
        }

        return size;
    }
}
