/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;

/**
 *
 * @author danni
 */
public class Validacion {
    public boolean numero(String s){
        boolean t=false;
        try{
        int n=Integer.parseInt(s);
        t=true;
        }catch(Exception n){
            t=false;
        }
        return t;
    }
    
}
