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
//import uce.edu.ec.donacionsangre.dominio.CruzRoja;
import datos.Archivos;
import dominio.CruzRoja;
import dominio.Donante;
import dominio.Registro;
import dominio.RegistroDonanteApto;
import dominio.RegistroDonanteNoValido;
import dominio.ReporteRegistro;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.EnumException;

public class TestCruzRoja {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CruzRoja b = new CruzRoja();
        Donante d = new Donante();
        Registro ra=new RegistroDonanteApto("angel", 70, 70, 70);
          Registro rn=new RegistroDonanteNoValido(true, true, true,"Danny", 70, 70, 84);
          
        Archivos a = new Archivos();
        ReporteRegistro rr = new ReporteRegistro();
        //   try {
        System.out.println(b.imprimir());
        b.crear(new Donante("juan", 12, "H", "OP"));

       // d.nuevoRegistro();
        d.nuevaRegistro(ra);
        
       // d.nuevoRegistro("Ceci",55, 50, 81);
       // d.nuevoRegistro(true,true,70,80,80);
       // Donante.getRegistros().add(new RegistroDonanteApto(60, 70, 69));
        b.crear(new Donante("dennis",12,"H", "OP"));
        // d.nuevoRegistro(67, 67, 67);
        //   d.nuevoRegistro(60, 60, 60);
        //  System.out.println(b.listar());
//d.borrarRegistro("angel");
     //   System.out.println(d.listarCuentas());
System.out.println(b.buscarPorNombre("dennis"));
//        for (Registro c : Donante.getRegistros()) {
//            if (c != null) {
//                System.out.println(c.toString());
//
//                rr.ReporteRegistro(c);
//            }
//        }
        // System.out.println(b.listar());
//            for (Registro c : b.getDonantes().get(0)){
//            if (c!= null){
//               System.out.println(c.imprimir());
//                r.reporteCuenta(c);
//            }
//        }

//}catch (IllegalArgumentException ex){
//
//    System.out.println("Esa clase Enumerada no existe");
//}
//b.crear(new Donante());
//b.crear(new Donante("Carlos",12,"sa","Sa"+"\n"));
//      b.crear(new Donante("ceci",12,"sa","Sa"+"\n"));
//b.actualizar(new Donante("ricky",12,"F","O"+"\n"),0);
//b.borrar("juan");
//   b.buscarPorId(3);
/*
b.nuevoDonante("Juan", 5,"masculino","O+\n");
System.out.println("\t"+b.listarDonante());
System.out.println();
Donante v= new Donante ("Juan", 5,"mas","o");
if(b.verificarDuplicado(v)){
System.out.println("Error, el cliente ya existe");
}else {
b.nuevoDonante(v);
}

b.nuevoDonante("Ana   ", 10,"femenino","O-\n");
System.out.println(b.listarDonante());
b.nuevoDonante("Jhoony  ", 69,"masculino","RH\n");
b.nuevoDonante("kuka  ", 23,"femenino","B+\n");

b.nuevoDonante("veru  ", 28,"femenino","B+\n");

         */
//  b.getDonantes(0).nuevaCuenta(new CuentaAhorro());
//b.getDonantes(0).nuevaCuenta(new CuentaCorriente());
//for (Donante c : b.getDonantes(0).getCuentas()){
//  if(c!=null){
//    System.out.println(c.imprimir());
//  r.reporteCuenta(c);
//}
// }
//       b.borrarCliente(4);
//              System.out.println(b.listarClientes());
// try {
//                a.guardarDatos();
//                
//            } catch (IOException ex) {
//                Logger.getLogger(TestCruzRoja.class.getName()).log(Level.SEVERE, null, ex);
//            }
//          
//        
System.out.println(a.leerArchivos());

//
//
    }
}
