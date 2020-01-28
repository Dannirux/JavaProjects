/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivocancion;

/**
 *
 * @author danni
 */
public class AlgoritmoVoraz {
     float beneficio;
    float peso;
    float bxp;
    public AlgoritmoVoraz(float beneficio,float peso){
        this.beneficio=beneficio;
        this.peso=peso;
        this.bxp=(beneficio/peso);
    }

    public float getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(float beneficio) {
        this.beneficio = beneficio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getBxp() {
        return bxp;
    }

    public void setBxp(float bxp) {
        this.bxp = bxp;
    }
    public AlgoritmoVoraz() {
	super();
	this.peso=3;
	this.beneficio=6;
	this.bxp = beneficio / peso;
}

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
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
        final AlgoritmoVoraz other = (AlgoritmoVoraz) obj;
        if (Float.floatToIntBits(this.bxp) != Float.floatToIntBits(other.bxp)) {
            return false;
        }
        return true;
    }

  

    
}
