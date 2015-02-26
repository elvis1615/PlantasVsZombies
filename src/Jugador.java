/**
 * @(#)Jugador.java
 *
 *
 * @author 
 * @version 1.00 2015/2/20
 */
import java.io.*;

public class Jugador {
	//este es el jugador de plantas
	ListaDatos datos;
	PilaPlantas plantas;
	ColaZombies zombies;	
   int  cantidad;    
    public  Jugador(boolean esZombie)
    {
    	datos= new ListaDatos();
    	if(esZombie)
    	{
    	zombies=new ColaZombies();
    	}
    	
    	else
    	{
    	
    	plantas= new PilaPlantas();
    	}
    	
    }
    
    void grafo(PilaPlantas pila)
    {
    //imprimira el grafo de plantas	
    String graphviz="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    String fileInputPath = "c:\\proyecto\\plantas.txt";
     String fileOutputPath = "c:\\proyecto\\plantas.jpg";
      
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
    
    void grapho(ColaZombies cola)
    {
   	//hara grafo de zombies
   	
   	
    }
    
    
}