/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author danni
 */
public class Sonido {
    public void reproducir(){
         try {
         Clip sonido = AudioSystem.getClip();
         File a = new File("src\\recursos\\cut1.wav");
         sonido.open(AudioSystem.getAudioInputStream(a));
         sonido.start();
         System.out.println("Reproduciendo 10s. de sonido...");
        Thread.sleep(19000); // 10000 milisegundos (10 segundos)
        sonido.close();
      } catch (Exception tipoError) {
         System.out.println("" + tipoError);
      }
    }
}
