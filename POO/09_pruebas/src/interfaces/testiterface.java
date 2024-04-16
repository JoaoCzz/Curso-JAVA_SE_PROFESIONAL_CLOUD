package interfaces;
interface I1{
	static void print() {
		System.out.println("T1");
	}
}
class C implements I1{
	
}
interface I2 extends I1{
	
}
public class testiterface {
	public static void main(String[] args) {
		//C.print(); No se hereda
		//I2.print(); no se hereda
			I1.print();		
	}

}
