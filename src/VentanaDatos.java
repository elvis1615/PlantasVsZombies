/**
 * @(#)VentanaDatos.java
 *
 *
 * @author 
 * @version 1.00 2015/2/23
 */
import javax.swing.*;
import java.awt.*;

public class VentanaDatos extends JFrame {

	JLabel name,cantidad;
	JTextField nombre,numero;
	JButton aceptar,agregarCampo;
	
    public VentanaDatos() {
    	setLayout(null);
    	setSize(500,530);
    	JPanel lugar=new JPanel();
    	lugar.setLayout(null);
    	lugar.setBounds(20,20,450,450);
    	lugar.setOpaque(true);
    	lugar.setBackground(new java.awt.Color(0,250,154));
    	name=new JLabel("Nombre: ");
    	name.setBounds(50,25,100,30);
    	lugar.add(name);
    	nombre=new JTextField();
    	nombre.setBounds(200,25,150,30);
    	lugar.add(nombre);
    	numero=new JTextField();
    	numero.setBounds(200,60,50,30);
    	lugar.add(numero);
    	cantidad=new JLabel("Cantidad: ");
    	cantidad.setBounds(50,60,100,30);
    	lugar.add(cantidad);
    	add(lugar);
    	
    	
    }
    
    
}