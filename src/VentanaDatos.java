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
	JTextField nombre,numero,campo,valorcampo;
	JButton aceptar,agregarCampo,agrega,cancelar;
	JFrame nuevoDato;
	
    public VentanaDatos() {
    	setResizable(false);
    	setLayout(null);
    	setSize(500,530);
    	JPanel lugar=new JPanel();
    	lugar.setLayout(null);
    	lugar.setBounds(20,20,450,450);
    	lugar.setOpaque(true);
    	lugar.setBackground(new java.awt.Color(0,250,154));
    	name=new JLabel("Nombre: ");
    	name.setBounds(100,25,100,30);
    	lugar.add(name);
    	nombre=new JTextField();
    	nombre.setBounds(200,25,150,25);
    	lugar.add(nombre);
    	numero=new JTextField();
    	numero.setBounds(200,60,50,25);
    	lugar.add(numero);
    	cantidad=new JLabel("Cantidad: ");
    	cantidad.setBounds(100,60,100,30);
    	lugar.add(cantidad);
    	add(lugar);
    	aceptar =new JButton("Aceptar");
    	aceptar.setBounds(70,400,150,25);
    	lugar.add(aceptar);
    	agregarCampo=new JButton("Agregar Campo");
    	agregarCampo.setBounds(235,400,150,25);
    	lugar.add(agregarCampo);
    	
    	nuevoDato=new JFrame("Agregar Campo");
    	nuevoDato.setSize(300,250);
    	nuevoDato.setLayout(null);
    	agrega=new JButton("Agregar");
    	cancelar=new JButton("Cancelar");
    	JLabel hola1= new JLabel("Campo:");
    	hola1.setBounds(30,20,100,30);
    	nuevoDato.add(hola1);
    	JLabel hola2=new JLabel("Valor:");
    	hola2.setBounds(30,60,100,30);
    	nuevoDato.add(hola2);
    	nuevoDato.setResizable(false);
    	campo=new JTextField();
    	campo.setBounds(110,20,150,25);
    	nuevoDato.add(campo);
    	valorcampo=new JTextField();
    	valorcampo.setBounds(110,60,150,25);
    	nuevoDato.add(valorcampo);
    	
    	agrega=new JButton("Agregar");
    	agrega.setBounds(30,130,100,25);
    	cancelar=new JButton("Cancelar");
    	cancelar.setBounds(165,130,100,25);
    	nuevoDato.add(agrega);
    	nuevoDato.add(cancelar);
    }
    
    void mostrar()
    {
    	nuevoDato.setVisible(true);
    }
    
    
}