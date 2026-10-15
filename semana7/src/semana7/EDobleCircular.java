/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author LMA006-17
 */
public class EDobleCircular {

    static class NodoDoble {

        int dato;
        NodoDoble anterior;
        NodoDoble siguiente;

        NodoDoble(int dato) {

            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    static class ListaDoble {

        NodoDoble inicio, ultimo;

        void insertarFinal(int dato) {

            NodoDoble nuevo = new NodoDoble(dato);

            if (inicio == null) {

                inicio = ultimo = nuevo;
                return;
            }

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }

        void mostrarDelante() {

            NodoDoble actual = inicio;
            while (actual != null) {

                System.out.println(actual.dato + "");
                actual = actual.siguiente;

            }

        }
        
        void mostrarAtras(){
        
        NodoDoble actual = ultimo;
        while(actual !=null){
        System.out.println(actual.dato + " ");
        actual = actual.anterior;
        
        }
        }
        
        boolean eliminar(int dato){
        NodoDoble actual = inicio;
        while(actual !=null && actual.dato !=dato){
            
            
        actual = actual.siguiente;
        
        }
        
        if(actual == null)return false;
        
        if(actual.anterior==null) inicio = actual.siguiente;
        else actual.anterior.siguiente= actual.siguiente;
        
        if(actual.siguiente==null)ultimo = actual.anterior;
        else actual.siguiente.anterior = actual.anterior;
        return true;
        
        }

    }

    public static void main(String[] args) {

        ListaDoble lista = new ListaDoble();
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        
        lista.mostrarDelante();
        
        System.out.println("--------");
        lista.mostrarAtras();
        
        
       System.out.println("--------");
       lista.eliminar(20);
       lista.mostrarDelante();
    }
}
