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
public class Fibonacci {
    

    public Fibonacci() {
    }
    
    public int FuncionFibonacci (int pVar)
        {
            int[] Resultado = new int[pVar+1];
            Resultado[1] = 1;
            Resultado[2] = 1;
            for (int i = 3; i <= pVar; i++) {
                Resultado[i] = Resultado[i-1] + Resultado[i-2];
            }
        return Resultado[pVar];
        }
    
    
    
}


