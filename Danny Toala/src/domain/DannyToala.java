/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import data.Archivos;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author danni
 */
public class DannyToala {

    /**
     *       Prueba de Algoritmos 
     *    Universidad Central del Ecuador
     *            Danny Toala
     *            1723463053
     *            Ingenieria en Sistemas de Información
     *            12 de Noviembre del 2019
     * @param args
     */
    public static void main(String[] args) {
        //eneunciado del ejercicio
        Archivos a=new Archivos();
        Scanner s=new Scanner(System.in);
      
        System.out.println("La Universidad Central del Ecuador te saluda ");
        System.out.println("Ingresa tu Nombre");
        String nom=s.next();
       Juego j=new Juego(nom);
        System.out.println("Hola :" +nom);
        j.start();
       
        
    }
    
}
