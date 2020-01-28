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
public enum Genero {

    H("H","Maculino"),
    F("M","Femenino");

    private final String abrev;
    private final String nombre;

    private Genero(String abrev, String nombre){
        this.abrev=abrev;
        this.nombre=nombre;

    }

    public String getAbrev(){
        return abrev;
    }
    public String getNombre(){
        return nombre;
    }

}
