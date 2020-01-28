/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.swing.JOptionPane;

/**
 *
 * @author danni
 */
public class Camion extends javax.swing.JFrame{
    int capacidad;
    int gasolina;

    public Camion() {
        
    }
    
    public void gasolina(int gasolina,int distancia){
        if(3*gasolina<distancia){
            System.out.println("No se completo la ruta sin gasolina");
            JOptionPane.showMessageDialog(this, "No se pudo completar la ruta \nel camion se quedo sin gasolina");
        }else{
            System.out.println("El camion completo exitosamente la ruta");
            JOptionPane.showMessageDialog(this, "El camion completo exitosamente la ruta");
        }
      
    }
    
    
    
}
