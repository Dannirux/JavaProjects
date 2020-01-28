/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uce.ejercicios;

import ec.edu.uce.clases.Variables;
import java.util.Scanner;

/**
 *
 * @author danni
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Digite su entero");
        int n=s.nextInt();
             System.out.println("Digite su Double");
        double a=s.nextDouble();
             System.out.println("Digite su Caracter");
     char c = s.next().charAt(0);
        Variables v=new Variables(n,a,c);
        v.operaciones();
    }
}
