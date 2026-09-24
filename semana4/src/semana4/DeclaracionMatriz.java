/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

/**
 *
 * @author LMA006-17
 */
public class DeclaracionMatriz {
    
    public static void main(String[] args) {
        
        boolean[][] numerosEnteros = new boolean[2][3];
        
        System.out.println("Filas: " + numerosEnteros.length);
        System.out.println("Columnas: " + numerosEnteros[0].length);
        
        System.out.println("Contenido inicial");
        
        for (int fila = 0; fila < numerosEnteros.length; fila++) {
            for (int columna = 0;
                    columna < numerosEnteros[fila].length; columna++) {
                System.out.print(numerosEnteros[fila][columna] + "");
                
            }
            
        }
        
    }
    
}
