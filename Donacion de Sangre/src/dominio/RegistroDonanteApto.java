/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author danni
 */
public class RegistroDonanteApto extends Registro {
private double imc;
    public RegistroDonanteApto(String nombre,double peso, double talla, double presionArterial) {
        super(nombre, peso, talla, presionArterial);

    }
    public RegistroDonanteApto(){
        this("Danny",70,1.70,69);
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    
    public String imc(){
        String t="";
       if(getPeso()>0&&getTalla()>0) {
           imc = getPeso() / (getTalla() * getTalla());
           //System.out.println("SU IMC ES: " + imc);
           t+="SU IMC ES: " + imc+"\n";
           //--------SITUACION IMC POR PERSONA-------
           if (imc > 0 && imc < 18.5) {
             //  System.out.println("BAJO PESO");
               t+="IMC BAJO PESO";
           } else if (imc >= 18.5 && imc <= 24.9) {
               //System.out.println("NORMAL");
               t+="IMC NORMAL";
           } else if (imc >= 25 && imc <= 29.9) {
               //System.out.println("SOBREPESO");
               t+="IMC SOBREPESO";
           } else if (imc < 0) {
               //System.out.println("error");
               t+="Error";
           } else {
               //System.out.println("OBESIDAD");
               t+="IMC Obesidad";
           }
       }else{
           //System.out.println("Ingrese Peso o Talla correctos");
           t+="Ingrese Peso o Talla correctos";
       }
       return t;
    }





}

