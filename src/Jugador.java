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
    public Jugador() {
    	datos= new ListaDatos();
    	plantas= new PilaPlantas();
    }
    
    public  Jugador(boolean esZombie)
    {
    	
    	if(esZombie)
    	{
    	zombies=new ColaZombies();
    	}
    	
    }
    
}