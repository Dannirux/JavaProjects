/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uce.clases;

import java.util.Scanner;

/**
 *
 * @author danni
 */
public class menu {
    private Scanner n;
    private int m;

    public menu() {
        n=new Scanner(System.in);
        this.m=m;
    }
    
    
    public void menu(){
        System.out.println("Bienvenido a su Menu");
        System.out.println("Opcion 1");
        System.out.println("Opcion 2");
        System.out.println("Opcion 3");
        System.out.println("Digite su opcion");
       m=n.nextInt();
    }
      public void menu1(){
      switch(m){
        case 1:
        System.out.println("Esta es su opcion 1");
        break;
        case 2:
        System.out.println("Esta es su opcion 2");
        break;
       
        case 3:
        System.out.println("Esta es su opcion 3");
        break;
      }
    }
    
    
    
    
}
