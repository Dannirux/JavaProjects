/*
Universidad Central del Ecuador
Ingenieria en Sistemas de Informacion
Algoritmos
Danny Alexander Toala Orellana
1723463053
14/01/2020
Prueba Segundo Hemisemestre
*/
package dominio;

import java.util.Scanner;

/**
 *
 * @author danni
 */
public class Main {
    //Algoritmo del Hortelano para conseguir el maximo beneficio caducidad de nuestras huertas
    public static void main(String[] args) {
        //creo mi clase
        Hortelano hor=new Hortelano();
        Scanner  s=new Scanner(System.in);
        System.out.println("Cuantas huertas desea");
        int hue=s.nextInt();
        double solucion[]=new double[hue];
        
        double h[][]=new double[2][hue];
        //lleno caducidad y beneficio de mi huerta
        hor.llenarHuertas(h,hue);
        //le aplico el algoritmo voraz
        //la huerta debe estar ordenada por caducidad beneficio
        hor.optimizacion(solucion, h);
        //Arrojo la solucion
      hor.mostrarSolucion(solucion, h);
    }
}
