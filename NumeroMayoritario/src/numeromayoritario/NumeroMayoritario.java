/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayoritario;

import java.util.ArrayList;

/**
 *
 * @author vicen
 */
public class NumeroMayoritario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MayoritarioDYV.NoMayoritarioExceptionn {
        // TODO code application logic here

        MayoritarioDYV m = new MayoritarioDYV();
        MayoritarioDYVModificado md = new MayoritarioDYVModificado();
        MayoritarioIterativo i = new MayoritarioIterativo();

   
        ArrayList<Integer> prueba = new ArrayList<>();

        
        prueba.add(1);
        prueba.add(1);
        prueba.add(2);
                      
                      
                      
        
        //PRUEBA ITERATIVA
          
        long startTime = System.nanoTime();
        System.out.println("El número mayoritario es: " + i.calcularMayoritario(prueba));
        long endTime = System.nanoTime() - startTime;
        System.out.println("Tiempo de ejecución Iterativo: " + endTime);
        System.out.println("");
        

        //PRUEBA RECURSIVA
        /*
        long startTime2 = System.nanoTime();
        System.out.println("El número mayoritario es: "+m.calcularMayoritario(prueba));
        long endTime2 = System.nanoTime() - startTime2;
        System.out.println("Tiempo de ejecución Divide y Venceras: "+endTime2);
        System.out.println("");
         */
        
        //PRUEBA RECURSIVA MODIFICADA
        /*
        long startTime3 = System.nanoTime();
        System.out.println("El número mayoritario es: " + md.calcularMayoritario(prueba));
        long endTime3 = System.nanoTime() - startTime3;
        System.out.println("Tiempo de ejecución Iterativo: " + endTime3);
        System.out.println("");
         */
    }

}
