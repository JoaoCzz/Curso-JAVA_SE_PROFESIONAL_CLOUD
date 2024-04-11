package principal;

public class main {

	public static void main(String[] args) {
		ListNumber lst= new ListNumber();
		lst.add(20);
		lst.add(30);
		lst.add(10);
		lst.add(20);
		System.out.println(lst.first());
		System.out.println(lst.last());
		System.out.println(lst.sum());



	}

}
