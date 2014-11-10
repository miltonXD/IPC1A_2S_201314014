package hotelCentroamerica;

public class ListaReservacion {
		 public Reservacion inicio;
		 public Reservacion fin;
		 public Reservacion moverse;
		private int tamano;
		
		 public ListaReservacion(){
		        this.inicio= null;
		        this.fin = null;
		        this.tamano = 0;               
		    }
		 
	public boolean vacio()
		    {
		        return(this.inicio == null);
		    }

	public void agregar(Reservacion nuevo){
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
	public Reservacion obtener(int a){
	    Reservacion actual = inicio;
	      for(int pos =0;pos<a;pos++){
	          if(actual != null){
	          actual = actual.siguiente;
	          }
	          else 
	              return null;
	      }
	    
	    return actual;
	 }
	 public boolean eliminar(int num)
	    {
	        Reservacion anterior=null;
	        Reservacion actual=inicio;
	        while(actual!=fin)
	        {
	            if(actual.CodigoReserva==num)
	            {
	                if(anterior==null)
	                { 
	                    inicio=actual.siguiente;
	                    inicio.anterior=null;
	                }
	                else{
	                    anterior.siguiente=actual.siguiente;
	                    Reservacion temporal;
	                    temporal=actual.siguiente;
	                    temporal.anterior=anterior;
	                }
	                return true;
	            }
	            anterior=actual;
	            actual=actual.siguiente;
	        }
	        if(num==fin.CodigoReserva)
	        {
	            fin=actual.anterior;
	            return true;
	        }
	        return false;
	    }
	 public Reservacion buscar(int id){
		    Reservacion temp=inicio;
		    	while(temp!=null){
		    		if (temp.CodigoReserva==id){
		    			return temp;
		    		}
		    		temp=temp.siguiente;
		    	}
		    	return null;
		    }
}
