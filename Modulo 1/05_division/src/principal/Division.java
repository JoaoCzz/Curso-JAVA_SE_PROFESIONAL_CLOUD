package principal;

public class Division {

	public static void main(String[] args) {
		int x=8;
		int y=15;
		//mostrar el resultado de dividir mayor entre menor,
		//respetando cifras decimales
		/*double res;
		if(x>y) {
			res=(double)x/y;
		}else {
			res=(double)y/x;
		}
		System.out.println(res);*/
		if(x>y) {
			System.out.println((double)x/y);
		}else {
			System.out.println((double)y/x);
		}
	}

}
