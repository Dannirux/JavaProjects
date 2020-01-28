package ec.edu.uce.ejercicios;

import ec.edu.uce.clases.vocales;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danni
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        vocales v=new vocales();
        System.out.println("Escriba su Palabra");
        String palabra=s.next();
        v.encontrarVocales(palabra);
        
    }
}
