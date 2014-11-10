package hotelCentroamerica;

import java.util.Date;

public class Promocion {
	Promocion siguiente;
	Promocion anterior;
Date fechaInicio;
Date fechaFinal;
String descripcion;
String pais;
int dias;
int npersonas;
int precio;

public Date getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(Date fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public Date getFechaFinal() {
	return fechaFinal;
}
public void setFechaFinal(Date fechaFinal) {
	this.fechaFinal = fechaFinal;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getDias() {
	return dias;
}
public void setDias(int dias) {
	this.dias = dias;
}
public int getNpersonas() {
	return npersonas;
}
public void setNpersonas(int npersonas) {
	this.npersonas = npersonas;
}

public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}

}
