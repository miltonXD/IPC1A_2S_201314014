package hotelCentroamerica;

public class ListaServicio {
	public Servicio inicio;
	 public Servicio fin;
	 public Servicio moverse;
	 private int tamano;
	
	 public ListaServicio(){
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

public void agregar(Servicio nuevo){
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
public Servicio obtener(int a){
    Servicio actual = inicio;
      for(int pos =0;pos<a;pos++){
          if(actual != null){
          actual = actual.siguiente;
          }
          else 
              return null;
      }
    
    return actual;
 }
}
