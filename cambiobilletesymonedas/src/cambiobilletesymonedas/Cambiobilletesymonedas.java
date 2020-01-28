/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiobilletesymonedas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Cambiobilletesymonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector= new Scanner(System.in);
        double a,b,total;
        System.out.println("Ingrese la cantidad pagada: ");
        a=lector.nextFloat();
        System.out.println("Ingrese el precio del producto: ");
        b=lector.nextFloat();
        vuelto(a,b);
    }
    
    public static void vuelto(double num1, double num2){
       double cambio=1,res,cien=0,cincuenta=0,veinte=0,diez=0,cinco=0,uno=0;
       if(cambio>(num1-num2))
        num2=num2-0.01;
       if((num1>1)&&(num2<1))
           num2=num2-0.01;
       cambio=num1-num2;
       if(num1<num2)
            System.out.println("Valores erroneos");
       else{
        for(int i=1;i<=num1;i++){
           res= cambio/100;
           if(res>=1){
             cien++;
             cambio=cambio-100;
           }
           else{
             res=cambio/50;
             if(res>=1){
               cincuenta++;
               cambio=cambio-50;
             
             } else{
             res=cambio/20;
             if(res>=1){
               veinte++;
               cambio=cambio-20;
           
                }else{
             res=cambio/10;
             if(res>=1){
               diez++;
               cambio=cambio-10;
           
           }else{
             res=cambio/5;
             if(res>=1){
               cinco++;
               cambio=cambio-5;
           
           }else{
             res=cambio/1;
             if(res>=1){
               uno++;
               cambio=cambio-1;
           
           }
        }      
       }
    }
    
}
       }}
           System.out.println("Billetes de cien:"+cien);
           System.out.println("Billetes de cincuenta:"+cincuenta);
           System.out.println("Billetes de veinte:"+veinte);
           System.out.println("Billetes de diez:"+diez);
           System.out.println("Billetes de cinco:"+cinco);
           System.out.println("Billetes de uno:"+uno);
    
       }
    double cincuentacents=0,veinticincocents=0,diezcents=0,cincocents=0,unocent=0;
    for(double j=0.00;j<num1;j=j+0.01){
      res=cambio/0.50;
      if(res>=1){
        cincuentacents++;
        cambio=cambio-0.50;
      }else{
      res=cambio/0.25;
      if(res>=1){
        veinticincocents++;
        cambio=cambio-0.25;
      }else{
       res=cambio/0.10;
      if(res>=1){
        diezcents++;
        cambio=cambio-0.10;
      }else{
          res=cambio/0.05;
      if(res>=1){
        cincocents++;
        cambio=cambio-0.05;
      }else{
            res=cambio/0.01;
      if(res>=1){
        unocent++;
        cambio=cambio-0.01;
      }   
      } 
    }
    }}}
     
           System.out.println("Monedas de cincuenta:"+cincuentacents);
           System.out.println("Monedas de veinticinco:"+veinticincocents);
           System.out.println("Monedas de diez:"+diezcents);
           System.out.println("Monedas de cinco:"+cincocents);
           System.out.println("Monedas de uno:"+unocent);  
    
    
    
    
    }}