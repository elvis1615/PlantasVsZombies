/**
 * @(#)PilaPlantas.java
 *
 *
 * @author 
 * @version 1.00 2015/2/19
 */


public class PilaPlantas {
	
	private NodoPlanta cima;
	
    public PilaPlantas() {
    	this.cima=null;
    }
    
    public NodoPlanta getCima() {
	return cima;
	}
	
	public void setCima(NodoPlanta cima) {
		this.cima = cima;
	}
	
	public void insertar(Plantas planta)
	{	
		NodoPlanta i=new NodoPlanta(planta);
		i.setNext(this.cima);
		this.cima=i;
	}
	
	public Plantas extraer(){
		Plantas dato=cima.getDato();
		this.cima=cima.getNext();
		return dato;
	}
	
	//VERIFICANDO SI ESTA VACIA
	public boolean estaVacia() {
		if (cima==null) {
		System.out.println("pilavacia");
		return true;
		} else {
		System.out.println("pila no vacia");
		return false;
	}
	}
	
	//CONTANDO DATOS EN LA PILA
	public int contarDatos() {
		int contador=0;
		NodoPlanta hola=cima;
		while (hola!=null) {
			contador++;
			hola=hola.getNext();
		}
			System.out.println("Numero de datos en la pila: "+contador);
			return contador;
		}
    
}