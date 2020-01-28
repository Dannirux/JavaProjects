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
public class Menu {

    private int menu;

    public Menu(){

    }

    public void mostrarMensaje(){
        System.out.println("***Menú principal***");
        System.out.println("1.- Ingresar Donante");
        System.out.println("2.- Actualizar Donante");
        System.out.println("3.- Eliminar Donante");
        System.out.println("4.- Buscar Donante");
        System.out.println("5.- Imprimir Donante");
        System.out.println("6.-Regresar ");
    }
/*
    public void setMenu(int menu){
        this.menu=menu;
        CruzRoja b=new CruzRoja();

        switch (menu){
            case 1:
                System.out.println(b.imprimir());
                b.nuevoDonante("\nJuan   ", 5,"masculino","O+\n");
                b.nuevoDonante("\nAna   ", 10,"femenino","O-\n");
                b.nuevoDonante("\nJhoony  ", 69,"masculino","RH\n");
                b.nuevoDonante("\nkuka  ", 23,"femenino","B+\n");

                b.nuevoDonante("\nveru  ", 28,"femenino","B+\n");

                break;
            case 2:

                break;
            case 3 :
                break;
            case 4:
                break;
            case 5 :
                System.out.println("\t"+b.listarDonante());
                break;
            case 6 :

                break;

            default:
                System.out.println("Opcion no valida");
                break;


        }
    }
    public void ingreso(){
        Scanner s= new Scanner(System.in);
        String op;
        do{
            try{
                System.out.println("Ingrese Nombre del Donante");
                String nombre = s.next();
                System.out.println("Ingrese edad del Donante");
                String edad = s.next();
                System.out.println("Ingrese sexo del Donante");
                String sexo = s.next();
                System.out.println("Ingrese Tipo de sangre del Donante");
                String Donante = s.next();

            }catch(Exception e){
                System.out.println("Hubo un error en el ingreso del elemento ");

            }
            System.out.println("Desea ingresar otro elemento <<s/n>>");
            op = s.next();
        }while(op.toUpperCase().equals("S"));

    */
}
