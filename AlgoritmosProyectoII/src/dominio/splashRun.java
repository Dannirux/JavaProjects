/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JProgressBar;

/**
 *
 * @author IsraelCM
 */
public class splashRun extends Thread{
    JProgressBar progreso;
    Sonido s=new Sonido();
    public splashRun(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    @Override
    public void run(){
        s.reproducir();
        for(int i=1;i<=100;i++){
            progreso.setValue(i);
            
            pausa(25);
            
        }
        
    }
    public void pausa(int mlSeg){
        try{
               
            Thread.sleep(mlSeg);
          
        }
        catch(Exception e){
            
        }
    }
}
