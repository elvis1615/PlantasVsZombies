/**
 * @(#)ColaPlantas.java
 *
 *
 * @author 
 * @version 1.00 2015/2/19
 */


public class ColaZombies {

	
	private  NodoPlanta inicio;
	private NodoPlanta fin;	
		
    public ColaZombies() {
    	
     	inicio=null;
     	fin=null;
     	
    	
    }
    
    public void insertar(Plantas planta)
   	{
    
    NodoPlanta nuevo= new NodoPlanta(planta);
    
    nuevo.setNext(null);
    
    if(inicio==null && fin==null)
    	{
    		inicio=nuevo;
    		fin=nuevo;
    	}
    	else{
    		fin.setNext(nuevo);
			fin=fin.getNext();
    	}
    
    
   	}
   	
   	
    public Plantas extraer(){
    	
    	if(estaVacia()==false)
    	{
    	Plantas planta=inicio.getDato();
		inicio=inicio.getNext();
		return planta;
		}
		else
		{
		System.out.println("la cola esta vacia");
		return  null;
		}
		
	}
	
	public boolean estaVacia(){
		boolean vacia=false;
		if(inicio==null){
		vacia=true;
		System.out.println("La cola esta vacia");
		
		}
		else{
		System.out.println("La cola no esta vacia");
		vacia=false;
		}
		return vacia;
	}
	
	public int contar(){
		int cont=0;
		NodoPlanta c=this.inicio;
		while(c!=null){
		cont++;
		c=c.getNext();
		}
		System.out.println("numero de datos  "+cont);
		return cont;
	}
}