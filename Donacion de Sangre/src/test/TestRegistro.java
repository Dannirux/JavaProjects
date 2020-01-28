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
import datos.Archivos;
import dominio.Registro;
import dominio.RegistroDonanteApto;
import dominio.RegistroDonanteNoValido;
import java.io.FileNotFoundException;
import java.io.IOException;

import util.Validacion;

public class TestRegistro {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

    Archivos a = new Archivos();
    Registro r = new RegistroDonanteApto("Paty",65, 1.70, 69);
    Registro d = new RegistroDonanteNoValido(true,false,false,"Danny",70, 1.8, 70);
  a.guardarDatosRe();
  a.leerArchivosRe();
      //  System.out.println(r.imc());
       // System.out.println(d);
   // System.out.println(d);
    //((RegistroDonanteNoValido) d).isEnfermedadTrasmisionSexual();
    //((RegistroDonanteNoValido) d).isTatuajes();
    //((RegistroDonanteNoValido) d).isTransfusionDeSangre();
    

    }
}
