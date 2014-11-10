package hotelCentroamerica;

import java.util.Date;


public class Reservacion {
	Reservacion siguiente;
	Reservacion anterior;
int CodigoReserva;
Date fechaEntrada;
Date fechaSalida;
private Habitacion habitacion;
private Cliente cliente;
long CostoReserva;
int diasReserva;
public int getCodigoReserva() {
	return CodigoReserva;
}
public void setCodigoReserva(int codigoReserva) {
	CodigoReserva = codigoReserva;
}
public Date getFechaEntrada() {
	return fechaEntrada;
}
public void setFechaEntrada(Date fechaEntrada) {
	this.fechaEntrada = fechaEntrada;
}
public Date getFechaSalida() {
	return fechaSalida;
}
public void setFechaSalida(Date fechaSalida) {
	this.fechaSalida = fechaSalida;
}
public Habitacion getHabitacion() {
	return habitacion;
}
public void setHabitacion(Habitacion habitacion) {
	this.habitacion = habitacion;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public long getCostoReserva() {
	return CostoReserva;
}
public void setCostoReserva(long costoReserva) {
	CostoReserva = costoReserva;
}
public int getDiasReserva() {
	return diasReserva;
}
public void setDiasReserva(int diasReserva) {
	this.diasReserva = diasReserva;
}



}

