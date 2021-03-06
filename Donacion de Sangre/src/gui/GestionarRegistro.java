/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.Archivos;
import dominio.Donante;
import dominio.Registro;
import dominio.RegistroDonanteApto;
import dominio.RegistroDonanteNoValido;
import dominio.ReporteRegistro;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import util.Validacion;


/**
 *
 * @author danni
 */
public class GestionarRegistro extends javax.swing.JFrame {

    private Registro r;
    private ReporteRegistro rr;
    private Donante d;
    private Validacion v;
    private boolean b;
    private boolean t;
    private boolean e;
    private Archivos a;
    /**
     * Creates new form GestionarRegistro
     */
    public GestionarRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
        d = new Donante();
        v = new Validacion();
        a=new Archivos();
        
        //  r=new RegistroDonanteApto();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpeso = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jtalla = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jpresion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jnombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        enfer = new javax.swing.JComboBox<>();
        tatuajes = new javax.swing.JComboBox<>();
        transfusi = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jbutonguardar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ecuato.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, -1, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Multiply_32px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel6.setText("Nuevo Registro");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cruz 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -20, 1220, 300));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setText("Talla");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setText("Peso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setText("Presion Arterial");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setText("Tatuajes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel9.setText("Transfusion de Sangre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel10.setText("Enfermedad Trasmision Sexual");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jpeso.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jpeso.setBorder(null);
        jpeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpesoMouseExited(evt);
            }
        });
        jpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpesoActionPerformed(evt);
            }
        });
        jPanel1.add(jpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 190, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 210, 10));

        jtalla.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jtalla.setBorder(null);
        jtalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtallaActionPerformed(evt);
            }
        });
        jPanel1.add(jtalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, 10));

        jpresion.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jpresion.setBorder(null);
        jpresion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpresionMouseExited(evt);
            }
        });
        jpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpresionActionPerformed(evt);
            }
        });
        jPanel1.add(jpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 190, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 210, 10));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 650, 200));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/delete.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/new-user.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/list-button.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, 60));

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel14.setText("Nombre");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jnombre.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jnombre.setBorder(null);
        jnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jnombreMouseExited(evt);
            }
        });
        jnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnombreActionPerformed(evt);
            }
        });
        jPanel1.add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 190, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 210, 10));

        enfer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        enfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enferActionPerformed(evt);
            }
        });
        jPanel1.add(enfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        tatuajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        tatuajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tatuajesActionPerformed(evt);
            }
        });
        jPanel1.add(tatuajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        transfusi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        transfusi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfusiActionPerformed(evt);
            }
        });
        jPanel1.add(transfusi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/male.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 70, 80));

        jbutonguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save.png"))); // NOI18N
        jbutonguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutonguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbutonguardarMouseClicked(evt);
            }
        });
        jPanel1.add(jbutonguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel17.setText("Guardar");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpesoMouseExited
        // TODO add your handling code here:
        area.setText("");
    }//GEN-LAST:event_jpesoMouseExited

    private void jpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpesoActionPerformed

    private void jtallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtallaActionPerformed

    private void jpresionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpresionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpresionMouseExited

    private void jpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpresionActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:

        try {
            String nombre = new String(jnombre.getText());
            String peso = new String(jpeso.getText());
            String talla = new String(jtalla.getText());
            String presion = new String(jpresion.getText());
            int peso1 = Integer.parseInt(peso);
            v.vPeso(peso1);
            double talla1 = Double.parseDouble(talla);
            v.vTalla(talla1);
            int presion1 = Integer.parseInt(presion);
            v.vpresion(presion1);
            // String tiposangre = new String(jtiposangre.getText());
            r = new RegistroDonanteApto(nombre, peso1, talla1, presion1);

            if (d.verificarDuplicado(r)) {
                JOptionPane.showMessageDialog(this, "ERROR, EL Donante YA EXISTE");
                //  System.out.println("Error, el Donante ya existe");
            } else {
                d.nuevaRegistro(r);
            }

            area.append(d.listarCuentas());

            jnombre.setText(null);
            jpeso.setText(null);
            jtalla.setText(null);
            jpresion.setText(null);
//              for (Registro c : Donante.getRegistros()) {
//            if (c != null) {
//                System.out.println(c.toString());
//
//                area.append( rr.ReporteRegistro(c));
//            }
//        }
            //   rr.ReporteRegistro(new RegistroDonanteApto(nombre,peso1, talla1, presion1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos");
        }


    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        String name = new String(jpeso.getText());
        d.borrarRegistro(name);

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        area.append(d.listarCuentas());


    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Home h = new Home();
        h.setVisible(true);


    }//GEN-LAST:event_jLabel8MouseClicked

    private void jnombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jnombreMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jnombreMouseExited

    private void jnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnombreActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(Home.ICONIFIED);
        Home h = new Home();
        h.setVisible(true);

    }//GEN-LAST:event_jLabel15MouseClicked

    private void enferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enferActionPerformed

    private void tatuajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tatuajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tatuajesActionPerformed

    private void transfusiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfusiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfusiActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
 try{
            String nombre=new String(jnombre.getText());
            String peso = new String(jpeso.getText());
            String talla = new String(jtalla.getText());
            String presion = new String(jpresion.getText());
            int peso1 = Integer.parseInt(peso);
            v.vPeso(peso1);
            double talla1 = Double.parseDouble(talla);
            v.vTalla(talla1);
            int presion1 = Integer.parseInt(presion);
            v.vpresion(presion1);
            // String tiposangre = new String(jtiposangre.getText());
              String tatu = tatuajes.getSelectedItem().toString();  
          if(tatu=="Si"){
              tatu="true";
               b = Boolean.valueOf(tatu);
              
          }else if(tatu=="No"){
              tatu="false";
               b = Boolean.valueOf(tatu);
          }          
                String tra = transfusi.getSelectedItem().toString();  
          if(tra=="Si"){
              tra="true";
               t = Boolean.valueOf(tra);
              
          }else if(tra=="No"){
              tra="false";
               t = Boolean.valueOf(tra);
          }          
               String enf = enfer.getSelectedItem().toString();  
          if(enf=="Si"){
              enf="true";
               e = Boolean.valueOf(enf);
              
          }else if(enf=="No"){
              enf="false";
               e = Boolean.valueOf(enf);
          }          
              
          
            
             r=new RegistroDonanteNoValido(b, t, e, nombre, peso1, talla1, presion1);
          
                if(d.verificarDuplicado(r)){
                    JOptionPane.showMessageDialog(this,"ERROR, EL Donante YA EXISTE");
                  //  System.out.println("Error, el Donante ya existe");
                }else {
                    d.nuevaRegistro(r);
                }
                    
         
             area.append(d.listarCuentas());
            
            jnombre.setText(null);
            jpeso.setText(null);
            jtalla.setText(null);
            jpresion.setText(null);
//              for (Registro c : Donante.getRegistros()) {
//            if (c != null) {
//                System.out.println(c.toString());
//
//                area.append( rr.ReporteRegistro(c));
//            }
//        }
          //   rr.ReporteRegistro(new RegistroDonanteApto(nombre,peso1, talla1, presion1));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos");
        }

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jbutonguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbutonguardarMouseClicked
        try {
            a.guardarDatosRe();
          
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
        }

    }//GEN-LAST:event_jbutonguardarMouseClicked
    public void bol(String casilla) {

    }

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
            java.util.logging.Logger.getLogger(GestionarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JComboBox<String> enfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jbutonguardar;
    private javax.swing.JTextField jnombre;
    private javax.swing.JTextField jpeso;
    private javax.swing.JTextField jpresion;
    private javax.swing.JTextField jtalla;
    private javax.swing.JComboBox<String> tatuajes;
    private javax.swing.JComboBox<String> transfusi;
    // End of variables declaration//GEN-END:variables
}
