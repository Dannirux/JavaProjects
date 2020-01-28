/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import data.Archivos;
import java.util.Random;
import java.util.Scanner;


 /**
     *       Prueba de Algoritmos 
     *    Universidad Central del Ecuador
     *            Danny Toala
     *            1723463053
     *            Ingenieria en Sistemas de Información
     *            12 de Noviembre del 2019
     * @param args
     */
public class Juego {

    String player;
    Archivos a;
    Scanner x;
    int contador = 0;
    

    public Juego(String player) {
        this.player = player;
        x = new Scanner(System.in);
        a = new Archivos();
    }

    public void start() {

        System.out.println("Bienvenido al juego del Ahorcado");
        System.out.println("La pista seran palabras que formen parte de la boca humana");
        System.out.println("Comencemos");
         a.Leer();
        final int n=(int) (Math.random()*10);
        String w= a.getArray()[n];
        System.out.println(w);
        
        do {
                if (w.equals(x.next())) {
                System.out.println();
                System.out.println("Correcto");

            } else {
                contador++;
                if (contador == 1) {
                    System.out.println("Intente de nuevo");
                    System.out.println("Se ha dibujado sus piernas");
                }
                 if (contador == 2) {
                    System.out.println("Intente de nuevo");
                    System.out.println("Se ha dibujado su cuerpo");
                }
                  if (contador == 3) {
                    System.out.println("Intente de nuevo");
                    System.out.println("Se ha dibujado sus brazos");
                }

                  if (contador == 4) {
                    System.out.println("Intente de nuevo");
                    System.out.println("Se ha dibujado su cabeza");
                    break;
                }



            }
        }while (contador!=4);
        System.out.println("Gracias por jugar");
    }

   

}
