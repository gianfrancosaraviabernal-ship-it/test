/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9;

/**
 *
 * @author LMA006-17
 */
public class ListaPush {

    static class Nodo {

        int dato;
        Nodo siguiente;

        Nodo(int dato) {

            this.dato = dato;
            this.siguiente = null;

        }

    }

    static class PilaLista {

        private Nodo tope;

        public PilaLista() {

            tope = null;
        }

        public void push(int dato) {

            Nodo nuevo = new Nodo(dato);

            nuevo.siguiente = tope;
            tope = nuevo;
            System.out.println("Nodo apilado " + dato);

        }

        public void mostrar() {
            Nodo actual = tope;
            System.out.println("Tope base:");

            while (actual != null) {
                System.out.println(actual.dato + " ");
                actual = actual.siguiente;
            }

        }

    }
    
    public static void main (String[] args){
    
        PilaLista pila = new PilaLista();
        
        pila.push(20);
        pila.push(40);
        pila.push(60);
        pila.mostrar();
    
    
    
    
    
    
    
    
    }
}
