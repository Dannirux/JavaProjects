/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domnio;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author danni
 */
public class Usuarios implements Serializable{
    private String correo;
   // private String contrasena;
    private String password;
    private String nombre;
    private ImageIcon imagen;
    private static ArrayList<Contactos>c;
    static {
        c=new ArrayList<>();
    }

    
    public Usuarios(String nombre, String correo, String password, ArrayList<Contactos> contacto){
        Usuarios.c=contacto;
        this.correo = correo;
        this.password = password;
        this.nombre = nombre;
        this.imagen = imagen;
                                                 
               
    }
    public Usuarios(String nombre, String correo, String password){
        
        this.correo = correo;
        this.password = password;
        this.nombre = nombre;                                              
    }

    public static ArrayList<Contactos> getC() {
        return c;
    }

    public static void setC(ArrayList<Contactos> c) {
        Usuarios.c = c;
    }
        

  
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void unirContactos(){
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    public String imprimirContactos(ArrayList<Contactos> a){
        String cont="";
        for (Contactos contactos : a) {
            cont+=contactos;
        }
        return cont;
    }
    public void imprimir(){
        for (Contactos cont : c) {
            System.out.println(cont.toString());
        }
    }

    @Override
     public String toString(){
        String texto="\nUsuario\n";
        texto+="Nombre\t Correo\t Password\tContactos\n";
        texto+= nombre+"\t"+""+correo+"\t"+"  "+password+""+imprimirContactos(c)+"\n";
        return texto;
    }
  
    
    
    
}
