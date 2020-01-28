/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uce.clases;

/**
 *
 * @author danni
 */
public class Variables {
    private double a;
    private int n;
    private char  c;
    private double suma ;
    private double resta;

    public Variables(int n, double a, char c) {
        this.a = a;
        this.n = n;
        this.c = c;
    }


    public void operaciones(){
        suma=n+a;
        System.out.println();
        resta=a-n;
        
     //  String cadena = Character.toString(c);
       //int s=Integer.parseInt(cadena);
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+ resta);
       // System.out.println("Su caracter en Entero es "+ s);
        
    }
}
