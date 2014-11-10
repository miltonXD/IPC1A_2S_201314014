package hotelCentroamerica;

public class ListaCliente {
		 public Cliente inicio;
		 public Cliente fin;
		 public Cliente moverse;
		 private int tamano;
		 
		 public ListaCliente(){
		        this.inicio= null;
		        this.fin = null;
		        this.tamano = 0;               
		    }
		 
	public boolean vacio()
		    {
		        return(this.inicio == null);
		    }

	public void agregar(Cliente nuevo){
		 if(vacio())
	     {
	         inicio = nuevo;
	         fin = nuevo;
	         tamano = 1;
	         moverse=inicio;
	     }
	     else{
	         fin.siguiente= nuevo;
	         nuevo.anterior=fin;
	         fin=nuevo;
	         tamano++;
	     }
    }
	public int tamano(){
	    return this.tamano;
	}
	public Cliente buscar(String nit){
	    Cliente temp=inicio;
	    	while(temp!=null){
	    		if (temp.nit.equals(nit)){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
	    }
	public Cliente obtener(int a){
	    Cliente actual = inicio;
	      for(int pos =0;pos<a;pos++){
	          if(actual != null){
	          actual = actual.siguiente;
	          }
	          else 
	              return null;
	      }
	    
	    return actual;
	 }
	public void imprimir()
    {
    	if (vacio()){
			System.out.println("la lista esta Vacia" );
		}
		else{
			Cliente Actual=inicio;
			while(Actual != null){
				System.out.print(Actual.nit+" "+Actual.nombre+" ");
				Actual=Actual.siguiente;
			}
			System.out.println();
		}
    }
	public boolean buscarnit(String nit){
	    Cliente temp=inicio;
	    	while(temp!=null){
	    		if (temp.nit.equals(nit)){
	    			return true;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return false;
	    }
}
