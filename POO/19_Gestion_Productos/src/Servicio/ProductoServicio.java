package Servicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import Modelo.Productos;

public class ProductoServicio {
	
List <Productos> p= new ArrayList ();

public void eliminarporCategoria(String categoria) {
	Productos p1= new Productos();
	p1.setCategoria(categoria);
	p.removeIf(p -> p1.getCategoria().equals(categoria));
}

public void bajarPrecio(double porcentaje) {
	double descuento= 1 - (porcentaje/100);
	p.forEach(p -> {
    double nuevoPrecio = p.getPrecio() * descuento; 
    p.setPrecio(nuevoPrecio);}
	);
}
public void subirPrecioPorCategoria(double porcentaje,String categoria) {
	double aumento= 1 + (porcentaje/100);
	p.forEach(p-> {if(p.getCategoria().equals(categoria)){
	double nuevoPrecio=p.getPrecio()*aumento;
	p.setPrecio(nuevoPrecio);}});
			}

public void eliminarPorCategoria(String categoria) {
	p.removeIf(p -> p.getCategoria().equals(categoria));
}

public List<Productos> obtenerProductos(){
	return p;
}
	
}

