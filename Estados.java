/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monjesvscanivales;
import java.util.EmptyStackException;
/**
 *
 * @author Kevin
 */
public class Estados {
    private int MonjesIzquierda;
    private int MonjesDerecha;
    private int CanivalesIzquierda;
    private int CanivalesDerecha;
    private boolean isBote;

    public Estados(int pMonjesIzquierda, int pMonjesDerecha, int pCanivalesIzquierda, int pCanivalesDerecha) {
        this.MonjesIzquierda = pMonjesIzquierda;
        this.MonjesDerecha = pMonjesDerecha;
        this.CanivalesIzquierda = pCanivalesIzquierda;
        this.CanivalesDerecha = pCanivalesDerecha;
        this.isBote = true;
    }

    public Estados() {
    }

    public int getMonjesIzquierda() {
        return MonjesIzquierda;
    }

    public void setMonjesIzquierda(int pMonjesIzquierda) {
        this.MonjesIzquierda = pMonjesIzquierda;
    }

    public int getMonjesDerecha() {
        return MonjesDerecha;
    }

    public void setMonjesDerecha(int pMonjesDerecha) {
        this.MonjesDerecha = pMonjesDerecha;
    }

    public int getCanivalesIzquierda() {
        return CanivalesIzquierda;
    }

    public void setCanivalesIzquierda(int pCanivalesIzquierda) {
        this.CanivalesIzquierda = pCanivalesIzquierda;
    }

    public int getCanivalesDerecha() {
        return CanivalesDerecha;
    }

    public void setCanivalesDerecha(int pCanivalesDerecha) {
        this.CanivalesDerecha = pCanivalesDerecha;
    }

    
    
    public boolean IsValido(int pMongesizquierda,int pMongesderecha,int pCanivalesizquierda,int pCanivalesderecha){
        if ((pMongesizquierda>3 & pMongesizquierda<0)|(pMongesderecha>3 & pMongesderecha<0)|(pCanivalesizquierda>3 & pCanivalesizquierda<0)|(pCanivalesderecha>3 & pCanivalesderecha<0)){
            return false;
        }
        if ((pMongesizquierda<pCanivalesizquierda)|(pMongesderecha<pCanivalesderecha))
            return false;
        return true;
    }
    
   public boolean IsEstado (int pMonje, int pCanival){
       if (isBote){
           int MonjeIzq = this.MonjesIzquierda - pMonje;
           int MonjeDer = this.MonjesDerecha + pMonje;
           int CanibalDer = this.CanivalesDerecha + pCanival;
           int CanivalIzq = this.CanivalesIzquierda - pCanival;
           return IsValido(MonjeIzq,MonjeDer,CanivalIzq,CanibalDer);
       }
       else 
       {
           int MonjeIzq = this.MonjesIzquierda + pMonje;
           int MonjeDer = this.MonjesDerecha - pMonje;
           int CanibalDer = this.CanivalesDerecha - pCanival;
           int CanivalIzq = this.CanivalesIzquierda + pCanival;
           return IsValido(MonjeIzq,MonjeDer,CanivalIzq,CanibalDer);
       }
   }
   
   public void Viaje(int pMonje, int pCanival){
       if (isBote){
           this.MonjesIzquierda -= pMonje;
           this.MonjesDerecha += pMonje;
           this.CanivalesDerecha += pCanival;
           this.CanivalesIzquierda -= pCanival;
           this.isBote = false;
       }
       else 
       {
           this.MonjesIzquierda += pMonje;
           this.MonjesDerecha -= pMonje;
           this.CanivalesDerecha -= pCanival;
           this.CanivalesIzquierda += pCanival;
           this.isBote = true;
       }
   }
   
   public boolean isFinal ()
   {
       if (this.MonjesIzquierda == 0 & this.MonjesDerecha == 3 & this.CanivalesIzquierda == 0 & this.CanivalesDerecha == 3){
       return false;}
       return true;
   }

    @Override
    public String toString() {
        return "Estados{" + "MonjesIzquierda=" + MonjesIzquierda + ", MonjesDerecha=" + MonjesDerecha + ", CanivalesIzquierda=" + CanivalesIzquierda + ", CanivalesDerecha=" + CanivalesDerecha + ", isBote=" + isBote + '}';
    }
   
   
}
