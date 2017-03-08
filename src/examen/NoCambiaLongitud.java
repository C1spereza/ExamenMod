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

   private int va;   


     


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

    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
    public void mo(int[] v, int LongitudActual, int p, CambiaLongitud cambiaLongitud) {
        int i;
        final int logitud = v.length;
        visualizar(logitud, v);
        //Modificamos el array
        if (p < logitud) {
            //mostramos su contenido
            System.out.println("Elemento a modificar=" + v[p]);
            v[p] = cambiaLongitud.getVa();
        }
        //Mostramos los elementos del array
        visualizar( logitud, v);
    }

    public void visualizar(final int logitud, int[] v) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < logitud; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }



}
