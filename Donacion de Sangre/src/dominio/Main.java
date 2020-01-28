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
import gui.MenuBienvenida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
        MenuBienvenida b= new MenuBienvenida();
        
        b.mostrarMensajeN();
       System.out.println("Que desea Realizar");
       int z=x.nextInt();
       b.setMenuN(z);


    }



}
