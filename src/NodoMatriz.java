/**
 * @(#)NodoMatriz.java
 *
 *
 * @author 
 * @version 1.00 2015/2/21
 */


public class NodoMatriz {

	ListaPlantas plantasEnNodo;
	NodoMatriz derecha;
	NodoMatriz Izquierda;
	NodoMatriz abajo;
	NodoMatriz arriba;
	
    public NodoMatriz() {
    	plantasEnNodo=new ListaPlantas();
    	derecha=null;
    	Izquierda=null;
    	abajo=null;
    	arriba=null;
    }
    
    
}