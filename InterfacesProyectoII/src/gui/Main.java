/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Archivos;
import domnio.Contactos;
import domnio.GestorUsuarios;
import domnio.Usuarios;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author danni
 */
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Contactos> co=new ArrayList<>();
        
       
        GestorUsuarios g=new GestorUsuarios();
        Usuarios user=new Usuarios("d", "d", "d", co);
         co.add(new Contactos(0,"s","cs"));
         co.add(new Contactos(1,"3","3s"));
        g.addUser(user);
        user.setC(co);
       
     //   System.out.println(user.toString()); 
        g.imprimirCompleto();
        
    }
}
