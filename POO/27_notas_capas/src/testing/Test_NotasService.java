package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.NotasService;

class Test_NotasService {
	static NotasService service= new NotasService();
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//Añadimos unas cuantas notas de pruebas
		service.agregarNota(5);
		service.agregarNota(8);
		service.agregarNota(1);
		service.agregarNota(6);

		
		
	}

	@Test
	void testMedia() {
		assertEquals(5,service.media());
	}

	@Test
	void testMax() {
		assertEquals(8,service.max());
	}

	@Test
	void testMin() {
		assertEquals(1,service.min());
	}
	@Test
	void testObtenerNotas() {
		assertEquals(4,service.obtenerNotas().length);
		//assertEqu
	}

}
