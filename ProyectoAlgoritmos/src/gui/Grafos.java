/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dominio.GrafoMatrixAdyacencia;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import dominio.Dijkstra;
import dominio.Graph;
import dominio.Node;
import java.util.Iterator;
import util.Validacion;
import dominio.Camion;

/**
 *
 * @author danni
 */
public class Grafos extends javax.swing.JFrame {

    private List<Nodo> vectorNodos;
    private List<Enlace> vectorEnlace;
    private Point p1, p2;
    GrafoMatrixAdyacencia ma;
    ImageIcon i = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/mapa2.png")).getImage());
    ImageIcon basura = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/garbage.png")).getImage());
    ImageIcon camion = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/truck.png")).getImage());
    int contador = 0;
    String nodospara;
    Validacion v;
    Camion cam;
Node nodeA ;
Node nodeB ;
Node nodeC ;
Node nodeD ;
Node nodeE ;
Node nodeF ;

    /**
     * Creates new form Grafos
     */
    public Grafos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cerrar();
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos/iconoinicio.png")).getImage());
        this.setExtendedState(Grafos.MAXIMIZED_BOTH);
        jPanel3.setBackground(Color.WHITE);
        vectorEnlace = new ArrayList<>();
        vectorNodos = new ArrayList<>();
        
        area1.append("Bienvenidos a nuestro Sistema\n \n 1.Cargue el mapa");
         v=new Validacion();
        nodeA= new Node("A");
        nodeB = new Node("B");
        nodeC = new Node("C");
        nodeD = new Node("D");
        nodeE = new Node("E");
        nodeF = new Node("F");

    }

    public class Nodo {

        private int x, y;
        private static final int d = 20;

        public Nodo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void pintarCirculo(Graphics g, String n) {
            //g.drawOval(x, y-10, 20, 20);
            ((Graphics2D) g).setColor(Color.ORANGE);
            ((Graphics2D) g).setStroke(new BasicStroke(2));//leda el grosor al circulo        
            ((Graphics2D) g).fillOval(x, y, 15, 15);
            ((Graphics2D) g).setColor(Color.BLACK);
            ((Graphics2D) g).drawOval(x, y, 15, 15);
            ((Graphics2D) g).setColor(Color.ORANGE);
            Font fuente = new Font("Monospaced", Font.BOLD, 16);
            g.setFont(fuente);
            ((Graphics2D) g).drawString(n, x, y);
           g.drawImage(basura.getImage(), x, y, null);

        }

    }

    public class Enlace {

        private int x1, x2, y1, y2;
        String name;

        public Enlace(int x1, int x2, int y1, int y2,String name) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            this.name=name;
        }

        public int getX1() {
            return x1;
        }

        public int getX2() {
            return x2;
        }

        public int getY1() {
            return y1;
        }

        public int getY2() {
            return y2;
        }

        public void pintarLinea(Graphics g, int x1, int y1, int x2, int y2,String name) {
            g.setColor(Color.BLACK);

            g.drawLine(x1, y1, x2, y2);
            if(x1>x2&&y1>y2){
                
                g.drawString(name, x1-Math.abs((x1-x2)/2), y1-Math.abs((y1-y2)/2));
                g.drawImage(camion.getImage(),x1-Math.abs((x1-x2)/2), y1-Math.abs((y1-y2)/2), null);
            }
            if(x1<x2&&y1<y2){
                g.drawString(name, x2-Math.abs((x1-x2)/2), y2-Math.abs((y1-y2)/2));
                g.drawImage(camion.getImage(),x2-Math.abs((x1-x2)/2), y2-Math.abs((y1-y2)/2), null);
            }
            if(x1>x2&&y1<y2){
                g.drawString(name, x1-Math.abs((x1-x2)/2), y2-Math.abs((y1-y2)/2));
                g.drawImage(camion.getImage(),x1-Math.abs((x1-x2)/2), y2-Math.abs((y1-y2)/2), null);
            }
            if(x1<x2&&y1>y2){
                g.drawString(name, x2-Math.abs((x1-x2)/2), y1-Math.abs((y1-y2)/2));
                g.drawImage(camion.getImage(),x2-Math.abs((x1-x2)/2), y1-Math.abs((y1-y2)/2), null);
            }
            
        }

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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setAlignmentX(0.1F);
        jTabbedPane1.setAlignmentY(0.1F);
        jTabbedPane1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nodo.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/vector-diagonal-line-with-box-edges.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Insertar Mapa                 Insertar Aristas");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Capacidad");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gasolina");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gar.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Basura");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1128, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insertar ", jPanel2);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancel-mark.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Limpiar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel5)))
                .addContainerGap(1698, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Limpiar Ventana", jPanel4);

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1262, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );

        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public final void imagen(Graphics g) {
        g.drawImage(i.getImage(), 0, 0, 1260, 800, null);

    }

    public void pinta(Graphics g) {
        for (Nodo nodos : vectorNodos) {

            nodos.pintarCirculo(g, "Nodo");

        }

    }
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
         
        jPanel3.removeAll();
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (vectorNodos.size() < 6) {
                this.vectorNodos.add(new Nodo(evt.getX(), evt.getY()));
                contador++;
                
            }

            //  ma=new GrafoMatrixAdyacencia(contador,Integer.valueOf(nodospara));
        }
        int i = 65;

        for (Nodo nodos : vectorNodos) {

            nodos.pintarCirculo(jPanel3.getGraphics(), "Nodo" + (char) (i));

            i++;
        }
        


    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:

        jPanel3.removeAll();
        vectorNodos=null;
        jPanel3.setBackground(Color.WHITE);
        jPanel3.repaint();
       Grafos g =new Grafos();
       this.dispose();
       g.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
       try{
        Enlace e = new Enlace(0, 0, 500, 500,"d");
        String num ;
        boolean t=false;
        do{
            num = JOptionPane.showInputDialog(this, "Ingrese el peso de la Arista de A a B");
            t=v.numero(num);
        }while(num.equals(""));
        int nu = Integer.valueOf(num);
        nodeA.addDestination(nodeB, nu);
        e.pintarLinea(jPanel3.getGraphics(), vectorNodos.get(0).getX(), vectorNodos.get(0).getY(), vectorNodos.get(1).getX(), vectorNodos.get(1).getY(),num);//ab
        do{
            num = JOptionPane.showInputDialog(this, "Ingrese el peso de la Arista de A a C");
        }while(num.equals(""));
        nu = Integer.valueOf(num);
        nodeA.addDestination(nodeC, nu);
        e.pintarLinea(jPanel3.getGraphics(), vectorNodos.get(0).getX(), vectorNodos.get(0).getY(), vectorNodos.get(2).getX(), vectorNodos.get(2).getY(),num);//ac
        do{
            num = JOptionPane.showInputDialog(this, "Ingrese el peso de la Arista de B a D");
        }while(num.equals(""));
        nu = Integer.valueOf(num);
        nodeB.addDestination(nodeD, nu);
        e.pintarLinea(jPanel3.getGraphics(), vectorNodos.get(1).getX(), vectorNodos.get(1).getY(), vectorNodos.get(3).getX(), vectorNodos.get(3).getY(),num);//bd
        do{
            num = JOptionPane.showInputDialog(this, "Ingrese el peso de la Arista de B a F");
        }while(num.equals(""));
        nu = Integer.valueOf(num);
        nodeB.addDestination(nodeF, nu);
        e.pintarLinea(jPanel3.getGraphics(), vectorNodos.get(1).getX(), vectorNodos.get(1).getY(), vectorNodos.get(5).getX(), vectorNodos.get(5).getY(),num);//bf
        do{
            num = JOptionPane.showInputDialog(this, "Ingrese el peso de la Arista de C a E");

        }while(num.equals(""));
        nu = Integer.valueOf(num);
        nodeC.addDestination(nodeE, nu);
        e.pintarLinea(jPanel3.getGraphics(), vectorNodos.get(2).getX(), vectorNodos.get(2).getY(), vectorNodos.get(4).getX(), vectorNodos.get(4).getY(),num);//ce
        do{
            num = JOptionPane.showInputDialog(this, "Ingrese el peso de la Arista de D a E");
        }while(num.equals(""));
        nu = Integer.valueOf(num);
        nodeD.addDestination(nodeE, nu);
        e.pintarLinea(jPanel3.getGraphics(), vectorNodos.get(3).getX(), vectorNodos.get(3).getY(), vectorNodos.get(4).getX(), vectorNodos.get(4).getY(),num);//de
        do{
            num = JOptionPane.showInputDialog(this, "Ingrese el peso de la Arista de D a F");
        }while(num.equals(""));
        nu = Integer.valueOf(num);
        nodeD.addDestination(nodeF, nu);
        e.pintarLinea(jPanel3.getGraphics(), vectorNodos.get(3).getX(), vectorNodos.get(3).getY(), vectorNodos.get(5).getX(), vectorNodos.get(5).getY(),num);//df
        do{
            num = JOptionPane.showInputDialog(this, "Ingrese el peso de la Arista de E a F");
        }while(num.equals(""));
        nu = Integer.valueOf(num);
        nodeF.addDestination(nodeE, nu);
        e.pintarLinea(jPanel3.getGraphics(), vectorNodos.get(4).getX(), vectorNodos.get(4).getY(), vectorNodos.get(5).getX(), vectorNodos.get(5).getY(),num);//fe
        Graph graph = new Graph();
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        Graph graph1 = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
        
        Iterator iter = graph1.getNodes().iterator();
        String tex="";
        while (iter.hasNext()) {
            //System.out.println(iter.next());
            tex=iter.next()+"\n";
            area1.append(tex);
        }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Ingrese solo numeros");
       }
        //abde

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        imagen(jPanel3.getGraphics());
        area1.append("\n 2. De clic encima del mapa para ingresar los nodos\n \n 3.Inserte las aristas ");
        JOptionPane.showMessageDialog(this, "Inserte 6 nodos en el mapa");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        try{
         int suma=nodeA.getDistance()+nodeB.getDistance()+nodeD.getDistance()+nodeE.getDistance();
        int gas=Integer.parseInt(jTextField2.getText());
        cam=new Camion();
        cam.gasolina(gas,suma);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Llene los campos y rutas");
        }
    }//GEN-LAST:event_jLabel8MouseClicked


    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    try {
                        confirmarSalida();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, "error al cierre");
                    }
                }
            });
            this.setVisible(true);
        } catch (Exception e) {

        }
    }

    public void confirmarSalida() throws IOException {
        int valor = JOptionPane.showConfirmDialog(this, "Esta Seguro que desea salir", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_NO_OPTION) {
            SplashSalida sal = new SplashSalida();
            sal.setVisible(true);
            this.dispose();

        }
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
            java.util.logging.Logger.getLogger(Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
