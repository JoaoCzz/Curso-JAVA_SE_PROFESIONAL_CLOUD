import Interfaz.CalculadoraPROXD;
import Interfaz.IntefazPro;
import Interfaz.condicion;

/*class Pares implements condicion{
	@Override
	public boolean test(Integer n) {	
		return n%2==0;
	}
}
	
class Impares implements condicion{
	@Override
	public boolean test(Integer n) {
		return n%2!=0;
	}
}
class Cuadrado implements CalculadoraPROXD{

	@Override
	public int XDPRO(Integer n) {
		// TODO Auto-generated method stub
		return n*n;
	}
}
class Mitad implements CalculadoraPROXD{
	@Override
	public int XDPRO(Integer n) {
		return n/2;
	}	
}
class Raiz3 implements CalculadoraPROXD{

	@Override
	public int XDPRO(Integer n) {
		double skeree= Math.sqrt(n.doubleValue());
		return (int) skeree;
	}
	
}*/

public class main {

	public static void main(String[] args) {
		ListNumber lst= new ListNumber();
		lst.add(20);
		lst.add(30);
		lst.add(10);
		lst.add(20);
		lst.eliminarcondicion(n->n%2!=0);
		lst.Calculadora(n->(int)Math.sqrt(n.doubleValue()));
		IntefazPro.sumaporcondicion(lst, n->n<0&&n>-5);0
		System.out.println(lst.first());
		System.out.println(lst.last());
		System.out.println(lst.sum());
		



	}

}

