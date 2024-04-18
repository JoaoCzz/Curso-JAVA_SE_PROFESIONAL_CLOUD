package Modelo;

import java.time.LocalDate;

public class Operario extends Empleado {
private int nivel;

public int getNivel() {
	return nivel;
}

public void setNivel(int nivel) {
	this.nivel = nivel;
}

public Operario(int nivel) {
	super();
	this.nivel = nivel;
}

public Operario() {
	super();
}

@Override
public void incentivar() {
	if(nivel>2&&super.getEdad()>=30) {
		super.setSalario(getSalario()+(super.getBono()*2));
	}else if(nivel>2||super.getEdad()>=30) {
		super.setSalario(getSalario()+super.getBono());
	}
	
}

public void actualizarnivel() {
	if(super.getFechaIngreso().plusYears(2).isAfter(LocalDate.now()) &&nivel<5) {
		setNivel(getNivel()+1);
	}
}






}


