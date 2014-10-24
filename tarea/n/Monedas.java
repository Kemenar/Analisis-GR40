/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea.n;

/**
 *
 * @author Kevin
 */
public class Monedas {
    
    private int[] Monedas = new int[5];
    private int largo;
    
    public Monedas (){
        this.Monedas[0] = 1;
        this.Monedas[1] = 2;
        this.Monedas[2] = 3;
        this.Monedas[3] = 5;
        this.Monedas[4] = 10;
        this.largo = 5; 
    }
    
    public int Cambio (int pValor){
        int[][] Matriz = new int[pValor+1][largo];
        for (int i=0; i<largo; i++){
            Matriz[0][i] = 1;
        }
        int x,y;
        for (int i = 1; i < pValor+1; i++){
         for (int j = 0; j < largo; j++){
            x = (i-Monedas[j] >= 0)? Matriz[i - Monedas[j]][j]: 0;
            y = (j >= 1)? Matriz[i][j-1]: 0;
            Matriz[i][j] = x + y;
        }
    }
    return Matriz[pValor][largo-1];
    }
}
