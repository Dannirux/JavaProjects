/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import data.Archivos;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Universidad Central del Ecuador
 * 
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Archivos a= new Archivos();
        a.insertarGestores();
        a.guardarDatos();
        a.leerArchivos();
    }
    
}