package Model;
import java.time.LocalDateTime;

public class Movimiento {
private double cantidad;
private LocalDateTime fHora;
private String tipoMovimiento;
public double getCantidad() {
	return cantidad;
}
public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}
public LocalDateTime getfHora() {
	return fHora;
}
public void setfHora(LocalDateTime fHora) {
	this.fHora = fHora;
}
public String getTipoMovimiento() {
	return tipoMovimiento;
}
public void setTipoMovimiento(String tipoMovimiento) {
	this.tipoMovimiento = tipoMovimiento;
}
@Override
public String toString() {
	return "Movimiento [cantidad=" + cantidad + ", fHora=" + fHora + ", tipoMovimiento=" + tipoMovimiento + "]";
}
public Movimiento(double cantidad, LocalDateTime fHora, String tipoMovimiento) {
	super();
	this.cantidad = cantidad;
	this.fHora = fHora;
	this.tipoMovimiento = tipoMovimiento;
}
public Movimiento() {
	super();
}



}
