/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.utils;

/**
 *
 * @author David
 */
public class ListQuestion<T> {
    private Node<T> first;
    private Node<T> latest;
    private int size;

    public ListQuestion() {
        first = null;
        latest = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public T get(int index) {       
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return getFirst(); 
        } else if (index == size() - 1) {
            return getLast(); 
        } else {            
            Node<T> wanted = getNode(index);

            return wanted.getElement();
        }
    }
    
    public T getFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return first.getElement();
        }
    }

    public T getLast() {
        
        if (isEmpty()) {
            return null;
        } else {
            return latest.getElement();
        }
    }
    
    private Node<T> getNode(int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return first; 
        } else if (index == size() - 1) {
            return latest; 
        } else {
            Node<T> wanted = first;
            
            int counter = 0;
            while (counter < index) {
                counter++;
                wanted = wanted.getNext();
            }            
            return wanted;
        }
    }
    
    public T addLast(T element) {
        Node<T> aux;
        
        if (isEmpty()) {
            return addFirst(element);
        } else {            
            aux = new Node<>(element, null);
            latest.setNext(aux);
            latest = aux;
        }       
        size++;
        return latest.getElement();
    }

    public T addFirst(T element) {
        Node<T> aux;
        
        if (isEmpty()) {
            aux = new Node<>(element, null);
            first = aux;
            latest = aux;
        } else {   
            Node<T> firstCurrent = first;
            aux = new Node<>(element, firstCurrent);
            first = aux;
        }
        size++;
        return first.getElement();
    }

      public T add(T element, int index) {

        if (index == 0) {
            return addFirst(element); 
        } else if (index == size()) {
            return addLast(element); 
        } else if ((index < 0 || index >= size())) {
            return null;
        } else {
            
            Node<T> searchedPrevious = getNode(index - 1);            
            Node<T> searchedCurrent = getNode(index);            
            Node<T> aux = new Node<>(element, searchedCurrent);            
            searchedPrevious.setNext(aux);            
            size++;
            return getNode(index).getElement();

        }

    }
      
    public String toString() {

        String content = "";

        if (isEmpty()) {
            content = "Lista vacia";
        } else {
            Node<T> aux = first;
            
            while (aux != null) {
                content += aux.toString();
                aux = aux.getNext();
            }
        }
        return content;
    }

    public boolean exists(T element) {

        if (isEmpty()) {
            return false;
        } else {
            Node<T> aux = first;

            while (aux != null) {
                if (element.equals(aux.getElement())) { 
                    return true; 
                }
                aux = aux.getNext();
            }
            return false;
        }
    }
    
    public int indexOf(T element) {
        if (isEmpty()) {
            return -1;
        } else {
            Node<T> aux = first;

            int position = 0;
            while (aux != null) {
                if (element.equals(aux.getElement())) { 
                    return position; 
                }
                position++;
                aux = aux.getNext();
            }
            return -1;
        }
    }

    public T removeFirst() {        
        if (isEmpty()) {
            return null;
        } else {            
            T element = first.getElement();
            
            Node<T> aux = first.getNext();
            first = null; 
            first = aux; 

            if (size() == 1) {
                latest = null;
            }
            size--;

            return element;
        }
    }

 
    public T removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            T element = latest.getElement();

            Node<T> aux = getNode(size() - 2);
        
            if (aux == null) {
                latest = null;
 
                if (size() == 2) {
                    latest = first;
                } else {
                    first = null;
                }
            } else {                
                latest = null;
                latest = aux;
                latest.setNext(null);
            }
            size--;

            return element;
        }
    }

  
    public T remove(int index) {
      
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size() - 1) {
            return removeLast();
        } else {
            Node<T> nodoPrevious = getNode(index - 1);

            Node<T> nodoCurrent = getNode(index);

            T element = nodoCurrent.getElement();

            Node<T> nodoNext = nodoCurrent.getNext();

            nodoCurrent = null;

            nodoPrevious.setNext(nodoNext);

            size--;

            return element;
        }
    }

  
    public T modify(T element, int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else {
            Node<T> aux = getNode(index);

            aux.setElement(element);

            return aux.getElement();
        }
    }    
}
