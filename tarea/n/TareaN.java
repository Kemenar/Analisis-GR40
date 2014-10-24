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
public class TareaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fibonacci Test1 = new Fibonacci();
        System.out.println("La respuesta a la Sucecion de 7 es: " + Test1.FuncionFibonacci(7));
        System.out.println("La respuesta a la Sucecion de 8 es: " + Test1.FuncionFibonacci(8));
        System.out.println("La respuesta a la Sucecion de 25 es: " + Test1.FuncionFibonacci(25));
        System.out.println("La respuesta a la Sucecion de 43 es: " + Test1.FuncionFibonacci(43));
        
        Monedas Test2 = new Monedas();
        System.out.println("La cantidad de cambion de moneda es: " + Test2.Cambio(5));
        System.out.println("La cantidad de cambion de moneda es: " + Test2.Cambio(1));
        System.out.println("La cantidad de cambion de moneda es: " + Test2.Cambio(2));
        System.out.println("La cantidad de cambion de moneda es: " + Test2.Cambio(3));
    }
    
}
