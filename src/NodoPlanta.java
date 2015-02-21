/**
 * @(#)NodoPlanta.java
 *
 *
 * @author 
 * @version 1.00 2015/2/19
 */


public class NodoPlanta {
	
	private Plantas dato;
	private NodoPlanta next;
	
    public NodoPlanta(Plantas dato) {
    	this.dato=dato;
    	
    }
    
    public Plantas getDato() {
		return dato;
	}
	
	public void setDato(Plantas dato) {
		this.dato = dato;
	}
	
	public NodoPlanta getNext() {
		return next;
	}
	
	public void setNext(NodoPlanta next) {
		this.next = next;
	}
       
    
}