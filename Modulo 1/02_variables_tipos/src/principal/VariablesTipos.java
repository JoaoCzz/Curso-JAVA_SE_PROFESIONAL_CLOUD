package principal;

public class VariablesTipos {
	static int r; //variables de tipo atributo
	public static void main(String[] args) {
		int s,v,a=10; //variables locales
		System.out.println("La variable a vale "+a);
		s=6;
		System.out.println(s);
		System.out.println(r);
		//int 4b;  //no puede comenzar por un número
		int b4;
		short _r;
		int x=200;
		long z=300;
		boolean bol=true;
		double tr=3.6;
		char w='t';
		//casos especiales
		int car=345_223_345;
		double df=345.55_7;
		float n=4.6f; //los literales decimales son double
		long yq=2323232323232l;//los literales enteros son int, salvo que le pongamos la "l" final
		int bin=0b101;
		System.out.println(bin);
		
	}

}
