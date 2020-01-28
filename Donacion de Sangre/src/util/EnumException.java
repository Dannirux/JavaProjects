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
public class EnumException extends Exception {
    private String sexo;

    public EnumException(String sexo) {

        super("A ingresado una opcion Invalida");
        this.sexo=sexo;


    }

    public String getSexo() {
        return sexo;
    }


}
