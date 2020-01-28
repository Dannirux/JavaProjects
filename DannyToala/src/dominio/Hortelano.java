/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author danni
 */
public class Hortelano {

    Scanner s = new Scanner(System.in);
//metodo para llenar mis beneficios por caducidad

    public void llenarHuertas(double h[][], int num) {

        for (int j = 0; j < num; j++) {
            System.out.println("Beneficio de la Huerta"+(j+1));
            double p = s.nextDouble();
            System.out.println("Caducidad de la Huerta"+(j+1));
            double c = s.nextDouble();
            h[0][j] = c;
            h[1][j] = p;

        }

    }
//metodo paraa ordenar mi huerta

    public void ordenarHuertas(double h[][]) {
        double t = 0;
        
        for (int i = 0; i < h.length; i++) {//ordena la matriz de abajo hacia arriba
            for (int j = 0; j < 2; j++) {
                for (int x = 0; x < h.length; x++) {
                    for (int y = 0; y < 2; y++) {
                        if (h[i][j] > h[x][y]) {
                            t = h[i][j];
                            h[i][j] = h[x][y];
                            h[x][y] = t;
                        }
                    }
                }
            }

        }

    }

    //algoritmo voraz para conseguir el maximo beneficio
    public void optimizacion(double solucion[], double h[][]) {
        System.out.println("Caducidad maxima de las huertas");
        int c = s.nextInt();
        double caducidad = 0;
        int j = 0;
        int i = solucion.length - 1;
// lleno la maleta segun la caducidad total que pueden tener todas las huertas 
        while (caducidad < c || i >= 0) {
//solucion me sirve para saber q  porcentaje voy a coger de la huerta sis que queda pocos dias de caducidad
            System.out.println("Caducidad actual " + caducidad + " Caducidad de la huerta"+(i)+" " + h[0][i] + "\n");
            if ((caducidad + h[0][i]) < c) {
                solucion[i] = 1;
                caducidad += h[0][i];
                System.out.println("Caducidad actual " + caducidad + " porcentaje cogido de la huerta"+(i) +" "+ (solucion[i]*100)  + "\n");

            } else {
                solucion[i] = (c - caducidad) / h[0][i];
                caducidad += ((c - caducidad) / h[0][i]) * h[0][i];
                System.out.println("Caducidad actual " + caducidad + " porcentaje cogido de la huerta"+(i)+" " + (solucion[i]*100) + "\n");

            }

            i--;
        }

    }
    // suma el beneficio total de mis huertas elegidas en mi vector solucion
    public void mostrarSolucion(double aux[], double b[][]) {
        String solucion = " solucion:  ";
        float suma = 0;
        for (int i = 0; i < aux.length; i++) {
            solucion += aux[i] + "-------";
            suma += aux[i] * b[1][i];
        }
       
        System.out.println("solucin"+ "\n total beneficio: " + suma);
    }
    

}
