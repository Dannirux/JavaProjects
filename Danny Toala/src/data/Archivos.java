/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

 /**
     *       Prueba de Algoritmos 
     *    Universidad Central del Ecuador
     *            Danny Toala
     *            1723463053
     *            Ingenieria en Sistemas de Información
     *            12 de Noviembre del 2019
     * @param args
     */
public class Archivos {

  private String tex="";
  private String[] array ;

    public String getTex() {
        return tex;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
    
  

    public void Leer() {
        //lee el texto
        tex="";
        array = new String[10];
        try {
            File archivo = new File("bancopalabras.txt");

           BufferedReader br=new BufferedReader(new FileReader(archivo));
             if(archivo.exists()){
               
                     for (int i = 0; i < 10; i++) {
                         tex=br.readLine();
                     array[i] = tex;
        
                 
               }
               
           }

        } catch (IOException e) {
            System.out.println("No se ha podido guardar el archivo");

        }
     
    }

}
