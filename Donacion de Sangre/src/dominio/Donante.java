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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import util.EnumException;
import util.Genero;
import util.TipoDeSangre;
public class Donante implements Serializable{

    private String nombre;
    private String sexo;
    private int edad;
    private boolean apto_donar;
    private String tipo_sangre;
    private static List<Registro> registros;
    private static int numRegistros;
    private  static int contador;
    private int codigo;
    private Genero gen;
    private TipoDeSangre san;
 static{
     registros = new ArrayList<>();
     numRegistros=0;

 }

    public Donante(String nombre, int edad,String sexo,String tipo_sangre){
        this.nombre=nombre;
        this.edad=edad;
        this.gen=Enum.valueOf(Genero.class,sexo);
       // this.sexo=sexo;
        this.san=Enum.valueOf(TipoDeSangre.class,tipo_sangre);
        this.tipo_sangre=tipo_sangre;
        contador ++;
        this.codigo=contador;
    }
    public Donante(){
        this("sin nombre",18,"F","AP");

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
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the apto_donar
     */
    public boolean isApto_donar() {
        return apto_donar;
    }

    /**
     * @param apto_donar the apto_donar to set
     */
    public void setApto_donar(boolean apto_donar) {
        this.apto_donar = apto_donar;
    }

    /**
     * @return the tipo_sangre
     */
    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public static List<Registro> getRegistros() {
        return registros;
    }

    public static void setRegistros(List<Registro> registros) {
        Donante.registros = registros;
    }

    /**
     * @param tipo_sangre the tipo_sangre to set
     */
    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
   // public Registro[] getRegistros() {
     //   return registros;
    //}

   // public void setRegistros(Registro[] registros) {
     //   this.registros = registros;
    //}
    public int getNumRegistros() {
        return numRegistros;
    }

    public void setNumRegistros(int numRegistros) {
        this.numRegistros = numRegistros;
    }

    public String toString(){
        String texto="\nDonante\n";
        texto+="Codigo\t Nombre\t Edad\tSexo\tTipo de sangre\n";
        texto+= codigo+"\t"+""+this.getNombre()+"\t"+"  "+this.edad+"\t"+gen.getNombre()+"\t"+""+san.getTipodesangre()+"\n";
        return texto;
    }

//    public void nuevoRegistro(String nombre,double peso,double talla, double presionArterial){
//        /*if(numRegistros==registros.length){
//            Registro dontaux[] = registros;
//            registros = new Registro[numRegistros+1];
//            System.arraycopy(dontaux, 0, registros, 0, numRegistros);
//        }
//        registros[numRegistros] = new Registro(peso,talla,presionArterial);
//        numRegistros++;*/
//        registros.add(new RegistroDonanteApto(nombre,peso,talla,presionArterial));
        
   // }
    //metodo polimorfico que recibe argumento polimorfico
    public void nuevaRegistro(Registro cu){
        /*if(numRegistros==registros.length){
            Registro dontaux[] = registros;
            registros = new Registro[numRegistros+1];
            System.arraycopy(dontaux, 0, registros, 0, numRegistros);
        }
        registros[numRegistros] = cu;
        numRegistros++;*/
        registros.add(cu);
    }

    /**
     * esto es Read
     * @return
     */
    public String listarCuentas(){
       /* String texto="";
        for (int i = 0; i < numRegistros; i++) {
            texto += registros[i].toString();
        }
        return texto + "\n";*/
        String texto="";
        int i=0;
        for (Registro c : registros){

            texto+= "Registro N°"+(i+1)+c.toString();
           // System.out.println(texto);
            i++;
            
        }
return texto;
    }
    /**
     * esto es Deletes
     * @param nom
     */
    public void borrarRegistro(String nom){
        /*Registro cuentasaux[]=registros;
        registros = new Registro[cuentasaux.length-1];
        //cuando se borra el primer elemento
        if(pos == 0){
            System.arraycopy(cuentasaux, 1, registros, 0, registros.length);
            //cuando se borra el último elemento
        }else if (pos == registros.length){
            System.arraycopy(cuentasaux, 0, registros, 0, registros.length);
            //cuando se borra un elemento del medio
        }else if(pos>0 && pos<registros.length){
            System.arraycopy(cuentasaux, 0, registros, 0, pos);
            System.arraycopy(cuentasaux, pos+1, registros, pos, registros.length-pos); }
        numRegistros--;*/
        Iterator<Registro> it=registros.iterator();

        while(it.hasNext()){
            String nomDo=it.next().getNombre();
            if(nomDo.equals(nom)){
                it.remove();
            }
        }
    }
    public static int getContador() {
        return contador;
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre);
    }

    public boolean equals(Object obj){
        Donante caux;
        if (obj instanceof Donante) {
            caux=(Donante) obj;
            if (nombre.equals(caux.nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarDuplicado(Registro c){
      
        for(Registro cl : registros ){
            if(c.equals(cl)){
                return true;
            }
        }
        return false;
    }






}

