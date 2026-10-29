/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9;

/**
 *
 * @author LMA006-17
 */
public class PilaVector {

    private int[] vector;
    private int tamanio;
    private int tope;

    PilaVector(int tamanio) {

        this.tamanio = tamanio;
        vector = new int[tamanio];
        this.tope = -1;

    }

    public void push(int dato) {

        if (tope == tamanio - 1) {
            System.out.println("pila llena");
            return;

        }

        tope++;
        vector[tope] = dato;
        System.out.println("Dsato apilado " + dato);

    }

    public void mostrar() {

        if (tope == -1) {
            System.out.println("Pila esta vacia");
            return;

        }
        System.out.println("Tope base: ");
        for (int i = tope; i >= 0; i--) {

            System.out.println(vector[i] + " ");
        }

    }
    
    public int pop(){
    
        if(tope == -1){
        System.out.println("Pila esta vacia");
        }
        
        int dato = vector[tope];
        tope --;
        return dato;
    
    }
    
    public static void main(String[] args){
    
    PilaVector pila =new PilaVector(3);
    
    pila.push(10);
    pila.push(20);
    pila.push(40);
    pila.mostrar();
    
    
    
    System.out.println("----------------");
    pila.pop();
    pila.mostrar();
   
    
    }

}
