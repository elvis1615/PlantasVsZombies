/**
 * @(#)VentanaDatos.java
 *
 *
 * @author 
 * @version 1.00 2015/2/23
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaDatos extends JFrame {
	Jugador jugador;
	JLabel name,cantidad;
	JTextField nombre,numero,campo,valorcampo;
	JButton aceptar,agregarCampo,agrega,cancelar,guardar;
	JFrame nuevoDato;
	
    public VentanaDatos( Boolean zombie) {
    	
    	
    	
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
    	guardar =new JButton("guardar");
    	guardar.setBounds(250,300,150,20);
    	lugar.add(guardar);
    	agrega=new JButton("Agregar");
    	agrega.setBounds(30,130,100,25);
    	cancelar=new JButton("Cancelar");
    	cancelar.setBounds(165,130,100,25);
    	nuevoDato.add(agrega);
    	nuevoDato.add(cancelar);
    	
    	cancelar.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
               nuevoDato.dispose();
            }
        }); 
        agregarCampo.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
               if(!jugador.datos.estaVacia())
               	{
               			nuevoDato.setVisible(true);
               	}
               	else
               	{
               	JOptionPane.showMessageDialog(null,"aun no se a agregado nombre y numero");
               	}
            }
        }); 
        	
        jugador=new Jugador(zombie);
        agrega.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
              try
              	{
              		AGREGARCAMPO(campo.getText().toString(),valorcampo.getText().toString());
              		campo.setText("");
              		valorcampo.setText("");
              		System.out.print("se agrego");
              	}
              catch(Exception ex)
              {
              	JOptionPane.showMessageDialog(null,"a sucedido un error"+ex);
              }
            }
        }); 
        	
        aceptar.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
              try
              	{
              	jugador.datos.insertar("nombre ",nombre.getText().toString());
               jugador.datos.insertar("cantidad ", numero.getText().toString());
              	}
              catch(Exception ex)
              {
              	JOptionPane.showMessageDialog(null,"a sucedido un error"+ex);
              }
              aceptar.setEnabled(false);
                
            }
        }); 
        
        guardar.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
              if(zombie)
              {
              Principal.jugadores[2]=jugador;
              }
              else
              {
              	Principal.jugadores[1]=jugador;
              }
              
              dispose();
              
            }
        });
        
    	
    }
    
    void  AGREGARCAMPO(String campo,String dato)
    {
    jugador.datos.insertar(campo,dato);
    }
    

    
}