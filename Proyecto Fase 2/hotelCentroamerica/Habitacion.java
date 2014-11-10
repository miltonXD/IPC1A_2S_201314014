package hotelCentroamerica;

public class Habitacion {
	Habitacion siguiente;
	Habitacion anterior;
int numero;
int numeroCamas;
String nivel;
String edificio;
String tipo;
String estado;
int precio;
public Habitacion(){
	numero=0;
	numeroCamas=0;
	nivel=" ";
	edificio=" ";
	estado=" ";
	precio=0;
	this.siguiente = null;
	this.anterior = null;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getNumeroCamas() {
	return numeroCamas;
}
public void setNumeroCamas(int numeroCamas) {
	this.numeroCamas = numeroCamas;
}
public String getNivel() {
	return nivel;
}
public void setNivel(String nivel) {
	this.nivel = nivel;
}
public String getEdificio() {
	return edificio;
}
public void setEdificio(String edificio) {
	this.edificio = edificio;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}


}
