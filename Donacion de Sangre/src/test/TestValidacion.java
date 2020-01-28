/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author danni
 */
import util.Validacion;

public class TestValidacion {
    public static void main (String []args){
    Validacion v =new Validacion();
        v.validarCedula("17233053");
v.validarContraseña("admin");
v.vPeso(0);
v.vTalla(1.20);
v.vpresion(0);
String tatu="no";
  if(tatu=="Si"){
              tatu="true";
              boolean b = Boolean.valueOf(tatu);
              System.out.println(b);
          }else if(tatu=="No"){
              tatu="F";
                 
    
}


    }
}
