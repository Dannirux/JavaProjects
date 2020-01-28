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
public enum TipoDeSangre {


    OP("O RH+"),
    ON("O RH-"),
    AP("A RH+"),
    AN("A RH-"),
    BP("B RH+"),
    BN("B RH-"),
    ABP("AB RH+"),
    ABN("AB RH-");
    private final String tipodesangre;

    private TipoDeSangre(String tipodesangre) {
        this.tipodesangre=tipodesangre;
    }

    public String getTipodesangre() {
        return tipodesangre;
    }




















}
