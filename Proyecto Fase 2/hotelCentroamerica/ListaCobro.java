package hotelCentroamerica;

public class ListaCobro {
	 public Cobro inicio;
	 public Cobro fin;
	 public Cobro moverse;
	private int tamano;
	
	 public ListaCobro(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
	 
public boolean vacio()
	    {
	        return(this.inicio == null);
	    }

public void agregar(Cobro nuevo){
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
}
