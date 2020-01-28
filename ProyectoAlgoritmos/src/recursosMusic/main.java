/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursosMusic;

import java.applet.AudioClip;
import javax.sound.sampled.Clip;


/**
 *
 * @author danni
 */
public class main {
    public static void main(String[] args) {
        //Sonido s=new Sonido();
       Clip sound = Sonido.sonido("recursosMusic/sos.wav");
       Sonido.playSound(sound);
    }
            
}
