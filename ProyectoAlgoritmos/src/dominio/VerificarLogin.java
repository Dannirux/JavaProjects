/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import data.Archivos;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author danni
 */
public class VerificarLogin {
    Archivos a;
    String usuarioLeido;
    String passLeido;
    public VerificarLogin() {
        a=new Archivos();
        usuarioLeido="";
        passLeido="";
        
    }

    public Archivos getA() {
        return a;
    }

    public void setA(Archivos a) {
        this.a = a;
    }

    public String getUsuarioLeido() {
        return usuarioLeido;
    }

    public void setUsuarioLeido(String usuarioLeido) {
        this.usuarioLeido = usuarioLeido;
    }

    public String getPassLeido() {
        return passLeido;
    }

    public void setPassLeido(String passLeido) {
        this.passLeido = passLeido;
    }
    
    
    public void checkLogin(int j) throws IOException, FileNotFoundException, ClassNotFoundException{
        
        a.leerArchivos();
            if(j<a.getRecup().size()){
        usuarioLeido=a.getRecup().get(j).getUsuario();
        passLeido=a.getRecup().get(j).getPassword();    
        System.out.println("Usuario numero " +(j+1)+ " leido de archivo: "+usuarioLeido);
        System.out.println("Password numero  " +(j+1)+ " leido de archivo: "+passLeido);
            }
            
    
    }
    
}
