/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domnio;

import java.util.ArrayList;

/**
 *
 * @author danni
 */
public class GestorUsuarios {
    private static ArrayList<Usuarios> users;
    private static ArrayList<Usuarios> usersCompleto;

    public GestorUsuarios() {
    }
    
    static{
        users=new ArrayList<>();
        usersCompleto=new ArrayList<>();
    }
    public void addUser(Usuarios u){
        users.add(u);
    }

    public static ArrayList<Usuarios> getUsersCompleto() {
        return usersCompleto;
    }

    public static void setUsersCompleto(ArrayList<Usuarios> usersCompleto) {
        GestorUsuarios.usersCompleto = usersCompleto;
    }
   
    
    
     public void addUserCompleto(Usuarios u){
        usersCompleto.add(u);
    }

    public static ArrayList<Usuarios> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<Usuarios> users) {
        GestorUsuarios.users = users;
    }
    public void imprimir(){
        for (Usuarios user : users) {
            System.out.println(user);
        }
    }
     public void imprimirCompleto(){
        for (Usuarios user : usersCompleto) {
            System.out.println(user.toString());
        }
    }
    
    
}
