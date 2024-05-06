package View;

import Service.ComunidadesService;
import Service.DatosProvinciasService;

public class Volcado {
	public static void main(String[] args) {
		var comService= new ComunidadesService();
		var provService = new DatosProvinciasService();
		comService.saveComunidades(provService.comunidades());
		comService.saveMunicipios(provService.municipios());
		comService.saveProvincias(provService.provincias());
	}
	

}
