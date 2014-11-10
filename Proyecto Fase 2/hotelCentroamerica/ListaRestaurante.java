package hotelCentroamerica;

public class ListaRestaurante {
	public Restaurante inicio;
	 public Restaurante fin;
	 public Restaurante moverse;
	 private int tamano;
	
	 public ListaRestaurante(){
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

public void agregar(Restaurante nuevo){
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
public Restaurante obtener(int a){
    Restaurante actual = inicio;
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
