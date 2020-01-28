/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domnio.GestorUsuarios;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import domnio.Usuarios;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danni
 */
public class Archivos {

   static ArrayList<Usuarios> g;
    static ArrayList<Usuarios> recup;
     static ArrayList<Usuarios> recupCompleto;
    GestorUsuarios ge;
    Usuarios u;

    public Archivos() {
        
        ge=new GestorUsuarios();
        
    }
    static{
        g = new ArrayList<>();
        recup = new ArrayList<>();
        recupCompleto = new ArrayList<>();
    }

    public ArrayList<Usuarios> getG() {
        return g;
    }

    public void setG(ArrayList<Usuarios> g) {
        this.g = g;
    }

    public ArrayList<Usuarios> getRecup() {
        return recup;
    }

    public void setRecup(ArrayList<Usuarios> recup) {
        this.recup = recup;
    }

  
    public void insertarGestores() {
        
        
    }

    public static ArrayList<Usuarios> getRecupCompleto() {
        return recupCompleto;
    }

    public static void setRecupCompleto(ArrayList<Usuarios> recupCompleto) {
        Archivos.recupCompleto = recupCompleto;
    }

    public void guardarDatos() throws IOException {
      
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("Usuarios.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(GestorUsuarios.getUsers());
            
            out.close();
            // JOptionPane.showMessageDialog(null, "Guardado Exitoso");
            System.out.println("Guardado");
        } catch (FileNotFoundException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha guardado");
            System.out.println("No Guardado");
        } finally {
            try {
                fout.close();
            } catch (IOException ex) {
                System.out.println("error");
            }
        }

    }

    public void leerArchivos() throws FileNotFoundException, IOException, ClassNotFoundException {
        String retorno = "";
        FileInputStream fin = null ;
        try {
           fin = new FileInputStream("Usuarios.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            recup = (ArrayList<Usuarios>) ois.readObject();
            
            for (Usuarios k : recup) {
                //retorno += k;
                
            }
            System.out.println(retorno);
            fin.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }finally{
            fin.close();
        }

    }
      public void guardarGestorCompleto() throws IOException {
        
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("UsuariosCompletos.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(GestorUsuarios.getUsersCompleto());
            
            out.close();
            // JOptionPane.showMessageDialog(null, "Guardado Exitoso");
            System.out.println("Guardado");
        } catch (FileNotFoundException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha guardado");
            System.out.println("No Guardado");
        } finally {
            try {
                fout.close();
            } catch (IOException ex) {
                System.out.println("error");
            }
        }

    }
       public void leerUsuarioCompleto() throws FileNotFoundException, IOException, ClassNotFoundException {
        String retorno = "";
        FileInputStream fin = null ;
        try {
           fin = new FileInputStream("UsuariosCompletos.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            recupCompleto = (ArrayList<Usuarios>) ois.readObject();
            
            for (Usuarios k : recupCompleto) {
                retorno += k;
                
            }
            System.out.println(retorno);
            fin.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }finally{
            fin.close();
        }

    }
      
    
    
}
