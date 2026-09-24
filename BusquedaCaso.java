/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author LMA006-17
 */
public class BusquedaCaso {

    static int buscar(int[] vector, int objetivo) {

        int comparaciones = 0;

        for (int i = 0; i < vector.length; i++) {
            comparaciones++;

            if (vector[i] == objetivo) {
                System.out.print("El objetivo " + objetivo + "se encuentra en el indice " + i + " se realizado " + comparaciones);
                return i;
            }
        }
        System.out.print("El objetivo " + objetivo + "se encuentra en el indice -1 se realizado " + comparaciones);
        return -1;

    }

    public static void main(String[] args) {

        int[] vector = {14, 8, 21, 3, 17};

        buscar(vector, 14);
        buscar(vector, 17);

        buscar(vector, 99);

    }

}
