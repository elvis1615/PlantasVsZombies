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
    	Final.sig=new NodoPlanta(planta);
    	Final=fin.sig;
   	 	}
    else
    	{
    	Cabeza=Final=new NodoPlanta(planta);
    	}	
	}
    
}