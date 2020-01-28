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
public class ReporteRegistro {
    public void ReporteRegistro(Registro cue){
        double monto;
        if(cue instanceof RegistroDonanteApto){
            RegistroDonanteApto ca = (RegistroDonanteApto)cue;
        
          if(ca.getPresionArterial()>0&&ca.getPresionArterial()<80){
              
            System.out.println("Donante Apto");
              JOptionPane.showMessageDialog(null, "Donante Apto");
//          }else{
//              System.out.println("Venga otro dia");
//                   JOptionPane.showMessageDialog(null, "Venga otro dia");
          }
          
        }else if (cue instanceof RegistroDonanteNoValido){
         RegistroDonanteNoValido cc= (RegistroDonanteNoValido)cue;
             //monto= cc.getSobregiro()+cc.getSaldo();
              if(cc.getPresionArterial()>81){
                    System.out.println("Donante No Valido");
                   JOptionPane.showMessageDialog(null, "Donante No Valido");
          }
          
        }else {
            System.out.println("Donante no valido");}
        System.out.println("Registro :"+"Presion Arterial "+cue.getPresionArterial());
         JOptionPane.showMessageDialog(null, "Registro :"+"Presion Arterial "+cue.getPresionArterial());
       // System.out.println("Registro :"+ "Presion Arterial "+cue.getPresionArterial());
    }
    
}
