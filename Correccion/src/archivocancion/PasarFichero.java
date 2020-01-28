/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivocancion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author danni
 */
public class PasarFichero {

    public static void main(String[] args) {
        String arreglo[] = new String[4];
        try {
            File archivo = new File("arreglo.txt");
                   
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            if (archivo.exists()) {
                for (int i = 0; i < arreglo.length; i++) {
                    String aux = br.readLine();
                    arreglo[i] = aux;
                }
            }
            br.close();
        } catch (IOException e) {

        }
         try {
            File archivo = new File("arreglo1.txt");
             BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
             int i=0;
             while(i<5){
             String t="hola danny"+i+"\n";
             bw.write(t);
             i++;
             }
             bw.close();
        } catch (IOException e) {
             System.out.println("no se escribio");
        }
        
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
