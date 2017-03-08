/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author alumno
 */
public class CambiaLongitud {

   private int va;   


//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void bo (int[] v, int LongitudActual, int p){
        int i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
       final int logitud = v.length;
         for (i=0;i<logitud;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(p<logitud){ 
             System.out.println("Elemento a borrar=" + v[p]);                                       
            for (i = p; i < logitud - 1; i++) {
                v[i] = v[i + 1];
            }
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<logitud;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");         
      }
     

//metodo que inserta un  elemento en la posicion p desplazando a la derecha todos los elementos
public void in (int[] v, int LongitudActual, int p){
    int i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
       final int longitud = v.length;
         for (i=0;i<longitud;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(p<longitud){ 
             System.out.println("Elemento a insertar=" + this.getVa());
            for (i = longitud - 1; i > p; i--) {
                v[i] = v[i - 1];
            }
            v[p] = this.getVa();
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<longitud;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");         
      }

    /**
     * @return the va
     */
    public int getVa() {
        return va;
    }

    /**
     * @param va the va to set
     */
    public void setVa(int va) {
        this.va = va;
    }



}
