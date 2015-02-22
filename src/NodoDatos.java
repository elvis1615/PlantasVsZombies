/**
 * @(#)NodoDatos.java
 *
 *
 * @author 
 * @version 1.00 2015/2/20
 */


public class NodoDatos {
	String campo;
	String dato;
	NodoDatos sig;
    
    public NodoDatos(String campo) {
    this.campo=campo;
    
    sig=null;
    }
    
    public NodoDatos(String campo,String dato)
    {
    	this.campo=campo;
    	this.dato=dato;
    	sig=null;
    }
    
	void setDato(String dato)
	{
		this.dato=dato;
	}
    
    
    
}