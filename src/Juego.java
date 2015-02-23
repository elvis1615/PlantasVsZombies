/**
 * @(#)Juego.java
 *
 *
 * @author 
 * @version 1.00 2015/2/22
 */

import javax.swing.*;
import java.awt.*;

public class Juego extends JFrame {

	Jugador plantas;
	Jugador zombies;
	JPanel panel;
	JPanel jugplantas,jugZombies;
    public Juego() {
    	setLayout(null);    	
    	setSize(1200,800);
    	setVisible(true);
    	panel = new JPanel();
    	panel.setLayout(null);
    	panel.setBounds(8,5,1170,750);
    	add(panel);
    	panel.setBackground(new java.awt.Color(0,255,154,90));
    	panel.setOpaque(true);
    	jugplantas=new JPanel();
    	jugplantas.setBounds(10,200,200,500);
    	panel.add(jugplantas);
    	jugplantas.setBackground(new java.awt.Color(0,255,127));
    	jugplantas.setOpaque(true);
    	
    	jugZombies=new JPanel();
    	jugZombies.setBounds(960,200,200,500);
    	panel.add(jugZombies);
    	jugZombies.setBackground(new java.awt.Color(220,20,60));
    	jugZombies.setOpaque(true);
    	
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
}