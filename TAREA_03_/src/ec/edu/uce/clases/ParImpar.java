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
public class ParImpar {
    private int n;

    public ParImpar(int n) {
        this.n = n;
    }
    public void paridad(){
     if(n%2==0){
             System.out.println(n+" es par");
        }else{
            System.out.println(n+" es impar");
        }      
    }
                        
        }
            
   


