/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.swing.JProgressBar;

/**
 *
 * @author IsraelCM
 */
public class splashRun extends Thread{
    JProgressBar progreso;
    public splashRun(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            progreso.setValue(i);
            pausa(37);
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
