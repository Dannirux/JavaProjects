/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import dominio.CruzRoja;
import dominio.Donante;
import dominio.Registro;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danni
 */
public class Archivos {
    private  List<Donante> donantes2;
    private List<Registro>registro2;

    public Archivos() {
        donantes2=new ArrayList<Donante>();
        registro2=new ArrayList<Registro>();
    }
    
    
    
    public void guardarDatos() throws IOException{
          FileOutputStream fout=null;
        try {
            fout = new FileOutputStream("Guardar.doc");
            ObjectOutputStream out= new ObjectOutputStream(fout);
            out.writeObject(CruzRoja.getDonantes());
            out.close();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se ha guardado");
        } finally {
            try {
                fout.close();
            } catch (IOException ex) {
                Logger.getLogger(CruzRoja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
               
    }
    
      public void guardarDatosRe() throws IOException{
          FileOutputStream fout=null;
        try {
            fout = new FileOutputStream("Registro.txt");
            ObjectOutputStream out= new ObjectOutputStream(fout);
            out.writeObject(Donante.getRegistros().toString());
            out.close();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se ha guardado");
        } finally {
            try {
                fout.close();
            } catch (IOException ex) {
                Logger.getLogger(CruzRoja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
               
    }
    
    
    public String leerArchivos() throws FileNotFoundException, IOException, ClassNotFoundException{
         String retorno="";
        try{
        FileInputStream fin=null; 
       
            fin = new FileInputStream("Guardar.doc");
            ObjectInputStream ois = new ObjectInputStream(fin);
            donantes2 = (ArrayList<Donante>)ois.readObject();
            for(Donante k : donantes2){
                retorno+=k.toString();
               System.out.println(donantes2);}
               fin.close();
               
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null,"Error al leer el archivo");
        }     
    
    return retorno;
}
        public String leerArchivosRe() throws FileNotFoundException, IOException, ClassNotFoundException{
         String retorno="";
        try{
        FileInputStream fin=null; 
       
            fin = new FileInputStream("Registro.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            registro2 = (ArrayList<Registro>)ois.readObject();
            for(Registro k : registro2){
                retorno+=k.toString();
               System.out.println(registro2);}
               fin.close();
               
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null,"Error al leer el archivo");
        }     
    
    return retorno;
}
    
    
    
   public String buscarPorNombreArchivo(String nombre) {

String t="";

for (Donante z : donantes2){
     if(nombre.equals(z.getNombre())){
         t=z.toString();
     }
}
return t;
   }   
    
    
    
    
    
}
