package adaptadores;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import service.DatosProvinciasService;



public class ComboBoxModelComunidadesimpl extends DefaultComboBoxModel{
	List<String> comunidades;
	DatosProvinciasService comunidadesService;
	public ComboBoxModelComunidadesimpl() {
		var ComunidadesService= comunidadesService.comunidades();
		comunidades= ComunidadesService;
		
	}
	
}
