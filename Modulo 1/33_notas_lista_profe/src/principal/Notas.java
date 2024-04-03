package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		ArrayList<Integer> notas=new ArrayList<Integer>();
		int nota;
		String respuesta;
		Scanner sc=new Scanner(System.in);
		do {
			//pedir nota, guardarla y preguntar si quiere
			//introducir otra
			System.out.println("Introduce nota");
			nota=Integer.parseInt(sc.nextLine());
			notas.add(nota);
			System.out.println("Quieres introducir otra nota?(s/n)");
			respuesta=sc.nextLine();
			
		}while(respuesta.equalsIgnoreCase("s"));
		System.out.println("Media: "+calcularMedia(notas));
		System.out.println("Aprobados: "+totalAprobados(notas));
		System.out.println("Nota más alta: "+notaMayor(notas));
	}
	static double calcularMedia(ArrayList<Integer> notas) {
		double media=0;
		for(Integer n:notas) {
			media+=n;
		}
		return media/notas.size();
	}
	static int totalAprobados(ArrayList<Integer> notas) {
		int aprobados=0;
		for(Integer n:notas) {
			if(n>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	static int notaMayor(ArrayList<Integer> notas) {
		int mayor=notas.get(0);
		for(Integer n:notas) {
			if(n>mayor) {
				mayor=n;
			}
		}
		return mayor;
	}
}
