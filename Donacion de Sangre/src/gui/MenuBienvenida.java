/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author danni
 */
import dominio.CruzRoja;
import dominio.Donante;
import java.io.IOException;
import java.util.InputMismatchException;
import util.EnumException;
import util.Validacion;

import java.util.Scanner;
public class MenuBienvenida {

    private int menu;
    private CruzRoja b;
    private  Scanner n;
    private   Menu m;
    private String op;
    private MenuBienvenida f;
    private Donante v;
    private Validacion l;


    public MenuBienvenida() {
        b=new CruzRoja();
        n=new Scanner(System.in);
        m= new Menu();
        l=new Validacion();

    }


    public void mostrarMensajeN(){
        System.out.println("***Bienvenido al Sistema de la Cruz Roja***");
        System.out.println("1.-Ingresar a Registro");
        System.out.println("2.-Salir del Registro");

    }

    public void setMenuN(int menu){
        this.menu=menu;
        f=new MenuBienvenida();
        System.out.println("Ingrese Usuario ");
        String v=n.next();

        switch (menu){

            case 1:
                if(v.toLowerCase().equals("admin")) {
                    System.out.println("Ingrese Contrasena");
                    String x=n.next();
                    l.validarContraseña(x);
                    if(x.toLowerCase().equals("admin")){
                        setMenuDonante();

                    }else {
                        System.out.println("Usuario o contrasena Incorrecto");
                    }

                }

                break;
            case 2:

                break;

            default:
                System.out.println("Opcion no valida");
                break;


        }
    }
    public void ingresoDonante(){
        do{
            try{

                System.out.println("Ingrese Nombre del Donante");
                String nombre = n.next();
                System.out.println("Ingrese edad del Donante");
                int edad = n.nextInt();
                System.out.println("Ingrese H si es masculino o F si es femenino");
                String sexo = n.next().toUpperCase();
                System.out.println("Ingrese el tipo de sangre O+,O-,A+,A-,B+,B-,AB+,AB-, los signos escribalos con una 'P' o 'N'");
                String sangre = n.next().toUpperCase();
                v=new Donante(nombre,edad,sexo,sangre);
                if(b.verificarDuplicado(v)){
                    System.out.println("Error, el Donante ya existe");
                }else {
                    b.crear(v);
                }


            }catch(Exception e){
                System.out.println("Hubo un error en el ingreso del elemento ");

            }
            System.out.println("Desea ingresar otro elemento <<s/n>>");
            op = n.next();
        }while(op.toUpperCase().equals("S"));

    }
    public void actualizarDonante(){

        try{
            System.out.println("Ingrese posicion del Donante");
            int i = n.nextInt();
            int pos=i-1;
            System.out.println("Ingrese Nombre del Nuevo Donante");
            String nombre = n.next();
            System.out.println("Ingrese edad del Nuevo Donante");
            int edad = n.nextInt();
            System.out.println("Ingrese H si es masculino o F si es femenino del Nuevo Donante");
            String sexo = n.next().toUpperCase();
            System.out.println("Ingrese el tipo de sangre O+,O-,A+,A-,B+,B-,AB+,AB-, los signos escribalos con una 'P' o 'N' del Nuevo Donante");
            String sangre = n.next().toUpperCase();
            v=new Donante(nombre,edad,sexo,sangre);
            if(b.verificarDuplicado(v)){
                System.out.println("Error, el Donante ya existe");
            }else {
                b.actualizar(v,pos);

            }


        }catch(Exception e){
            System.out.println("Hubo un error en el ingreso del elemento ");

        }
    }
public void setMenuDonante(){
        do{
        m.mostrarMensaje();

        System.out.println("Que desea Realizar");
        int c=n.nextInt();
        switch (c){
            case 1:

                ingresoDonante();
                break;
            case 2:
                actualizarDonante();
                break;
            case 3 :
                System.out.println("Ingrese el nombre del Donante que  desea eliminar");
                String g=n.next();
                b.borrar(g);
                break;
            case 4:
              try{ 
                System.out.println("Donante de que posicion desea buscar");
                int i=n.nextInt();
                int t=i-1;
          b.buscarPorId(t);
              }catch(InputMismatchException ex){
                  System.out.println("Ingrese una pocision valida");
                   
              }
          break;
         
            case 5 :

                    b.listar();

                break;
            case 6 :

                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println("Desea realizar otra operacion S o N ");
        op=n.next();
    }while(op.toUpperCase().equals("S"));

}








}
