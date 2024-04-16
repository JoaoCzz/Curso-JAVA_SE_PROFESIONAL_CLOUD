package principal;

import principal.C1.C2;

class C1{
static void print() {
	System.out.println("C1");
}
class C2 extends C1{
	
}

}
public class testclase {
public static void main(String[] args) {
	C2.print();
}
	

}
