/**
 * @(#)Jugador.java
 *
 *
 * @author 
 * @version 1.00 2015/2/20
 */


public class Jugador {
	//este es el jugador de plantas
	ListaDatos datos;
	PilaPlantas plantas;
	ColaZombies zombies;	
   int  cantidad;    
    public  Jugador(boolean esZombie,int  cantidad)
    {
    	this.cantidad=cantidad;
    	if(esZombie)
    	{
    	zombies=new ColaZombies();
    	}
    	
    	else
    	{
    	datos= new ListaDatos();
    	plantas= new PilaPlantas();
    	}
    	
    }
    
}