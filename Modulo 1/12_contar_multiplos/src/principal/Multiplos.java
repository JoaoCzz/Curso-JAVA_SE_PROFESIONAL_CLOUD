package principal;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		//hacer un programa que solicite dos números
		//y nos diga cuantos múltiplos de 5
		//hay entre ambos números
		//si alguno de los números es negativo, se vuelve
		//a pedir
		Scanner sc=new Scanner(System.in);
		int n1,n2,mayor,menor;
		int contador=0;
		do {
			System.out.println("Introduce un número");
			n1=sc.nextInt();
		}while(n1<0);
		do {
			System.out.println("Introduce otro número");
			n2=sc.nextInt();
		}while(n2<0);
		
		menor=n1>n2?n2:n1;
		mayor=n1>n2?n1:n2;
		for(int i=menor;i<=mayor;i++) {
			if(i%5==0) { //condición para ser múltiplo de 5
				contador++;
			}
		}
		System.out.println("total de múltiplos de 5: "+contador);

	}

}
