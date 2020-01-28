/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.sun.awt.AWTUtilities;
import dominio.Sonido;
import dominio.splashRun;
import javax.swing.JProgressBar;

/**
 *
 * @author danni
 */
public class Splash extends javax.swing.JFrame {
 private Sonido  so=new Sonido();
 double i=50,j=1;
 splashRun ru;
    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        this.setLocationRelativeTo(null);
         ru=new splashRun(getCarga());
        carga.setVisible(false);
        ru.start();
        ru=null;
        
       // s.reproducir();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        carga = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 339));
        setUndecorated(true);
        setSize(new java.awt.Dimension(640, 339));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("C A R G A N D O . . .");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 180, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guf1.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 130, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/esponga.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));

        carga.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cargaStateChanged(evt);
            }
        });
        getContentPane().add(carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cargaStateChanged
        // TODO add your handling code here:
        
         
        if(carga.getValue()==i){
            
            jLabel3.setText("B i e n v e n i d o . . .");
               if(j!=101){
               AWTUtilities.setWindowOpacity(this, Float.valueOf((100-j)/100+"f"));
               i++;
               j+=2;

            }
            if(carga.getValue()==i){
                this.dispose();
                
            }
            
        }
        
    }//GEN-LAST:event_cargaStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar carga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    public JProgressBar getCarga() {
        return carga;
    }

    public void setCarga(JProgressBar carga) {
        this.carga = carga;
    }

}
