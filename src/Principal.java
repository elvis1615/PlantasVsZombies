/**
 * @(#)Principal.java
 *
 *
 * @author 
 * @version 1.00 2015/2/12
 */
 import javax.swing.*;
 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Principal extends JFrame {
	JButton jugPlantas, jugZombie,Comenzar,EliminarDatos;
	VentanaDatos receptorDatos;
	public static Jugador[] jugadores;
	Boolean zombie;
	File f;
	FileWriter w;
	PrintWriter wr;
	BufferedWriter bw;
	
	

    public Principal() {
    	JMenuBar menu=new JMenuBar();
    	JMenu m= new JMenu("File");
    	JMenuItem r1=new JMenuItem("Reporte Jugadores");
    	JMenuItem r2= new JMenuItem("Reporte Zombies");
    	JMenuItem r3=new JMenuItem("Reporte Plantas");
    	m.add(r1);
    	m.add(r2);
    	m.add(r3);
    	menu.add(m);
    	setJMenuBar(menu);
    	zombie=false;
    	receptorDatos=new VentanaDatos(zombie);
    	
    	
    	
    	jugadores = new Jugador[3];
    	jugadores[0]= new Jugador(false);
    	jugadores[1]= new Jugador(false);
    	jugadores[2]= new Jugador(true);
    	    	
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
    	
    	//datos de jugador plantas
    	jugPlantas.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
            	zombie=false;
               receptorDatos=new VentanaDatos(zombie);
               receptorDatos.setVisible(true);
            }
        }); 
        
        //listener de datos de jugador zombie
        jugZombie.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
            	zombie=true;
               receptorDatos=new VentanaDatos(zombie);
               receptorDatos.setVisible(true);
            }
        }); 
    	
    	
    	//listener de nueva partida
    	Comenzar.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
               try
               {
               	Juego juego=new Juego(jugadores[1],jugadores[2]);
               
               }
               catch(Exception ex)
               	{
               	JOptionPane.showMessageDialog(null,"a sucedido un error"+ex);
               	}
               
               
            }
        });
        
        //listener de elminar datos
        EliminarDatos.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
               jugadores=new Jugador[3];
            }
        });
    	
    	r1.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
            try{
           	creardot1(jugadores);
            }
            catch(Exception ex)
            {
            	JOptionPane.showMessageDialog(null,"no existe el jugador aun");
            }
              
            }
        });
        
        r2.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
              System.out.println("ola k ase");
            }
        });
        
        r3.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
              System.out.println("ola k ase");
              crearArchivo();
            }
        });
        
        receptorDatos.guardar.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e)
            {
              System.out.println("ola k ase");
              crearArchivo();
            }
        });
        
    		
    	}
    	
    	
    	void reporte(String path)
    	{
    	String graphviz="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    	
    	String fileInputPath = path;
     String fileOutputPath = "c:\\proyecto\\jugadores.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
      
      String[] cmd = new String[5];
      cmd[0] = graphviz;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
      
      try
      {
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd[0]+" "+cmd[1]+" "+cmd[2]+" "+cmd[3]+" "+cmd[4]);
      }
      catch(Exception EX)
      {
      	System.out.print(""+ EX);
      }
    	
    	}
    	
    	
    	
    	
    	void crearArchivo()
    	{
    	try{
    	f=new File("C:\\proyecto\\prueba.txt");
    	if(!f.exists())
    	{
    		f.createNewFile();
    	}
    	w=new FileWriter(f);
    	bw=new BufferedWriter(w);
    	wr=new PrintWriter(bw);
    	wr.write("esta es ka prueba");
    	wr.append("\n esta es la segunda linea");
    	wr.append("\n linea final");
    	wr.close();
    	bw.close();
    	
    	
    	}
    	catch(Exception e)
    	{
    	JOptionPane.showMessageDialog(null,"a sucedido un error"+e);
    	}
    	
    	
      	}
      	
      	void creardot1(Jugador [] jugadores)
      	{
      		try{
      		
      		NodoDatos temp;
      		String path="C:\\proyecto\\jugador.txt";
	      	f=new File(path);
	    	if(!f.exists())
	    	{
	    		f.createNewFile();
	    	}
	    	w=new FileWriter(f);
	    	bw=new BufferedWriter(w);
    		wr=new PrintWriter(bw);
    		wr.write("digraph G \n{");
    		String nodoant="";
    		String jugant="";
    		int	nod=1;
    		int fila=1;
    		for(int i=0;i<3;i++)
    		{
    	
    		
    		temp=jugadores[i].datos.Cabeza;
    		if(i==0)
    		{
    			wr.append("\n struct"+nod+"[label=\"Jugador\"];");
    		}
    		else if(i==1)
    		{
    			wr.append("\n struct"+nod+"[label=\"Plantas\"];");
    			wr.append("\n struct"+(nod-1)+"->struct"+nod+";");
    			int no=1;
    			while(temp!=null)
    			{
    				if(temp.campo.equals(jugadores[i].datos.Cabeza.campo))
    				{
    				wr.append("\n struct1"+no+"[label=\""+temp.campo+" "+temp.dato+"\"];");
    				wr.append("\n struct"+(nod)+"->struct1"+no+";");
    				}
    				else
    				{
    				wr.append("\n struct1"+no+"[label=\""+temp.campo+" "+temp.dato+"\"];");
    				wr.append("\n struct1"+(no-1)+"->struct1"+no+";");
    				}
    				temp=temp.sig;
    				no++;
    			}
    			
    		}
    		else
    		{
    			wr.append("\n struct"+nod+"[label=\"Zombies\"];");
    			wr.append("\n struct"+(nod-1)+"-> struct"+nod+";");
    			int no=1;
    			while(temp!=null)
    			{
    				if(temp.campo.equals(jugadores[i].datos.Cabeza.campo))
    				{
    				wr.append("\n struct2"+no+"[label=\""+temp.campo+" "+temp.dato+"\"];");
    				wr.append("\n struct"+(nod)+"->struct2"+no+";");
    				}
    				else
    				{
    				wr.append("\n struct2"+no+"[label=\""+temp.campo+" "+temp.dato+"\"];");
    				wr.append("\n struct2"+(no-1)+"->struct2"+no+";");
    				}
    				
    				temp=temp.sig;
    				no++;
    			}
    			
    		}
    		    		
    		nod++;
    		}
    		wr.append("\n }");
      		wr.close();
    		bw.close();
    		reporte(path);    		
    		}
    		
    		catch(IOException ex)
    		{
    			JOptionPane.showMessageDialog(null,"a sucedido un error"+ex);
    		}
    		
      	}
    	
    
    	
    
}