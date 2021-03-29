/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cliente {
    private String nombre;
    private JLabel label;
    public void setNombre(String nombre){
        this.nombre = nombre;
        label = new JLabel(nombre, SwingConstants.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setOpaque(true);//Desactiva el label por defecto para permitar pintar el label
        label.setBackground(Color.blue);
    }
    public String getNombre(){
        return this.nombre;
    }
    public JLabel getLable(){
    return this.label;
    }
    
}
