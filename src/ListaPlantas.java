/**
 * @(#)ListaPlantas.java
 *
 *
 * @author 
 * @version 1.00 2015/2/21
 */


public class ListaPlantas {
	NodoPlanta inicio;
	NodoPlanta Final;
    
    public ListaPlantas() {
    	inicio=null;
    	Final=null;    	
    }
    
    public boolean estaVacia()
    {
    	if(inicio==null)
    	{
    		return true;
    	}
    	else
    	{
    		return  false;
    	}
    }
    
    void insertar(Plantas planta)
    {
    if(!estaVacia())
    	{
    	Final.next=new NodoPlanta(planta);
    	Final=Final.next;
   	 	}
    else
    	{
    	Final=new NodoPlanta(planta);
    	inicio=Final;
    	
    	}	
	}
    
}