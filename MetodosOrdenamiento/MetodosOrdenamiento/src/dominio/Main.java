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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Insert in =new Insert();
      Ordenamiento o =new Ordenamiento();

          int m[]=new int[10];
          Ordenamiento.ordenacionMergeSort(m);
          System.out.println(in.imprimirAleatorio(m));
        
     
              
    }
    
}
