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


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import test.TestCruzRoja;

public class CruzRoja implements IGestionarCRUD {
    private String nombre;
    private String cargo;
    private static List <Donante> donantes;
    private static int numDonantes;


static{
    donantes=new ArrayList<Donante>();
    numDonantes=0;
}


    public CruzRoja() {
        this.nombre ="Centro Norte" ;
        this.cargo = cargo;

    }
    public static List<Donante> getDonantes() {
        return donantes;
    }

    public static void setDonantes(List<Donante> donantes) {
        CruzRoja.donantes = donantes;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String imprimir(){
        String texto="Cruz Roja\n ";
        texto+= "Sucursal\n";
        texto+= this.getNombre();
        return texto;
    }

    //public Donante[] getDonantes() {
      //  return donantes;
    //}
    public List<Donante> getDonantes(int i ) {
      return donantes;
    }
    //public void setDonantes(Donante[] donantes) {
      //  this.donantes = donantes;
    //}
/*

    public void nuevoDonante(String nombre, int edad,String sexo,String tipo_sangre){
        if (numDonantes == donantes.length) {
            Donante donante_aux[] = donantes;
            donantes = new Donante[donantes.length + 1];
            System.arraycopy(donante_aux, 0, donantes, 0, donantes.length - 1);
        }
        this.donantes[numDonantes]= new Donante(nombre,edad,sexo,tipo_sangre);
        numDonantes++;
    }
    public String listarDonante(){
        String texto="";
        for(int i=0; i< numDonantes; i++){
            texto += "Donante N°"+(i+1)+""+donantes[i].toString();
        }
        return texto + "\n";
    }
*/

/*
    public void actualizar(int pos, String nombre, int edad,String sexo,String tipo_sangre){
//        Cliente caux= getCliente(pos);
//        caux.setNombre(nombre);
//        caux.setEdad(edad);
        this.donantes[pos]= new Donante(nombre, edad,sexo,tipo_sangre);
    }
    public void borrarCliente(int pos){
        Donante donantesaux[]=donantes;
        donantes = new Donante[donantesaux.length-1];
                //cuando se borra el primer elemento
        if(pos == 0){
            System.arraycopy(donantesaux, 1, donantes, 0, donantes.length);
            //cuando se borra el último elemento
        }else if (pos == donantes.length){
            System.arraycopy(donantesaux, 0, donantes, 0, donantes.length);
            //cuando se borra un elemento del medio
        }else if(pos>0 && pos<donantes.length){
            System.arraycopy(donantesaux, 0, donantes, 0, pos);
            System.arraycopy(donantesaux, pos+1, donantes, pos, donantes.length-pos); }
        numDonantes--;
    }*/
    public boolean verificarDuplicado(Donante c){
      
        for(Donante cl : donantes ){
            if(c.equals(cl)){
                return true;
            }
        }
        return false;
    }
   /* public void nuevoDonante(Donante cl){
        if (numDonantes==donantes.length) {
            Donante aux[]= donantes;
            donantes=new Donante[numDonantes+1];
            System.arraycopy(aux,0,donantes, 0, numDonantes);
        }
        donantes[numDonantes]=cl;
        numDonantes++;
    }
*/

    @Override
    public void crear(Donante c1)  {
        
        donantes.add(c1);
    }

    @Override
    public void actualizar(Donante c1, Integer id)throws ArrayIndexOutOfBoundsException {
     try{
         donantes.set(id,c1);
     }catch(Exception exe){
         System.out.println("No existe un cliente en esa posicion");
         JOptionPane.showMessageDialog(null,"No existe un cliente en esa posicion");
     }

    }

    @Override
    public void borrar(String nom) {
        Iterator<Donante>it=donantes.iterator();

        while(it.hasNext()){
            String nomDo=it.next().getNombre();
            if(nomDo.equals(nom)){
                it.remove();
            }
        }

    }

    @Override
    public String buscarPorId(Integer id)throws IndexOutOfBoundsException {
        String s="";
       try{
        s= donantes.get(id).toString();
       // System.out.println(s);
       }catch(IndexOutOfBoundsException ex){
           System.out.println("No Existen Usuarios");
           JOptionPane.showMessageDialog(null,"No Existen Usuarios");
       }
       return s;
    }
    public String buscarPorNombre(String nombre) {
//          Iterator<Donante>it=donantes.iterator();
String t="";
//        while(it.hasNext()){
//            String nomDo=it.next().getNombre();
//            if(nomDo.equals(nombre)){
//              // t=nomDo.toString();
//               t=(it).toString();
//            }
//        }
//return t;
for (Donante c : donantes){
     if(nombre.equals(c.getNombre())){
         t=c.toString();
     }
}

return t;
    }
    
    public String listar(){
        String texto="";
        int i=0;
        for (Donante c : donantes){
try{
    texto+= "Donante N°"+(i+1)+c.toString();
    //System.out.println(texto);
    i++;
}catch(Exception e){
                System.out.println("Registro vacio");
                   JOptionPane.showMessageDialog(null,"Registro vacio");
                
            }

        }
return texto;
    }
    
    


}