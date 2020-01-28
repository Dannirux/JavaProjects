/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivocancion;

//import static archivocancion.Principal.directorio;
import static archivocancion.Principal.nombreArchivoTexto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author fing.labcom
 */
public class ArchivoCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String texto = ""; //Variable para guardar la lectura
        String can = "";
        //String directorio=System.getProperty("user.dir");
        
     
//            directorio=System.getProperty("java.class.path");
//            File dir= new File(directorio);
//            directorio=dir.getParent();

        try {
            //declaramos la variable archivo como un objeto File
            //y le asignamos una ruta donde se creara
            File archivo = new File("ARCHIVO.txt");
            //BufferedReader ayuda a manejar las lecturas de streams
            //FileReader mos ayuda a mirar dentro del archivo
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            //verificamos dentro del archivo hasta finalizarlo
            if (archivo.exists()) {
                while ((texto = br.readLine()) != null) {
                    //Cada linea del archivo al JtextArea
                    System.out.println(texto);
                    System.out.println("Se han encontrado: " + texto.split(",").length + " palabras");
                    System.out.println(" - Palabra 1: " + texto.split(",")[0]);
                    System.out.println(" - Palabra 2: " + texto.split(",")[1]);
                   can+=texto.split(",")[1];
                    System.out.println(can);
                }
            }
            br.close();
        } catch (IOException ioe) {
            System.out.println("Error al abrir el archivo");

        }
//
//         String ArchivoTexto="archivo2.txt";
//      try{
//          File archivo =new File(ArchivoTexto);
//         // if(!archivo.exists()){
//              //BufferedWriter ayuda a manejar los streams
//              //FileWriter nos ayuda a escribir dentro del archivo
//              
//              BufferedWriter bw= new BufferedWriter(new FileWriter(archivo,true));
//              //usamos el metodo .write para escribir la cadena
//              
//              bw.write(can);
//              //Muy importante, siempre cerrar el archivo
//              bw.close();
//            
//              System.out.println("guardado");
//        //  }
//      } catch (IOException e1) {
//          System.out.println("error");
//          
//        }
        
        
    }

}
