/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Ordenamiento;
import java.util.Random;

/**
 *
 * @author danni
 */
public class testMain {
    public static void main(String[] args) {
        Ordenamiento o=new Ordenamiento();
        int array[]=new int[1000000-1];
       Random aleatorio1 = new Random();
        for(int i=0;i<array.length;i++){
            int aleatorio=3+aleatorio1.nextInt( (100+1) - 3);
         array[i]=aleatorio;
        }
        String t="";
//        for (int j = 0; j < array.length; j++) {
//            t+=array[j];
           /// System.out.println(array[j]);
       // }
       
        // o.imprimir(array);
           
        
        
        
        
        
    }
    
}
