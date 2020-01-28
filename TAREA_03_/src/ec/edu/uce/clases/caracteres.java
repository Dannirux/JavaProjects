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
public class caracteres {
    private String palabra1;
    private String palabra2;

    public caracteres() {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }

    public String getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }
    public void compararPalabra(String palabra1,String palabra2){
        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras no son iguales");
        }
    }
    
    
    
    
    
    
}
