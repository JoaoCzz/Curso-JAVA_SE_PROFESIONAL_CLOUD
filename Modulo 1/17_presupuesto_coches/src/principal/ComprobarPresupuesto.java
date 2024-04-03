package principal;

import java.util.Scanner;

public class ComprobarPresupuesto {
	//var m=10; //no
	public static void main(String[] args) {
		
		//var x=2,d=10; //no
		//dado una serie de precios de coches, se le pedirá
		//al cliente cual es su presupuesto y programa indicará
		//a cuantos puede optar
		var precios= new double[]{19_500,23_450,17_300,33_500,25_340,41_800};
		var contador=0;
		var sc=new Scanner(System.in);
		double presupuesto;
		System.out.println("Dime tu presupuesto");
		presupuesto=sc.nextDouble();
		for(var precio:precios) {
			if(presupuesto>=precio) {
				contador++;
			}
		}
		System.out.println("Tienes presupuesto para "+contador+" posibles coches");
		sc.close();
	}

}
