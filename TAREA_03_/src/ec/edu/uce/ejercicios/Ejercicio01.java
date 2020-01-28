/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uce.ejercicios;

import ec.edu.uce.clases.caracteres;
import java.util.Scanner;

/**
 *
 * @author danni
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        caracteres c = new caracteres();
         Scanner s =new Scanner(System.in);
         System.out.println("Escriba su Primer Palabra");
        String palabra1=s.next();
        System.out.println("Escriba su Segunda Palabra");
        String palabra2=s.next();
        c.compararPalabra(palabra1, palabra2);
        
    }
    
}
