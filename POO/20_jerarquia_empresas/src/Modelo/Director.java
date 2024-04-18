package Modelo;

import java.time.LocalDate;

public class Director extends Empleado {
private String departamento;
private int personal;

public Director(String departamento, int personal) {
	super();
	this.departamento = departamento;
	this.personal = personal;
}

public String getDepartamento() {
	return departamento;
}

public void setDepartamento(String departamento) {
	this.departamento = departamento;
}

public int getPersonal() {
	return personal;
}

public void setPersonal(int personal) {
	this.personal = personal;
}

@Override
public void incentivar() {
	if(super.getFechaIngreso().plusMonths(3).isAfter(LocalDate.now())&&personal>20) {
		super.setSalario(salario+super.getBono());
	}
	
}


}
