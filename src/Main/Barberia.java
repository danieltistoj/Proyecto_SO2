/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import Clase.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Barberia extends javax.swing.JFrame {

    ArrayList<Cliente> clientes;
    int contador, posicionX = 0,posicionY = 0;
    Barbero barbero1, barbero2, barbero3;
    public Barberia() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        clientes = new ArrayList<Cliente>();
        contador = 0;
        
        barbero1 = new Barbero("Barbero 1", sillaUno,barraUno);
        barbero2 = new Barbero("Barbero 2", sillaDos,barraDos);
        barbero3 = new Barbero("Barbero 3", sillaTres,barraTres);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBarberia = new javax.swing.JPanel();
        sillaDos = new javax.swing.JPanel();
        sillaUno = new javax.swing.JPanel();
        sofaPanel = new javax.swing.JPanel();
        sillaTres = new javax.swing.JPanel();
        cajaResgistadora = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        esperaDePie = new javax.swing.JPanel();
        barraUno = new javax.swing.JProgressBar();
        barraDos = new javax.swing.JProgressBar();
        barraTres = new javax.swing.JProgressBar();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btncrearClientes = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBarberia.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout sillaDosLayout = new javax.swing.GroupLayout(sillaDos);
        sillaDos.setLayout(sillaDosLayout);
        sillaDosLayout.setHorizontalGroup(
            sillaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        sillaDosLayout.setVerticalGroup(
            sillaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sillaUnoLayout = new javax.swing.GroupLayout(sillaUno);
        sillaUno.setLayout(sillaUnoLayout);
        sillaUnoLayout.setHorizontalGroup(
            sillaUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        sillaUnoLayout.setVerticalGroup(
            sillaUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        sofaPanel.setPreferredSize(new java.awt.Dimension(384, 84));

        javax.swing.GroupLayout sofaPanelLayout = new javax.swing.GroupLayout(sofaPanel);
        sofaPanel.setLayout(sofaPanelLayout);
        sofaPanelLayout.setHorizontalGroup(
            sofaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sofaPanelLayout.setVerticalGroup(
            sofaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sillaTresLayout = new javax.swing.GroupLayout(sillaTres);
        sillaTres.setLayout(sillaTresLayout);
        sillaTresLayout.setHorizontalGroup(
            sillaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        sillaTresLayout.setVerticalGroup(
            sillaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cajaResgistadoraLayout = new javax.swing.GroupLayout(cajaResgistadora);
        cajaResgistadora.setLayout(cajaResgistadoraLayout);
        cajaResgistadoraLayout.setHorizontalGroup(
            cajaResgistadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        cajaResgistadoraLayout.setVerticalGroup(
            cajaResgistadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sofá");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Área para estar de pie");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sillas de barbero");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Caja registradora");

        esperaDePie.setPreferredSize(new java.awt.Dimension(96, 336));

        javax.swing.GroupLayout esperaDePieLayout = new javax.swing.GroupLayout(esperaDePie);
        esperaDePie.setLayout(esperaDePieLayout);
        esperaDePieLayout.setHorizontalGroup(
            esperaDePieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        esperaDePieLayout.setVerticalGroup(
            esperaDePieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        barraUno.setStringPainted(true);

        barraDos.setStringPainted(true);

        barraTres.setStringPainted(true);

        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout panelBarberiaLayout = new javax.swing.GroupLayout(panelBarberia);
        panelBarberia.setLayout(panelBarberiaLayout);
        panelBarberiaLayout.setHorizontalGroup(
            panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarberiaLayout.createSequentialGroup()
                .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBarberiaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBarberiaLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(esperaDePie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(sofaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBarberiaLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBarberiaLayout.createSequentialGroup()
                        .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBarberiaLayout.createSequentialGroup()
                                .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelBarberiaLayout.createSequentialGroup()
                                        .addComponent(barraUno, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(barraDos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBarberiaLayout.createSequentialGroup()
                                        .addComponent(sillaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sillaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)
                                .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sillaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barraTres, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarberiaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaResgistadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(60, 60, 60))))
        );
        panelBarberiaLayout.setVerticalGroup(
            panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarberiaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBarberiaLayout.createSequentialGroup()
                            .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sillaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sillaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarberiaLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)))
                    .addGroup(panelBarberiaLayout.createSequentialGroup()
                        .addComponent(sillaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBarberiaLayout.createSequentialGroup()
                        .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaResgistadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barraDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barraTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sofaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBarberiaLayout.createSequentialGroup()
                        .addComponent(barraUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(esperaDePie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBarberiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Barberia");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        btncrearClientes.setText("Crear Clientes");
        btncrearClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearClientesActionPerformed(evt);
            }
        });

        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btncrearClientes)
                .addGap(18, 18, 18)
                .addComponent(btnAtender)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrearClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBarberia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBarberia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este metodo funciona para correr a los clientes una posicion para poder ser los siguientes en ser atendidos
    public void CorrerClientes(){
    int cont = 0;
    for (Cliente cliente : clientes){
        System.out.println("cliente en proceso "+cliente.getLable().getText());
        /*
        Esta condicion corre hacia la izquierda los clientes 
        del panel de sofa, la condicion del contador es que debe de 
        ser menor a 3 ya que si habia 5 clietes en principio significa que habran 4 en sofa 
        y 1 de pie por lo tanto, si se elimina uno hay 3 en sofa y 1 de pie, y por lo tanto las posiciones 
        cambian, el que era posicion 1 sera ahora posicion 0, y si era posicion 4 que ya es una posicion
        para estar de pie ahora sera posicion 4 y debera de pasar a al final del sofa. 
        */
        if(cont<3){
            int x = cliente.getLable().getX();
            x = x - 96;
            cliente.getLable().setBounds(x, 0, 96, 84);
            sofaPanel.repaint();
        }
        else{
            System.out.println("contador "+cont);
            /*
            Esta condicion es si hay alguno en el panel de espera de pie, ahora el que esta al inicio de este
            panel debera de pasar al final del panel de sofa. 
            */
            if(cont == 3){
                System.out.println("entro "+cliente.getLable().getText());
                esperaDePie.remove(cliente.getLable());
                esperaDePie.repaint();
                cliente.getLable().setBounds(282,0,96,84);
                sofaPanel.add(cliente.getLable());
                sofaPanel.repaint();
            }
            /*
            Esta condicion es para correr hacia arriba los clientes del panel de espera de pie 
            */
            else{
                int y = cliente.getLable().getY();
                y = y - 84;
                cliente.getLable().setBounds(0,y, 96, 84);
                esperaDePie.repaint();
            }
        }
        cont++;
    }
    if(clientes.size()<4){
        posicionX-=96;
    }
    else{
        posicionY-=84;
    }
}
    private void btncrearClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearClientesActionPerformed
                String nombre = "Cliente "+(contador+1);
                Cliente cliente = new Cliente();
                cliente.setNombre(nombre);
                if(clientes.size()<4){ //Clientes que esperan en le sofa
                    System.out.println("posicion en X "+posicionX);
                    cliente.getLable().setBounds(posicionX,0, 96, 84);
                    sofaPanel.add(cliente.getLable());
                    sofaPanel.repaint();
                    posicionX+=94;
                }
                else{//Clientes que esperan de pie
                    cliente.getLable().setBounds(0,posicionY, 96, 84);
                    esperaDePie.add(cliente.getLable());
                    esperaDePie.repaint();
                    posicionY+=84;
                    
                }
                clientes.add(cliente);
                contador++ ;
    }//GEN-LAST:event_btncrearClientesActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
      
      //Simpre buscaremos atender al cliente que esta en la posicion 0. por respetar una fila  
      Cliente cliente = clientes.get(0);
      
      if(barbero1.getEstado()!=1){
      sofaPanel.remove(cliente.getLable());
      sofaPanel.repaint();
      barbero1.AgragarCliente(cliente.getLable());
      barbero1.setEstado(1);
      barbero1.setCliente(cliente);
      clientes.remove(0);
      CorrerClientes();
      AtenderCliente atender = new AtenderCliente(barbero1.getBarra());
      atender.start();
      }
      else if(barbero2.getEstado()!=1){
      sofaPanel.remove(cliente.getLable());
      sofaPanel.repaint();
      barbero2.AgragarCliente(cliente.getLable());
      barbero2.setEstado(1);
      barbero2.setCliente(cliente);
      clientes.remove(0);
      CorrerClientes();
      AtenderCliente atender = new AtenderCliente(barbero2.getBarra());
      atender.start();
          
      }
      else if(barbero3.getEstado()!=1){
      sofaPanel.remove(cliente.getLable());
      sofaPanel.repaint();
      barbero3.AgragarCliente(cliente.getLable());
      barbero3.setEstado(1);
      barbero3.setCliente(cliente);
      clientes.remove(0);
      CorrerClientes();
      AtenderCliente atender = new AtenderCliente(barbero3.getBarra());
      atender.start();
          
      }
      else{
          JOptionPane.showMessageDialog(null,"Todos los barberos estan ocupados","ERROR",JOptionPane.ERROR_MESSAGE);
      }
      
      
    }//GEN-LAST:event_btnAtenderActionPerformed

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
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barberia().setVisible(true);
            }
        });
    }
       
    public class AtenderCliente extends Thread{
        JProgressBar barra;
        public AtenderCliente(JProgressBar barra){
            this.barra = barra;
        }

        @Override
         public void run() {
         for(int i = 1; i<=100;i++){
              try {
                 Thread.sleep(100);
             } catch (InterruptedException ex) {
                 java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             }
             barra.setValue(i);
         }
         //barra.setValue(0);
         }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraDos;
    private javax.swing.JProgressBar barraTres;
    private javax.swing.JProgressBar barraUno;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btncrearClientes;
    private javax.swing.JPanel cajaResgistadora;
    private javax.swing.JPanel esperaDePie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panelBarberia;
    private javax.swing.JPanel sillaDos;
    private javax.swing.JPanel sillaTres;
    private javax.swing.JPanel sillaUno;
    private javax.swing.JPanel sofaPanel;
    // End of variables declaration//GEN-END:variables
}
