/**
 * @(#)Principal.java
 *
 *
 * @author 
 * @version 1.00 2015/2/12
 */
 import javax.swing.*;


public class Principal extends JFrame {
	JButton jugPlantas, jugZombie,Comenzar,EliminarDatos;


    public Principal() {
    	setLayout(null);
    	setResizable(false);
    	
    	setVisible(true);
    	setSize(700,300);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	jugPlantas=new JButton("Jugador Plantas");
    	jugPlantas.setBounds(275,50,150,30);
    	add(jugPlantas);
    	
    	jugZombie =new JButton("Jugador Zombies");
    	jugZombie.setBounds(275,100,150,30);
    	add(jugZombie);
    		
    	Comenzar=new JButton("Comenzar Juego");
    	Comenzar.setBounds(180,150,150,30);
    	add(Comenzar);
    	
    	EliminarDatos=new JButton("Eliminar Datos");
    	EliminarDatos.setBounds(370,150,150,30);
    	add(EliminarDatos);
    	
    	setLocationRelativeTo(null);
    	    	
    	}
    
    
}