/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domnio;

/**
 *
 * @author danni
 */
public class Contactos {
    private int id;
    private String nombres;
    private String correo;

    public Contactos(int id, String nombres, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Contactos{" + "id=" + getId() + ", nombres=" + getNombres() + ", correo=" + getCorreo() + '}';
    }
    
    
    
}
