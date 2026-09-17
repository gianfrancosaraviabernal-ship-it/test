/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectorventas;

import java.util.Arrays;

/**
 *
 * @author LMA006-17
 */
public class VectorVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ARREGLOS UNIDIMENSIONALES");
        ejemploCrearYRepresentar();

        ejemploAccederYModificar();
        ejemploEliminar();

    }

    public static void ejemploCrearYRepresentar() {

        System.out.println("Ejemplo para crear y representar");

        int[] notas = {15, 11, 12, 13};
        System.out.println("Vector" + Arrays.toString(notas));
        System.out.println("Tamaño" + notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("En el indice" + i + "Se encuentra el valor: " + notas[i]);
        }
    }

    public static void ejemploAccederYModificar() {
        System.out.println("Ejemplo para acceder y modificar");

        int[] notas = {15, 18, 12, 13};

        System.out.println("el elemento en el indice 1 es: " + notas[1]);
        
        notas[1]=20;
        System.out.println("Vector: " + Arrays.toString(notas)); //actualizar
        

    }
    
    public static void ejemploEliminar(){
    
        System.out.println("Ejemplo para eliminar");
        int[] notas = {15,18,12,11};
        int usados = 4;
        System.out.println("se elimina el indice 1");
        
        int indiceEliminar = 1;
        if(indiceEliminar >=0 && indiceEliminar < usados){
        
        for(int i =indiceEliminar ; i < usados -1 ; i++){
            notas[i] =notas [i+1];
            
        }
        
        
        notas[usados -1] =0;
        usados--;
        
        }
        
        
        
    }
    
    public static void ejemploUsados(int[]datos, int usados){
        
    
        for(int i=0; i<usados; i++){
        
            System.out.println(datos[i]);
        }
    
    }
}
