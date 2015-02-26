/**
 * @(#)ListaDatos.java
 *
 *
 * @author 
 * @version 1.00 2015/2/20
 */


public class ListaDatos {
	
	NodoDatos Cabeza;
	NodoDatos fin;
	
    public ListaDatos() {
    	Cabeza=null;
    	fin=null;
    	
    }
    
    void insertar(String campo,String dato){
    	
    	if(!estaVacia())
    		{
    			fin.sig=new NodoDatos(campo,dato);
    			fin=fin.sig;
    		}
    	else
    		{
    		Cabeza=fin=new NodoDatos(campo,dato);
    		}
    	
    }
    
    void insertar(String campo)
    {
    	if(!estaVacia())
    		{
    			fin.sig=new NodoDatos(campo);
    			fin=fin.sig;
    			System.out.println("1er insertado");
    		}
    	else
    		{
    		Cabeza=fin=new NodoDatos(campo);
    		System.out.println("insertado");
    		}	
    	
    }
    
    public boolean estaVacia()
    {
    	if(Cabeza==null)
    	{
    		return true;
    	}
    	else
    	{
    		return  false;
    	}
    }
    
    // metodo para insertar
    
    
    
}