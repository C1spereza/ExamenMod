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
public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        int []v= new int[5];
        v[0]=2;
        v[1]=4;
        v[2]=6;
        v[3]=8; 
        CambiaLongitud p=new CambiaLongitud();
        NoCambiaLongitud p1=new NoCambiaLongitud();
        p.setVa(10);
        p1.modificar(v, 0, 1, p);
        p.borrar(v, 0, 1);
        p.in(v, 0, 1);
    }
}
