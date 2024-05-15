package adaptadores;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Provincia;
import service.DatosProvinciasService;

public class ComboBoxModelProvinciasimpl extends DefaultComboBoxModel{
	List<Provincia> provincias;
	DatosProvinciasService provinciasService;
	public ComboBoxModelProvinciasimpl(String Comunidad) {
		var ProvinciasService= provinciasService.provinciasComunidad(Comunidad);
		provincias= ProvinciasService;
	}
	

}
