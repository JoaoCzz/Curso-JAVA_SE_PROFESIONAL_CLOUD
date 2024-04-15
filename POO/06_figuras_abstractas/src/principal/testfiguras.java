package principal;

import java.util.Scanner;

import service.Figura;
import service.circulo;
import service.triangulo;

public class testfiguras {
		public static void main(String[] args) {
			circulo cr= new circulo("amarillo",5);
			triangulo tr= new triangulo ("marron",5,8);
			System.out.println("color: "+ cr.getColor());
			System.out.println("area: "+ cr.area());
			System.out.println("color: "+ tr.getColor());
			System.out.println("area: "+tr.area());
			imprimir(cr);
			imprimir(tr);
			
			
			
	}
public static void imprimir(Figura f) {
	System.out.println("color: "+ f.getColor());
	System.out.println("area: "+f.area());
}

}