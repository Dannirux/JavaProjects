/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import dominio.Gestores;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
        

/**
 *
 * @author danni
 */
public class Archivos {
    List<Gestores>g;
    List<Gestores>recup;
    public Archivos() {
        g=new ArrayList<>();
        recup=new ArrayList<>();
    }

    public List<Gestores> getRecup() {
        return recup;
    }

    public void setRecup(List<Gestores> recup) {
        this.recup = recup;
    }
    
    
    
     public void insertarGestores(){
         g.add(new Gestores("admin", "1"));
         g.add(new Gestores("admin", "2"));
          g.add(new Gestores("admin", "3"));
           g.add(new Gestores("admin", "4"));
            g.add(new Gestores("admin", "5"));
            // g.add(new Gestores("admin", "6"));
     }
    
     public void guardarDatos() throws IOException{
         insertarGestores();
          FileOutputStream fout=null;
        try {
            fout = new FileOutputStream("Guardar.doc");
            ObjectOutputStream out= new ObjectOutputStream(fout);
            out.writeObject(g);
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
     public void leerArchivos() throws FileNotFoundException, IOException, ClassNotFoundException{
         String retorno="";
        try{
        FileInputStream fin=null; 
       
            fin = new FileInputStream("Guardar.doc");
            ObjectInputStream ois = new ObjectInputStream(fin);
            recup = (ArrayList<Gestores>)ois.readObject();
            for(Gestores k : recup){
                retorno+=k.toString();
               //System.out.println(recup);
            }
               fin.close();
               
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null,"Error al leer el archivo");
        }     
    
   
}
}
