package hotelCentroamerica;

public class Cliente {
	Cliente siguiente;
	Cliente anterior;
String nit;
String nombre;
String apellido;

public String getNit() {
	return nit;
}
public void setNit(String nit) {
	this.nit = nit;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
}
