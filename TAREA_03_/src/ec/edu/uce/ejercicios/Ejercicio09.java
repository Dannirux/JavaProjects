/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uce.ejercicios;

import ec.edu.uce.clases.ParImpar;
import java.util.Scanner;

/**
 *
 * @author danni
 */
public class Ejercicio09 {
    public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
         System.out.println("Digite su numero");
         int x=s.nextInt();
         ParImpar p= new ParImpar(x);
         p.paridad();
         
         
    }
}
