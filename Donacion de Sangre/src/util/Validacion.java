/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author danni
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Validacion {
    Scanner sc;
    private String nombre;
    private String edad;
    private String Id;

    public Validacion(){
        this.nombre="";
        this.edad="";
        this.Id="0000000000";
        sc=new Scanner(System.in);
    }

    public void validarNumero(String telefono){

        Pattern num= Pattern.compile("[0-9]");
        Matcher nums= num.matcher(telefono);
                if (nums.find())
            System.out.println("Numero correcto");


    }
    public void validarCedula(String cedula){

        Pattern p= Pattern.compile("^17[^0-9]");
        Matcher m=p.matcher(cedula);

        if( m.find() || cedula.length()!=10)
            System.out.println("cedula incorrecta");

    }
    public void validarContraseña(String contraseña){

        Pattern p= Pattern.compile("[^a-z]");
        Matcher m=p.matcher(contraseña);

        if( m.find() || contraseña.length()!=5)
            System.out.println("contraseña incorrecta");

    }

    //aqui comienza la validacion con equals



    public String validarNombre(String titulo){

        while(this.nombre.equals("")){
            System.out.println(titulo);
            this.nombre=sc.nextLine();
            if (!this.nombre.matches("^[A-Za-z ]*$")) {
                this.nombre="";
            }
        }
        return this.nombre;
    }

    public int validarEdad(int titulo){

        while(this.edad.equals("")){
            System.out.println(titulo);
            this.edad=sc.nextLine();
            if (!this.edad.matches("[0-9][2]"))
                this.edad="";
        }
        return Integer.parseInt(this.edad);
    }

    public boolean validar(String cadena){
        if (cadena.matches("[0-9]*")) {
            return true;
        }else{
            return false;
        }
    }

    public int convertir(String numero){
        // Se reemplazan todos los caracteres que no correspondan a un numero
        // por espacio
        numero=numero.replaceAll("[^0-9]", "[]");

        //si la cadena queda vacia
        if (numero.equals("")) {
            numero="0";
        }
        return Integer.parseInt(numero);
    }
    public double vPeso(double peso){
        if (peso>=50&&peso<250){
            System.out.println("peso correcto");
            return peso;
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese Peso Valido");
        }
        return 50;
    }
  public void vEdad(int edad){
        if (edad>17&&edad<125){
            System.out.println("edad correcto");
            
        }else{
            JOptionPane.showMessageDialog(null, "No Tiene La Edad Necesaria o Edad Invalida");
        }
        
    }
  public double vTalla(double talla){
        if (talla>=1.20&&talla<2){
            System.out.println("talla correcto");
            return talla;
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese una Estatura Valida");
        }
        return 1.20;
}
  public void vpresion(double presion){
      //boolean r=false;
        if (presion>68&&presion<85){
            System.out.println("presion indicada");
           // r=true;
        }else{
            JOptionPane.showMessageDialog(null, "Consulte con su Medico");
           // r=false;
        }
       // return r;
}
  
  
  
}
