package principal;

public class SumarHastaMil {

	public static void main(String[] args) {
		//¿hasta que número tengo que sumar, empezando por 1,
		//para llegar a 1000 o superarlo?
		int num=0;
		int suma=0;
		do {
			num++;
			suma+=num;
		}while(suma<1000);
		System.out.println("Para llegar a mil he tenido que sumar hasta "+num);
	}

}
