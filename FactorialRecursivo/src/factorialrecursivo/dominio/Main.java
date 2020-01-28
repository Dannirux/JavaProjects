/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrecursivo.dominio;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author danni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime,endTime,time;
        
        Scanner s=new Scanner(System.in);
        BigInteger numero;
        long n;
        System.out.println("Escriba el factorial deseado");
        numero=s.nextBigInteger();
        startTime=System.currentTimeMillis();
        System.out.println("Su Factorial es: "+ Factorial.factorialBigInteger(numero));
        endTime=System.currentTimeMillis();
        time=endTime-startTime;
        System.out.println("tiempo metodo BigInteger: "+time);
        System.out.println("Escriba el factorial deseado");
        n=s.nextInt();
         //startTime=System.currentTimeMillis();
        System.out.println("Su Factorial es: "+ Factorial.factorialInt(n));
        //endTime=System.currentTimeMillis();
       // time=endTime-startTime;
        //System.out.println("tiempo metodo BigInteger: "+time);
        
    }
    
    
}
