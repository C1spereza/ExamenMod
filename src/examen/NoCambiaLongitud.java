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
public class NoCambiaLongitud {

   private int valor;   


     


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

    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
    public void modificar(int[] vector, int LongitudActual, int posicion, CambiaLongitud cambiaLongitud) {
        int i;
        final int logitud = vector.length;
        visualizar(logitud, vector);
        //Modificamos el array
        if (posicion < logitud) {
            //mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = cambiaLongitud.getVa();
        }
        //Mostramos los elementos del array
        visualizar(logitud, vector);
    }

    public void visualizar(final int logitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < logitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }



}
