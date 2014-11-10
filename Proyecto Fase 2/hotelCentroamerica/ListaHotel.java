package hotelCentroamerica;



	public class ListaHotel {
		 public Hotel inicio;
		 public Hotel fin;
		 public Hotel moverse;
		private int tamano;
		
		 public ListaHotel(){
		        this.inicio= null;
		        this.fin = null;
		        this.tamano = 0;               
		    }
		 
	public boolean vacio()
		    {
		        return(this.inicio == null);
		    }

	public void agregar(Hotel nuevo){
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
	public void imprimir()
    {
    	if (vacio()){
			System.out.println("la lista esta Vacia" );
		}
		else{
			Hotel Actual=inicio;
			while(Actual != null){
				System.out.print(Actual.id+" "+Actual.nombre+" ");
				Actual=Actual.siguiente;
			}
			System.out.println();
		}
    }
	public Hotel obtener(int a){
	    Hotel actual = inicio;
	      for(int pos =0;pos<a;pos++){
	          if(actual != null){
	          actual = actual.siguiente;
	          }
	          else 
	              return null;
	      }
	    
	    return actual;
	 }
	public Hotel buscar(String nombre){
    Hotel temp=inicio;
    	while(temp!=null){
    		if (temp.nombre.equals(nombre)){
    			return temp;
    		}
    		temp=temp.siguiente;
    	}
    	return null;
    }
	public Hotel buscarPais(String pais){
	    Hotel temp=inicio;
	    	while(temp!=null){
	    		if (temp.pais.equals(pais)){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
	    }
	public Hotel buscar(int id){
	    Hotel temp=inicio;
	    	while(temp!=null){
	    		if (temp.id==id){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
	    }
	public boolean buscarid(int id){
	    Hotel temp=inicio;
	    	while(temp!=null){
	    		if (temp.id==id){
	    			return true;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return false;
	    }
	public boolean buscarnombre(String nombre){
	    Hotel temp=inicio;
	    	while(temp!=null){
	    		if (temp.nombre.equals(nombre)){
	    			return true;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return false;
	    }
 }
