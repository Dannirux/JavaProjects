/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import dominio.Gestores;
import data.Archivos;
import dominio.VerificarLogin;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author danni
 */
public class testMain {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Archivos a=new Archivos();
        //a.guardarDatos();
        VerificarLogin v=new VerificarLogin();
        v.checkLogin(1);
       
        
    }
}
