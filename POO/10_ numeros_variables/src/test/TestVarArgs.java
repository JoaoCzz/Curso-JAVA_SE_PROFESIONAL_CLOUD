package test;

public class TestVarArgs {
public static void main(String[] args) {
	System.out.println(union("a","b","c","d"));
	System.out.println(union("Hello","Goodbye"));
	System.out.println(union(new String [] {"1","m"}));
}
	


//crear un metodo que devuelva una cadena con la union de todos 
// los textos recibidos como parametros, separandolos por la coma (,)


public static String union(String... data) {
	// los 3 puntos es un array
	StringBuilder builder = new StringBuilder();
	for(String s:data){
	builder.append(s);
	builder.append(",");
}
	return builder.toString();
}
}