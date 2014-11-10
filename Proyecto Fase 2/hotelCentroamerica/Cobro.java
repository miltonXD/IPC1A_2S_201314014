package hotelCentroamerica;

public class Cobro {
	Cobro siguiente;
	Cobro anterior;
ListaServicio lista;
Cliente cliente;
public ListaServicio getLista() {
	return lista;
}
public void setLista(ListaServicio lista) {
	this.lista = lista;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

}
