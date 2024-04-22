package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		//realizar un programa solicite, una a una, la introducción
		//de seis notas (double) que serán guardadas en un array
		//tras ello, el programa mostrará los siguientes datos:
		//-Nota media
		//-Nota más alta
		//-Aprobados (cada nota que sea un aprobado)
		double [] notas=new double[6];
		Scanner sc=new Scanner(System.in);
		double media=0;
		double notaAlta=0;
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduce nota:");
			notas[i]=sc.nextDouble();
		}
		//media y nota más alta
		for(double nota:notas) {
			media+=nota;
			//si encuentro una nota más alta que el máximo actual
			//actualizo ese máximo
			if(nota>notaAlta) {
				notaAlta=nota;
			}
			//mostramos nota si es aprobado
			if(nota>=5) {
				System.out.println("Un aprobado: "+nota);
			}
		}
		System.out.println("Nota media: "+media/notas.length);
		System.out.println("Nota más alta: "+notaAlta);
		sc.close();
	}

}
