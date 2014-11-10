package hotelCentroamerica;

public class ListaHabitacion{
		 public Habitacion inicio;
		 public Habitacion fin;
		 public Habitacion moverse;
		 private int tamano;
		
		 public ListaHabitacion(){
		        this.inicio= null;
		        this.fin = null;
		        this.tamano = 0;               
		    }
		 
	public boolean vacio()
		    {
		        return(this.inicio == null);
		    }
	public int tamano(){
	    return this.tamano;
	}
	
    public void agregar(Habitacion nuevo){
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
    
    public Habitacion obtener(int a){
	    Habitacion actual = inicio;
	      for(int pos =0;pos<a;pos++){
	          if(actual != null){
	          actual = actual.siguiente;
	          }
	          else 
	              return null;
	      }
		    
		    return actual;
		 }
    public Habitacion buscar(int id){
	    Habitacion temp=inicio;
	    	while(temp!=null){
	    		if (temp.numero==id){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
	    }
    public boolean buscarid(int id){
	    Habitacion temp=inicio;
	    	while(temp!=null){
	    		if (temp.numero==id){
	    			return true;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return false;
	    }
}
