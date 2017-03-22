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

   private int valor;   


//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void borrar (int[] vector, int LongitudActual, int posicion){
        int i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
       final int logitud = vector.length;
         for (i=0;i<logitud;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(posicion<logitud){ 
             System.out.println("Elemento a borrar=" + vector[posicion]);                                       
            for (i = posicion; i < logitud - 1; i++) {
                vector[i] = vector[i + 1];
            }
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<logitud;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");         
      }
     

//metodo que inserta un  elemento en la posicion p desplazando a la derecha todos los elementos
public void in (int[] vector, int LongitudActual, int posicion){
    int i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
       final int longitud = vector.length;
         for (i=0;i<longitud;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(posicion<longitud){ 
             System.out.println("Elemento a insertar=" + this.getVa());
            for (i = longitud - 1; i > posicion; i--) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getVa();
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<longitud;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");         
      }

    /**
     * @return the va
     */
    public int getVa() {
        return valor;
    }

    /**
     * @param valor the va to set
     */
    public void setVa(int valor) {
        this.valor = valor;
    }



}
