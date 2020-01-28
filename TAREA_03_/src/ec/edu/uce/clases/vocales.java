/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uce.clases;

/**
 *
 * @author danni
 */
public class vocales {
    private String vocales;
    private String palabra;

    public vocales() {
      
    }

    public String getVocales() {
        return vocales;
    }

    public void setVocales(String vocales) {
        this.vocales = vocales;
    }
    
    public void encontrarVocales(String palabra){
       int  contador=0;
       for(int x=0;x<palabra.length();x++) {
  if ((palabra.charAt(x)=='a') || (palabra.charAt(x)=='e') || (palabra.charAt(x)=='i') || (palabra.charAt(x)=='o') || (palabra.charAt(x)=='u')){
    contador++;
  }
} 
            
     System.out.println("La palabra " + palabra + "contiene " + contador + " vocales");       
        
    }    
    
}
