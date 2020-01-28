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

public class RegistroDonanteNoValido extends Registro {
private boolean enfermedadTrasmisionSexual;
private boolean tatuajes;
private boolean transfusionDeSangre;
    private double imc;
   
    public RegistroDonanteNoValido(boolean enfermedadTrasmisionSexual,boolean tatuajes,boolean transfusionDeSangre,String nombre,double peso, double talla, double presionArterial) {
       this.enfermedadTrasmisionSexual=enfermedadTrasmisionSexual;
       this.tatuajes=tatuajes;
       this.transfusionDeSangre=transfusionDeSangre;
       this.nombre=nombre;
    }
     public RegistroDonanteNoValido() {
        this(true, true, true,"Danny", 70, 1.70, 69);

    }

    public void setEnfermedadTrasmisionSexual(boolean enfermedadTrasmisionSexual) {
        this.enfermedadTrasmisionSexual = enfermedadTrasmisionSexual;
    }

    public void setTatuajes(boolean tatuajes) {
        this.tatuajes = tatuajes;
    }

    public void setTransfusionDeSangre(boolean transfusionDeSangre) {
        this.transfusionDeSangre = transfusionDeSangre;
    }



    public boolean isEnfermedadTrasmisionSexual() {
        enfermedadTrasmisionSexual=true;
        return enfermedadTrasmisionSexual;
    }

    public boolean isTatuajes() {
        return true;
    }
    public boolean isTransfusionDeSangre(){
        return true;
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
    public String toString(){
        String texto="Registro Donante no Apto\n ";
        texto+="Enfermadad Sexual\t Tatuaje Reciente\t Transfusion de sangre\n";

        texto+="             "+this.enfermedadTrasmisionSexual+"          "+"\t"+"   "+this.tatuajes+"        "+"\t"+"                  "+this.transfusionDeSangre+"\t"+"\n"+imc();
        return texto;
    }
}
