package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divison {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n1,n2,div;
	try {
	System.out.println("introduce un numero");
	n1= sc.nextInt();
	System.out.println("introduce otro numero");
	n2= sc.nextInt();
	div= n1/n2;
	System.out.println("La division es:" + div);
	catch(InputMismatchException ex) {
	System.out.println("Cabron introduce un numero");	
	}catch(ArithmeticException ex) {
		System.out.println("entre 0 no");
	
	/*Multicatch
	 * }catch(InputMismatchException|ArithmeticException ex) {
		System.out.println("Error");
	}*/
}
}
