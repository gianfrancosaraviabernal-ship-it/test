/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasosemana8;

/**
 *
 * @author LMA006-17
 */
public class ListaSimpleRepaso {

    static class Nodo {

        int dato;
        Nodo siguiente;

        Nodo(int dato) {

            this.dato = dato;
            this.siguiente = null;

        }
    }

    static class ListaSimple {

        Nodo primero;

        void agregarFinal(int dato) {

            Nodo nuevo = new Nodo(dato);
            if (primero == null) {

                primero = nuevo;
                return;
            }

            Nodo actual = primero;
            while (actual.siguiente != null) {

                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }

        String recorrer() {
            if (primero == null) {

                return "vacio";

            }

            StringBuilder texto = new StringBuilder();
            Nodo actual = primero;
            while (actual.siguiente != null) {
                if (texto.length() > 0) {

                    texto.append(" --> ");
                }
                texto.append(actual.dato);
                actual = actual.siguiente;

            }
            return texto.toString();

        }

        boolean buscar(int dato) {
            Nodo actual = primero;
            while (actual != null) {

                if (actual.dato == dato) {

                    return true;

                }
                actual = actual.siguiente;

            }
            return false;

        }
    }

    public static void main(String[] args) {

        ListaSimple lista = new ListaSimple();

        lista.agregarFinal(10);
        lista.agregarFinal(20);
        lista.agregarFinal(30);
        System.out.println("Recorrer en: " + lista.recorrer());
        System.out.println("existe? " + lista.buscar(10));

    }

}
