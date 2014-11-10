package hotelCentroamerica;

public class Hotel {
Hotel siguiente;
Hotel anterior;
int id;
String nombre;
String pais;
String direccion;
String telefono;
String estado;
ListaHabitacion listaHabitacion = new ListaHabitacion();
ListaCliente listCliente = new ListaCliente();
ListaReservacion listaReservacion = new ListaReservacion();
ListaRestaurante listarestaurante = new ListaRestaurante();
ListaServicio listaservicio = new ListaServicio();
ListaEspera listaespera = new ListaEspera();
ListaCobro cobro = new ListaCobro();
ListaPromocion promocion = new ListaPromocion();
public Hotel(){
	this.siguiente = null;
	this.anterior = null;
}
public Hotel(int id, String nombre, String pais,
		String direccion, String telefono) {
	this.id=id;
	this.nombre = nombre;
	this.pais = pais;
	this.direccion = direccion;
	this.telefono = telefono;
	this.estado = "libre";
	this.siguiente = null;
	this.anterior = null;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}

}
