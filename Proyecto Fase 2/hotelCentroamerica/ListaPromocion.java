package hotelCentroamerica;

public class ListaPromocion {
	public Promocion inicio;
	 public Promocion fin;
	 public Promocion moverse;
	private int tamano;
	
	 public ListaPromocion(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
	 
public boolean vacio()
	    {
	        return(this.inicio == null);
	    }

public void agregar(Promocion nuevo){
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
public Promocion buscar(String pais){
    Promocion temp=inicio;
    	while(temp!=null){
    		if (temp.pais.equals(pais)){
    			return temp;
    		}
    		temp=temp.siguiente;
    	}
    	return null;
    }
public void imprimir()
{
	if (vacio()){
		System.out.println("la lista esta Vacia" );
	}
	else{
		Promocion Actual=inicio;
		while(Actual != null){
			System.out.print(Actual.descripcion+" "+Actual.dias+" ");
			Actual=Actual.siguiente;
		}
		System.out.println();
	}
}
}
