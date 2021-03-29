/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Barbero {
      private int estado; //Estado cero = dormido, uno = trabajando
      private String nombre;
      private JPanel panel;
      private JLabel label;
      private JProgressBar barra;
      private Cliente cliente;
      public Barbero(String nombre,JPanel panel,JProgressBar barra){
          this.estado = 0;
          this.nombre = nombre;
          this.panel = panel;
          this.barra = barra;
      }
      public int getEstado(){
          return estado;
      }
      public void setEstado(int estado){
          this.estado = estado;
      }
      public JProgressBar getBarra(){
          return barra;
      }
      public void setBarra(){
          this.barra.setValue(0);
      }
      public void AgragarCliente(JLabel label){
          label.setBounds(0,0,96,84);
          this.panel.add(label);
          this.panel.repaint();
      }
      public void setCliente(Cliente cliente){
          this.cliente = cliente;
      }
      public Cliente getCliente(){
          return cliente;
      }
      public JPanel getPanel(){
          return panel;
      }
      public String getNombre(){
          return nombre;
      }
}
