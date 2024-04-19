package pruebas;

import java.util.function.Consumer;

public class PruebaLambda {
	public static void main(String[] args) {
		int a=2;
		Consumer<Integer>con= x ->System.out.println(x+a);
				
				
	}

}
