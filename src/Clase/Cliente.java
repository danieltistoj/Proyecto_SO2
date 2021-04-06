/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cliente {

    private String nombre;
    private JLabel label;
    private String url = "src/img/persona5.png";
    private String urlsentado = "src/img/sentado.png";
    private String urlcobrar = "src/img/pagando.png";

    public String getUrlsentado() {
        return urlsentado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        label = new JLabel(nombre, SwingConstants.CENTER);
        //label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //label.setOpaque(true);//Desactiva el label por defecto para permitar pintar el label
        //label.setBackground(Color.blue);
        label.setPreferredSize(new Dimension(96, 84));
        label.setIcon(new ImageIcon(url));
        System.out.println("entro");
    }

    public void cambar() {
        label = new JLabel(nombre, SwingConstants.CENTER);
        //label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //label.setOpaque(true);//Desactiva el label por defecto para permitar pintar el label
        //label.setBackground(Color.blue);
        label.setPreferredSize(new Dimension(96, 84));
        label.setIcon(new ImageIcon(urlsentado));
    }

    public void cobrar() {
        label = new JLabel(nombre, SwingConstants.CENTER);
        //label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //label.setOpaque(true);//Desactiva el label por defecto para permitar pintar el label
        //label.setBackground(Color.blue);
        label.setPreferredSize(new Dimension(96, 84));
        label.setIcon(new ImageIcon(urlcobrar));
    }

    public String getNombre() {
        return this.nombre;
    }

    public JLabel getLable() {
        return this.label;
    }

}
