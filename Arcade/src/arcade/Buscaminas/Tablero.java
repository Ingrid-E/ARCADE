/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade.Buscaminas;

/**
 *
 * @author fabian_b
 */
public class Tablero {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public char[][] matrizV;
    public char[][] matrizM;
    public int tamaño;

    public Tablero(int tamaño) {
        
        this.tamaño = tamaño;
        this.matrizV = new char[tamaño][tamaño];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                this.matrizV[i][j] = '-';

            }
        }
        
        
        
        
        
        

    }

    public void imprimir() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matrizV[i][j] + " ");
            }
            System.out.println();
        }

    }
      public static void main(String[] args) {
          Tablero partida = new Tablero(5);
          partida.imprimir();
          
          
      }
    
    
    
}
