/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivocancion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danni
 */
public class repaso {
    public static void main(String[] args) {
        
    }
    public void metodo(){
    
    File a = new  File("danny.txt");
        try {
            BufferedReader br=new BufferedReader(new FileReader(a));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(repaso.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    
}
    
}
