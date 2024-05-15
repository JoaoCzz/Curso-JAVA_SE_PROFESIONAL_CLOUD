package adaptadores;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import service.PaisesServiceFactory;

public class ComboBoxModelContinentesimpl extends DefaultComboBoxModel<String> {
	List<String> continentes;
	public ComboBoxModelContinentesimpl() {
		var paisesService=PaisesServiceFactory.getPaisesService();
		continentes=paisesService.getContinentes();
	}
	@Override
	public int getSize() {
		return continentes.size();
	}
	@Override
	public String getElementAt(int index) {
		return continentes.get(index);
	}
	
}
