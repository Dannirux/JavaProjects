/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author danni
 */
public class Laberinto {
    String stringLab = "00000000000000," + 
                "01111111111110," + 
                "00000000000010," + 
                "01111111111110," + 
                "01111111111110," + 
                "01111111111110," + 
                "00000000003110";
    
    
    
     public char generarLaberinto(){
         String txt="";
         String txt2="";
         char cadena[][]=new char[7][13];
         String lista[]=new String[7];
         
         for (int i = 0; i < lista.length; i++) {
               lista[i] = stringLab.split(",")[i];
               txt+=lista[i]+",";
             
         }
         
         for (int i = 0; i < 7; i++) {
             for (int j = 0; j < 13; j++) {
                 cadena[i][j]=lista[i].charAt(j);
                
             }
             
         }
          for (int i = 0; i < 7; i++) {
             for (int j = 0; j < 13; j++) {
                 txt2+=cadena[i][j]+"";
                 txt2+="\n ";
                
             }
             
         }
          char a=cadena[7][10];
         
         return a;
         
         
         
     }
   
    
    
    
    
}
