/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

/**
 *
 * @author USER
 */
public class ListQuestion {
    private Node<T> primero;
    private Node<T> ultimo;
    private int tamanio;

    public ListQuestion() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }
    
    public boolean isEmpty() {
        return tamanio == 0;
    }
    
    public int size() {
        return tamanio;
    }
    
    public T get(int index) {
       
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return getFirst(); 
        } else if (index == size() - 1) {
            return getLast(); 
        } else {
            
            Node<T> buscado = getNode(index);

            return buscado.getElemento();

        }

    }
    
    public T getFirst() {

        if (isEmpty()) {
            return null;
        } else {
            return primero.getElemento();
        }
    }

    public T getLast() {

        if (isEmpty()) {
            return null;
        } else {
            return ultimo.getElemento();
        }
    }
    
    private Node<T> getNode(int index) {

        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return primero; 
        } else if (index == size() - 1) {
            return ultimo; 
        } else {

            Node<T> buscado = primero;
            
            int contador = 0;
            while (contador < index) {
                contador++;
                buscado = buscado.getSiguiente();
            }
            
            return buscado;

        }

    }
    
    public T addLast(T elemento) {

        Node<T> aux;
        
        if (isEmpty()) {
            return addFirst(elemento);
        } else {
            
            aux = new Node<>(elemento, null);

            ultimo.setSiguiente(aux);
            ultimo = aux;

        }
        
        tamanio++;
        return ultimo.getElemento();

    }

    public T addFirst(T elemento) {

        Node<T> aux;
        
        if (isEmpty()) {
            aux = new Node<>(elemento, null);
            primero = aux;
            ultimo = aux;
        } else {
   
            Node<T> primeroActual = primero;
            aux = new Node<>(elemento, primeroActual);
            primero = aux;

        }

        tamanio++;
        return primero.getElemento();

    }

      public T add(T elemento, int index) {

        if (index == 0) {
            return addFirst(elemento); 
        } else if (index == size()) {
            return addLast(elemento); 
        } else if ((index < 0 || index >= size())) {
            return null;
        } else {
            
            Node<T> buscado_anterior = getNode(index - 1);
            
            Node<T> buscado_actual = getNode(index);
            
            Node<T> aux = new Node<>(elemento, buscado_actual);
            
            buscado_anterior.setSiguiente(aux);
            
            tamanio++;
            return getNode(index).getElemento();

        }

    }
      
    public String toString() {

        String contenido = "";

        if (isEmpty()) {
            contenido = "Lista vacia";
        } else {

            Node<T> aux = primero;
            
            while (aux != null) {
                contenido += aux.toString();
                aux = aux.getSiguiente();
            }

        }

        return contenido;

    }

    public boolean exists(T elemento) {

        if (isEmpty()) {
            return false;
        } else {

            Node<T> aux = primero;

            while (aux != null) {
                if (elemento.equals(aux.getElemento())) { 
                    return true; 
                }
                aux = aux.getSiguiente();
            }
            return false;
        }
    }
}
