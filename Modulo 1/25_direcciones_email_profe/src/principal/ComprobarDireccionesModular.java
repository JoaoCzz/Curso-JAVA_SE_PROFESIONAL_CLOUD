package principal;

public class ComprobarDireccionesModular {

	public static void main(String[] args) {
		String emails="""
				aaa@gmail.com,\
				bbb@tel.es,\
				ccc@gmail.es,\
				ddd@gmail.com,\
				abc@hotmail.com
				""";
		//indicar cuantas direcciones hay de cada dominio
		
		String[] direcciones=emails.split(",");
		
		System.out.println("Direcciones '.es' "+contarDominio("es",direcciones));
		System.out.println("Direcciones '.com' "+contarDominio("com",direcciones));
	}
	
	static int contarDominio(String dominio,String[] dirs) {
		int contador=0;
		for(String dir:dirs) {
			//si la dirección termina en el dominio recibido, incrementamos contador
			if(dir.endsWith(dominio)) {
				contador++;
			}
		}
		return contador;
	}

}
