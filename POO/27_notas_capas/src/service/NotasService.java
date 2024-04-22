package service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;

public class NotasService {
	ArrayList<Double> notas=new ArrayList<Double>();
	public void agregarNota(double nota) {
		notas.add(nota);
	}
	public OptionalDouble media() {
		return notas.stream().mapToDouble(n->n).average();
		}
		
	
	public OptionalDouble max() {
		return notas.stream().mapToDouble(n->n).max();
	}
	public OptionalDouble min() {
		
		return notas.stream().mapToDouble(n->n).min();
	}
	public Double[] obtenerNotas() {
		/*double[] todas=new double[notas.size()];
		for(int i=0;i<notas.size();i++) {
			todas[i]=notas.get(i);
		}
		return todas;*/
		return notas.toArray(new Double[0]);
	}
}
