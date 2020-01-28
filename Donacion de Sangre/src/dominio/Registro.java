/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import dominio.Donante;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author danni
 */

public abstract class Registro implements Serializable {
    String nombre;
    private double peso;
    private double talla;
    private double presionArterial;
private Donante d;




    public Registro (String nombre,double peso,double talla, double presionArterial){
    this.peso=peso;
    d=new Donante();
    //c.getNombre()=nombre;
    this.nombre=nombre;
    this.talla=talla;
    this.presionArterial=presionArterial;
    }
    public Registro(){
        this("Danny",70,1.70,69);

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the talla
     */
    public double getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(double talla) {
        this.talla = talla;
    }

    /**
     * @return the presion Arterial
     */
    public double getPresionArterial() {
        return presionArterial;
    }

    /**
     * @param presionArterial the tipo_sangre to set
     */
    public void setPresionArterial(double presionArterial) {
        this.presionArterial = presionArterial;
    }

    public String toString(){
        String texto="Registro\n ";
        texto+="Nombre\t Peso\t Talla\tPresion Arterial\n";

        texto+= this.getNombre()+"\t" +this.getPeso()+"\t"+"   "+this.talla+"\t"+"    "+this.presionArterial+"\n"+imc();
        return texto;
    }
public abstract String imc();

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registro other = (Registro) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}

