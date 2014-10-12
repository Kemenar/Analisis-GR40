/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monjesvscanivales;

import java.util.ArrayList;


/**
 *
 * @author Kevin
 */
public class MonjesvsCanivales {


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Estados inicio = new Estados (3,0,3,0);
        ArrayList<Integer> ViajesenBote = new ArrayList<Integer>();
        // esta lista se hace para evitar los casos individualmente con if
        ViajesenBote.add(1);
        ViajesenBote.add(0);
        ViajesenBote.add(0);
        ViajesenBote.add(1);
        ViajesenBote.add(1);
        ViajesenBote.add(1);
        ViajesenBote.add(2);
        ViajesenBote.add(0);
        ViajesenBote.add(0);
        ViajesenBote.add(2);
        ArrayList<Integer> ViajesTemp = ViajesenBote;
        ArrayList<Estados> Respuesta = new ArrayList<Estados>();
        ArrayList<Integer> BackTraking = new ArrayList<Integer>();
        int i = 0;
        while (inicio.isFinal() & i!=10){
            while (i!=10){
                int Monje = ViajesTemp.remove(i);
                int canibal = ViajesTemp.remove(i+1);
                Estados temp = inicio;
                if (temp.IsEstado(Monje, canibal)){
                    temp.Viaje(Monje, canibal);
                    if (IsElemento (temp, Respuesta)){
                        Respuesta.add(inicio);
                        BackTraking.add(Monje);
                        BackTraking.add(canibal);
                        inicio = temp;
                        ViajesTemp =  ViajesenBote;
                    }
                }
                else{
                    i = i + 2;
                }
            }
            if (i==10 & Respuesta.size() == 0){
                inicio = Respuesta.remove(Respuesta.size());
               ViajesTemp.add(BackTraking.get(BackTraking.size()-1));
               ViajesTemp.add(BackTraking.get(BackTraking.size()));
            }
        }
        if (inicio.isFinal()){
            for (int j=0; j<=Respuesta.size();j++){
                System.out.println(Respuesta.get(j).toString());
            }
        }
        else
        {
            System.out.println("Hice lo que pude");
        }
    }
    
     private static boolean IsElemento (Estados pEstado, ArrayList<Estados> pTemp){
        for (int i = 0; i>=pTemp.size(); i++){
            if (pTemp.get(i) == pEstado){
                return true;
            }
        }
        return false;
    }

}
