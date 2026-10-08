/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author LMA006-17
 */
public class BaseLista {

    static class Nodo {

        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;

        }

    }

    static class ListaEnlazada {

        Nodo cabeza;

        void insertFinal(int dato) {

            Nodo nuevo = new Nodo(dato);

            if (cabeza == null) {

                cabeza = nuevo;
                return;

            }

            Nodo actual = cabeza;
            while (actual.siguiente != null) {

                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;

        }

        void mostrar() {

            Nodo actual = cabeza;
            while (actual != null) {

                System.out.println(actual.dato + "");
                actual = actual.siguiente;

            }
        }

        Nodo buscar(int valor) {

            Nodo actual = cabeza;
            while (actual != null) {
                if (actual.dato == valor) {
                    return actual;
                }
                actual = actual.siguiente;

            }
            return null;
        }

        boolean modificar(int valorBuscado, int nuevoValor) {

            Nodo actual = cabeza;
            while (actual != null) {
                if (actual.dato == valorBuscado) {
                    actual.dato = nuevoValor;
                }
                actual = actual.siguiente;

            }
            return false;
        }

        boolean eliminarPrimero() {

            if (cabeza == null) {

                return false;
            }

            cabeza = cabeza.siguiente;
            return true;

        }

        boolean eliminarUltimo() {
            if(cabeza == null){
            return false;
            
            
            }
            if(cabeza.siguiente == null){
            
                cabeza = null;
                
                return true;
            }
            
            Nodo anterior =null;
            Nodo actual = cabeza;
            
            
            while(actual.siguiente !=null){
            
                anterior = actual;
                
                actual = actual.siguiente;
            }
            anterior.siguiente = null;
            return true;
        }

        public static void main(String[] args) {
            ListaEnlazada Lista = new ListaEnlazada();
            Lista.insertFinal(10);
            Lista.insertFinal(20);

            Lista.insertFinal(30);
            Lista.mostrar();

            Nodo encontrado = Lista.buscar(30);
            System.out.println(encontrado != null ? "Encontrado " + encontrado.dato : "No encontrado");
            Nodo ausente = Lista.buscar(90);
            System.out.println(ausente != null ? "Encontrado " + ausente.dato : "No encontrado");

            System.out.println("Modificar de 20 -> 99" + Lista.modificar(20, 99));
            Lista.mostrar();
            
            System.out.println("Eliminar Ultimo nodo" + Lista.eliminarUltimo());
            Lista.mostrar();
            
            System.out.println("Eliminar Primer nodo" + Lista.eliminarPrimero());
            Lista.mostrar();

        }
    }

}
