

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Interfaz.CalculadoraPROXD;
import Interfaz.condicion;

public class ListNumber extends ArrayList<Integer> {
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

public 	Integer first(){
	if(size()==0) {
		return null;
	}
	return this.get(0);
}

public Integer last() {
	int todos= size();
	 if (todos > 0) {
		 return this.get(todos - 1);
	 }
	 return null;
}

public int sum() {
	int suma=0;
	for(Integer num:this) {
		suma+=num;
	}
	return suma;
}

@Override
public boolean add(Integer num){
	if(!this.contains(num)) {
		return super.add(num);
	}
	return false;
}

public void eliminarcondicion(condicion Condicion) {
	//for(Integer i:this){
	//if(Condicion.test(i)) {
		// super.remove(i);
	//}
    //}
	Iterator<Integer> it=iterator();
	while(it.hasNext()) {
		if(Condicion.test(it.next())) {
			it.remove();
		}
	}	
}

public void Calculadora(CalculadoraPROXD Condicion) {
	for(Integer  n:this) {
		Condicion.XDPRO(n); 
			
		}
	}
}


