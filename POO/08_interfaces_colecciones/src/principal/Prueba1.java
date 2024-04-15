package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Prueba1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numeroxd= new ArrayList<>();
		numeroxd.add(1);
		numeroxd.add(20);
		numeroxd.add(10);
		System.out.println(sumadepares(numeroxd));
		System.out.println(elmayor(numeroxd));
	}
	public static int sumadepares(List<Integer> integer){
		int sum = 0;
		for(int i=1;integer.size()>i;i++) {
			if(integer.get(i)%2==0) {
				sum+= integer.get(i);				
		}
		}
		return sum;
	}
	
	public static int elmayor(List<Integer> integer) {
		int mayor=0;
		for(int i=1;integer.size()>i;i++) {
			if(integer.get(i)>mayor) {
				mayor=integer.get(i);
			}
	}
	return mayor;

}
	
	public static int media(Collection<Integer> integer) {
		int media=0;
		for(Integer n:integer) {
			media+=n;
		}
		return media/integer.size();
	}
}