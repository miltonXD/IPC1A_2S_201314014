package hotelCentroamerica;

import java.text.SimpleDateFormat;


public class ListaEspera {
	 public ColaEspera inicio;
	 public ColaEspera fin;
	 public ColaEspera moverse;
	private int tamano;
	
	 public ListaEspera(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
	 
public boolean vacio()
	    {
	        return(this.inicio == null);
	    }

public void agregar(ColaEspera nuevo){
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
public ColaEspera verificar(String inicial,String salida,String tipo){
	 ColaEspera temp=inicio;
	 SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
 	while(temp!=null){
 		if (formato1.format(temp.fechaEntrada).equals(inicial)&&formato1.format(temp.fechaSalida).equals(salida)&&temp.tipohabitacion.equals(tipo)){
 			return temp;
 		}
 		temp=temp.siguiente;
 	}
 	return null;
}
}
