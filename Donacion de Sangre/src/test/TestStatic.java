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
import dominio.Donante;
import util.EnumException;

public class TestStatic {
    public static void main (String []args){
        System.out.println(Donante.getContador());
        try {
            Donante c=new Donante();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println(Donante.getContador());
        System.out.println();
    }
}
