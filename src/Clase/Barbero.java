/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase;

import javax.swing.JLabel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Barbero {
      private int estado; //Estado cero = dormido, uno = trabajando
      private String nombre;
      private JLabel label;
      public Barbero(String nombre){
          this.estado = 0;
          this.nombre = nombre;
          
      }
      public int getEstado(){
          return estado;
      }
      public void setEstado(int estado){
          this.estado = estado;
      }
}
